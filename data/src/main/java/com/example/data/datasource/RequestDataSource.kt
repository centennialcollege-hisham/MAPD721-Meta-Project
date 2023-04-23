package com.example.data.datasource

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.core.constant.FRIENDS_REFERNCE
import com.example.core.constant.REQUEST_REFERNCE
import com.example.core.constant.USER_REFERENCE
import com.example.data.common.awaitsSingle
import com.example.data.common.observeChildEvent
import com.example.data.common.queryObserveChildEvent
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class RequestDataSource @Inject constructor(
    private val firebaseDatabase: FirebaseDatabase,
    private val prefs: Prefs,
) {


    fun getOtherRequest(): Flow<List<UserRemote>> {
        return firebaseDatabase.getReference(USER_REFERENCE)
            .child(prefs.idCurrentUser.toString())
            .child(REQUEST_REFERNCE)
            .queryObserveChildEvent().map {
                val users = ArrayList<UserRemote>()

                it?.children?.forEach { child ->
                    val user: UserRemote? = child.getValue(UserRemote::class.java)
                    user?.let { it1 -> users.add(it1) }
                }
                users
            }.catch {
                 Log.d("error123", it.message.toString())
            }

    }




}

