package com.example.data.repoistory.room

import android.net.Uri
import androidx.lifecycle.MutableLiveData
import com.example.core.constant.*
import com.example.data.model.Message
import com.example.data.model.RoomModel
import com.example.data.datasource.RoomDataSource
import com.example.data.model.LastMessage
import com.google.firebase.database.*
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RoomRepo @Inject constructor(
    val database: FirebaseDatabase,

    private val dataSource: RoomDataSource,
) {
    var imageLink: String? = DEFAULT_IMAGE_ROOM

    private val _successRoomsLiveData = MutableLiveData<List<RoomModel>>()
    val successRoomLiveData: MutableLiveData<List<RoomModel>> = _successRoomsLiveData


    fun sendMessage(tableName: String, message: Message, roomType: String) {
        dataSource.sendMessage(tableName, message, roomType)
    }

    fun readMessage(tableName: String, roomType: String): Flow<List<Message>> {
        return dataSource.readMessage(tableName, roomType)
    }

    fun readMoreMessage(
        tableName: String,
        roomType: String,
        page: String
    ): Flow<ArrayList<Message>> {
        return dataSource.readMoreMessage(tableName, roomType, page)
    }

    fun getRoomsPublic(): Flow<List<RoomModel>> {
        return dataSource.getRoomsPublic()
    }

    fun getRoomsPrivate(): Flow<List<RoomModel>> {
        return dataSource.getRoomsPrivate()
    }

    fun saveLastMessage(tableName: String, lastMessage: LastMessage, roomType: String) {
        dataSource.saveLastMessage(tableName, lastMessage, roomType)
    }

    fun giveAccess(userId: String, tableName: String, roomType: String) {
        dataSource.giveAccess(userId, tableName, roomType)
    }

    fun leaveRoom(userId: String, roomName: String, roomType: String) {
        dataSource.leaveRoom(userId, roomName, roomType)
    }

    fun createRoom(
        name: String, pathProfilePhoto: Uri?, roomType: String,
    ) {
        dataSource.handleCreateRoom(name, pathProfilePhoto, roomType)
    }

    fun directDeleteRoom(nameTable: String, roomType: String) {
        dataSource.directDeleteRoom(nameTable, roomType)
    }

    fun sendRequestToDelete(nameTable: String) {
        dataSource.sendRequestToDelete(nameTable)
    }


    fun setTimeAccess(
        roomType: String,
        tableName: String,
        idCurrentUser: String,
        timeStamp: String
    ) {

        dataSource.setTimeAccess(roomType, tableName, idCurrentUser, timeStamp)

    }

    fun seeLastMessage(
        roomType: String,
        tableName: String,
        idCurrentUser: String,
    ) {
        dataSource.seeLastMessage(roomType,tableName,idCurrentUser)
    }

}