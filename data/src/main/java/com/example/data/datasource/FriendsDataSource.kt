package com.example.data.datasource

import android.util.Log
import com.example.core.constant.FRIENDS_REFERNCE
import com.example.core.constant.REQUEST_REFERNCE
import com.example.core.constant.USER_REFERENCE
import com.example.data.common.awaitsSingle
import com.example.data.common.observeChildEvent
import com.example.data.common.queryObserveChildEvent
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import com.google.firebase.database.FirebaseDatabase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class FriendsDataSource @Inject constructor(
    private val firebaseDatabase: FirebaseDatabase,
    private val prefs: Prefs,
) {


    fun getFriends(): Flow<List<UserRemote>> {
        return firebaseDatabase.getReference(USER_REFERENCE)
            .child(prefs.idCurrentUser.toString())
            .orderByChild("timeStamp")
            .queryObserveChildEvent().map {
                val currentUser = it?.getValue(UserRemote::class.java)
                if (currentUser != null)
                    prefs.currentUser = currentUser

                val users = ArrayList<UserRemote>()

                it?.child(FRIENDS_REFERNCE)?.children?.forEach { user ->
                    val lastMessage = user.child("lastMessage").value.toString()
                    val timeStamp = user.child("timeStamp").value.toString().toLong()
                    val seeIt = user.child("seeIt").value as Boolean
                    val senderLastMessage = user.child("senderLastMessage").value.toString()
                    val isBot = user.child("isBot").value as Boolean
                    if (!isBot)
                        users.add(
                            getFriendsFromAllUsers(
                                user.key.toString(),
                                lastMessage,
                                timeStamp,
                                seeIt,
                                senderLastMessage
                            )!!
                        )
                }
                users
            }.catch {
                Log.d("error123", it.message.toString())
            }

    }


    private suspend fun getFriendsFromAllUsers(
        userId: String,
        lastMessage: String,
        timeStamp: Long,
        seeIt: Boolean,
        senderLastMessage: String,
    ): UserRemote? {

        val user =
            firebaseDatabase.getReference(USER_REFERENCE)
                .child(userId).awaitsSingle()?.getValue(UserRemote::class.java)

        Log.d("dsd", "dsadsa")
        user?.lastMessage = lastMessage
        user?.timeStamp = timeStamp
        user?.seeIt = seeIt
        user?.senderLastMessage = senderLastMessage
        return user
    }

    fun getOtherCount(): Flow<Long> {//TODO CLEAN AND CONVERT TO single

        return firebaseDatabase.getReference(USER_REFERENCE)

            .child(prefs.idCurrentUser.toString())
            .child(REQUEST_REFERNCE)

            .observeChildEvent().map {
                {

                }
                it?.childrenCount

            }.catch {
                Log.d("dsd", "dsadsa")
            } as Flow<Long>


    }

    fun getButImagesInfo(): UserRemote {
        return UserRemote(
            "Bot Images",
            "2",
        )
    }
    fun getButChatInfo(): UserRemote {
        return UserRemote(
            "Bot Chat",
            "1",
        )
    }


}

