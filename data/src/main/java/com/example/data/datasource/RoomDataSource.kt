package com.example.data.datasource

import android.net.Uri
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.core.constant.*
import com.example.data.common.observeChildEvent
import com.example.data.common.queryObserveChildEvent
import com.example.data.model.LastMessage
import com.example.data.model.Message
import com.example.data.model.RoomModel
import com.example.data.prefs.Prefs
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.Query
import com.google.firebase.storage.StorageReference
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.util.*
import javax.inject.Inject

class RoomDataSource @Inject constructor(
    private val firebaseDatabase: FirebaseDatabase,
    private val prefs: Prefs,
    private val storageReference: StorageReference,
) {
    var imageLink: String? = DEFAULT_IMAGE_ROOM
    private val _successReadMessageLiveData = MutableLiveData<List<Message>>()

    fun sendMessage(tableName: String, message: Message, roomType: String) {
        firebaseDatabase.getReference(KEY_ROOM).child(roomType).child(tableName).child("messages")
            .push()
            .setValue(message)
    }


    fun readMessage(tableName: String, roomType: String): Flow<List<Message>> {
        val query: Query =
            firebaseDatabase.reference
                .child(KEY_ROOM)
                .child(roomType)
                .child(tableName)
                .child("messages")
                .orderByKey()
                .limitToLast(SIZE_PAGINATION_ROOM)
//        } else {
//            firebaseDatabase.reference
//                .child(KEY_ROOM)
//                .child(roomType)
//                .child(tableName)
//                .child("messages")
//                .orderByKey()
//                .endBefore(page)
//                .limitToLast(SIZE_PAGINATION_ROOM)
//        }
        query.get()
//        Log.d("TAG1212", "get readMessage room page :$page ")
        return query.queryObserveChildEvent().map { data ->
            Log.d("TAG1212", "response readMessage: ")
            val chatList = ArrayList<Message>()
            data?.children?.forEach { child ->
                val message = child.getValue(Message::class.java)
                message?.key = child.key
                chatList.add(message ?: Message())
            }
            chatList
        }.catch {
            Log.d("error ", "sad")
            Log.d("TAG1212", "catch readMessage: ")

        }
    }

    fun readMoreMessage(
        tableName: String,
        roomType: String,
        page: String
    ): Flow<ArrayList<Message>> {
        val query: Query = firebaseDatabase.reference
            .child(KEY_ROOM)
            .child(roomType)
            .child(tableName)
            .child("messages")
            .orderByKey()
            .endBefore(page) //todo
            .limitToLast(SIZE_PAGINATION_ROOM)

        query.get()
//        Log.d("TAG1212", "get readMessage room page :$page ")
        return query.queryObserveChildEvent().map { data ->
            Log.d("TAG1212", "response readMessage: ")
            val chatList = ArrayList<Message>()
            data?.children?.forEach { child ->
                val message = child.getValue(Message::class.java)
                message?.key = child.key
                chatList.add(message ?: Message())
            }
            chatList
        }.catch {
            Log.d("error ", "sad")
            Log.d("TAG1212", "catch readMessage: ")

        }

//        query.get().addOnCompleteListener {
//            val list = ArrayList<Message>()
//            Log.d("TAG00", "respone readMessage: size = ${list.size}")
//            it.result.children.forEach { child ->
//                val user = child.getValue(Message::class.java)
//                list.add(user!!)
//            }
//            Log.d("TAG00", "respone readMessage: size = ${list.size}")
//            _successReadMessageLiveData.postValue(list)
//        }
//        return _successReadMessageLiveData
    }


    fun getRoomsPublic(): Flow<List<RoomModel>> {
        return firebaseDatabase.getReference(KEY_ROOM).child(ROOM_PUBLIC_REFERENCE)
            .observeChildEvent().map {
                val rooms = ArrayList<RoomModel>()

                it?.children?.forEach { child ->
                    val room = child.getValue(RoomModel::class.java)
                    rooms.add(room ?: RoomModel())
                }
                rooms
            }.catch {
                Log.e("",it.localizedMessage.toString() + it.message.toString())
            }

    }

    fun getRoomsPrivate(): Flow<List<RoomModel>> {
        return firebaseDatabase.getReference(KEY_ROOM).child(ROOM_PRIVATE_REFERENCE)
            .observeChildEvent().map {
                val rooms = ArrayList<RoomModel>()

                it?.children?.forEach { child ->

                    val room = child.getValue(RoomModel::class.java)
                    if (room?.accessUsers?.contains(prefs.idCurrentUser) == true)
                        rooms.add(room)
                }
                rooms
            }.catch {
                Log.e("firebase_chat", it.message.toString())
            }

    }

    fun saveLastMessage(tableName: String, lastMessage: LastMessage, roomType: String) {
        firebaseDatabase.getReference(KEY_ROOM).child(roomType).child(tableName)
            .child("lastMassage")
            .setValue(lastMessage)
    }

    fun giveAccess(userId: String, tableName: String, roomType: String) {
        val timeCreate = System.currentTimeMillis().toString()
        firebaseDatabase.getReference(KEY_ROOM).child(roomType).child(tableName)
            .child("accessUsers")
            .child(userId)
            .setValue(timeCreate)
    }


    fun leaveRoom(userId: String, roomName: String, roomType: String) {
        firebaseDatabase.getReference(KEY_ROOM).child(roomType).child(roomName)
            .child("accessUsers")
            .child(userId)
            .removeValue()
    }

    fun directDeleteRoom(nameTable: String, roomType: String) {
        firebaseDatabase.getReference(KEY_ROOM).child(roomType).child(nameTable)
            .removeValue()
    }

    fun sendRequestToDelete(nameTable: String) {
        firebaseDatabase.reference.child(REQUEST_DELETE_REFERENCE).child("deleteRoom").push()
            .setValue(nameTable)
    }

    fun handleCreateRoom(
        name: String,
        pathProfilePhoto: Uri?,
        roomType: String,
    ) {
        if (pathProfilePhoto != null) {
            upLoadPhoto(pathProfilePhoto, name, roomType)
        } else {
            createRoom(name, roomType)
        }
    }

    private fun createRoom(
        name: String,
        roomType: String,
    ) {
        addRoom(roomType, name)
        giveAccess(prefs.idCurrentUser.toString(), name, roomType)
        imageLink = DEFAULT_IMAGE_ROOM
    }

    private fun addRoom(roomType: String, name: String) {
        var room =
            RoomModel(
                id = 2,
                icon = imageLink,
                name = name,
                roomType = roomType,
                roomAdmin = prefs.idCurrentUser.toString()
            )
        firebaseDatabase.getReference(KEY_ROOM).child(roomType).child(name)
            .setValue(room)

    }


    fun upLoadPhoto(
        pathProfilePhoto: Uri,
        name: String,
        roomType: String,
    ) {
        var ref: StorageReference = storageReference.child(UUID.randomUUID().toString())

        ref.putFile(pathProfilePhoto).addOnSuccessListener {
            it.metadata?.reference?.downloadUrl?.addOnSuccessListener { url ->
                imageLink = url.toString()
                createRoom(name, roomType)
            }
        }
    }

    fun setTimeAccess(
        roomType: String,
        tableName: String,
        idCurrentUser: String,
        timeStamp: String,
    ) {
        try {
            firebaseDatabase.reference.child("room")
                .child(roomType)
                .child(tableName)
                .child("accessUsers")
                .child(idCurrentUser)
                .setValue(timeStamp)
        } catch (ex: Exception) {

        }

    }

    fun seeLastMessage(
        roomType: String,
        tableName: String,
        idCurrentUser: String,
    ) {
        firebaseDatabase.reference
            .child("room")
            .child(roomType)
            .child(tableName)
            .child("lastMassage")
            .child("usersSee")
            .child(idCurrentUser)
            .setValue(idCurrentUser)
    }
}