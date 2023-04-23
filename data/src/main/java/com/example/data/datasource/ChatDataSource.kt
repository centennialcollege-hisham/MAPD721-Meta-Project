package com.example.data.datasource

import android.util.Log
import com.example.core.constant.*
import com.example.core.extinction.sortID
import com.example.data.common.*
import com.example.data.model.Message
import com.example.data.model.UserRemote
import com.example.data.notification.ApiService
import com.example.data.notification.DataSender
import com.example.data.notification.NotificationResponse
import com.example.data.notification.Sender
import com.example.data.prefs.Prefs
import com.google.firebase.database.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import retrofit2.Call
import retrofit2.Callback
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ChatDataSource @Inject constructor(
    private val firebaseDatabase: FirebaseDatabase,
    private val apiService: ApiService,
    var prefs: Prefs,

    ) {

    fun readMessage(roomId: String, page: String): Flow<List<Message>> {
        val query: Query = if (page == "0") {
            firebaseDatabase.reference
                .child(CHAT_REFERENCE)
                .child(roomId)
                .orderByKey()
                .limitToLast(SIZE_PAGINATION_CHAT)
        } else {
            firebaseDatabase.reference
                .child(CHAT_REFERENCE)
                .child(roomId)
                .orderByKey()
                .endBefore(page)
                .limitToLast(SIZE_PAGINATION_CHAT)
        }
                Log.d("TAG1212", "get readMessage post  page :$page ")

        query.get()
        return query.queryObserveChildEvent().map { data ->
            val chatList = ArrayList<Message>()
            data?.children?.forEach { child ->
                val message = child.getValue(Message::class.java)
                message?.key = child.key
                chatList.add(message ?: Message())
            }
            Log.d("TAG1212", "response readMessage post obse ")
            chatList
        }.catch {
            Log.d("error ", "sad")
        }
    }

    fun sendMessage(message: Message, profile: String, tokenReceiverId: String) {
        firebaseDatabase.reference.child(CHAT_REFERENCE)
            .child(sortID(message.receiverid.toString(), message.senderid.toString())).push()
            .setValue(message)

        sendNotification(message, profile, tokenReceiverId)


    }

    fun savedLastSee(receiverId: String) {
        firebaseDatabase.reference.child(USER_REFERENCE).child(prefs.idCurrentUser.toString())
            .child(FRIENDS_REFERNCE)
            .child(receiverId)
            .child("seeIt")
            .setValue(true)
    }

    fun sendLastMessageAndTimestamp(
        receiverId: String,
        message: String,
    ) {
        firebaseDatabase.reference.child(USER_REFERENCE).child(prefs.idCurrentUser.toString())
            .child(FRIENDS_REFERNCE)
            .child(receiverId)
            .setValue(hashMapMessageTimeStamp(message, receiverId))
        firebaseDatabase.reference.child(USER_REFERENCE).child(receiverId)
            .child(FRIENDS_REFERNCE)
            .child(prefs.idCurrentUser.toString())
            .setValue(hashMapMessageTimeStamp(message, receiverId))


    }


    private fun hashMapMessageTimeStamp(
        message: String,
        reseiverUserId: String
    ): HashMap<String, Any> {

        val hashMap: HashMap<String, Any> = HashMap()
        hashMap["lastMessage"] = message
        hashMap["timeStamp"] = getTimeStamp()
        hashMap["seeIt"] = false
        hashMap["senderLastMessage"] = prefs.currentUser.uid
        hashMap["isBot"] = checkIfBot(reseiverUserId)
        return hashMap
    }

    private fun checkIfBot(reseiverUserId: String): Boolean {
        return reseiverUserId == "1" || reseiverUserId == "2"
    }

    suspend fun getReceiverUser(receiverId: String): UserRemote {
        return firebaseDatabase.getReference(USER_REFERENCE).child(receiverId).awaitsSingle()
            ?.getValue(UserRemote::class.java)!!
    }


    fun addToFriendsForCurrentUser(reseiverUser: UserRemote, message: String) {
        firebaseDatabase.reference.child(USER_REFERENCE).child(prefs.idCurrentUser.toString())
            .child(FRIENDS_REFERNCE)
            .child(reseiverUser.uid).setValue(hashMapMessageTimeStamp(message, reseiverUser.uid))
    }


    suspend fun checkAlreadyHaveRequest(
        reseiverUser: UserRemote,
        currentUser: UserRemote,
    ) {
        val request = firebaseDatabase.getReference(USER_REFERENCE).child(currentUser.uid)
            .child(REQUEST_REFERNCE)
            .child(reseiverUser.uid).awaitsSingle()?.getValue(UserRemote::class.java)

        if (request == null) {
            sendRequest(reseiverUser, currentUser)
        } else {
            deleteFromRequest(reseiverUser)

        }

    }

    private fun sendRequest(reseiverUser: UserRemote, currentUser: UserRemote) {
        firebaseDatabase.getReference(USER_REFERENCE).child(reseiverUser.uid)
            .child(REQUEST_REFERNCE)
            .child(prefs.currentUser.uid)
            .setValue(currentUser)

    }

    fun deleteFromRequest(reseiverUser: UserRemote) {
        val query = firebaseDatabase.reference.child(USER_REFERENCE)
            .child(prefs.idCurrentUser.toString())
            .child(REQUEST_REFERNCE)
            .orderByChild("uid").equalTo(reseiverUser.uid)

        query.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                for (snapshot in snapshot.children) {
                    snapshot.ref.removeValue()
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
    }


    fun checkAlreadyFriends(reseiverID: String): Flow<Boolean> {
        return firebaseDatabase.reference.child(USER_REFERENCE)
            .child(prefs.idCurrentUser.toString())
            .child(FRIENDS_REFERNCE)
            .child(reseiverID)
            .singleChildEvent()
            .map {
                var isFriends = false
                it?.children?.forEach { child ->
                    if (child.exists()) {
                        isFriends = true
                    }
                }
                isFriends
            }
            .catch {
                Log.e("firebase_chat", it.message.toString())
            }

    }

    private fun getTimeStamp(): Long {
        return System.currentTimeMillis()
    }

    private fun hashMapSavedLastSee(): HashMap<String, Any> {
        val hashMap: HashMap<String, Any> = HashMap()
        hashMap["seeIt"] = false
        return hashMap
    }

    fun sendNotification(
        message: Message,
        profile: String,
        tokenReceiverId: String,
    ) {

        val DataSender = DataSender(
            prefs.idCurrentUser.toString(),
            profile,
            message.message.toString(),
            prefs.nameCurrentUser.toString(),
            message.receiverid.toString()
        )

        val sender = Sender(DataSender, tokenReceiverId, "high")



        apiService.sendNotification(sender).enqueue(object : Callback<NotificationResponse> {
            override fun onResponse(
                call: Call<NotificationResponse>,
                response: retrofit2.Response<NotificationResponse>,
            ) {
            }

            override fun onFailure(call: Call<NotificationResponse>, t: Throwable) {
            }
        })


    }
}