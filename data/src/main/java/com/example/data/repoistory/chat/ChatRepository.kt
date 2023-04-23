package com.example.data.repoistory.chat

import com.example.data.datasource.ChatDataSource
import com.example.data.model.Message
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class ChatRepository @Inject constructor(
    var prefs: Prefs,
    private val dataSource: ChatDataSource,
) {

    fun readMessage(roomId: String, page: String): Flow<List<Message>> {
        return dataSource.readMessage(roomId, page)
    }

    fun sendMessage(message: Message, profile: String = "", tokenReceiverId: String = "") {
        dataSource.sendMessage(message, profile, tokenReceiverId)
    }

    suspend fun getReceiverUser(receiverId: String): UserRemote? {
        return dataSource.getReceiverUser(receiverId)
    }

    suspend fun processRequest(reseiverUser: UserRemote, currentUser: UserRemote, message: String) {
        dataSource.addToFriendsForCurrentUser(reseiverUser, message)
        dataSource.checkAlreadyHaveRequest(reseiverUser, currentUser)
    }

    fun sendLastMessageAndTimestamp(reseiverID: String, message: String) {
        dataSource.sendLastMessageAndTimestamp(reseiverID, message)
    }

    fun deleteFromRequestAndAddToFriends(
        receiverUser: UserRemote,
        message: String,
    ) {
        dataSource.sendLastMessageAndTimestamp(receiverUser.uid, message)
        dataSource.deleteFromRequest(receiverUser)
    }

    fun checkAlreadyFriends(reseiverID: String): Flow<Boolean> {
        return dataSource.checkAlreadyFriends(reseiverID)
    }

    fun savedLastSee(receiverID: String) {
        dataSource.savedLastSee(receiverID)
    }

    companion object {
        const val TAG = "ChatRepo"
    }
}

