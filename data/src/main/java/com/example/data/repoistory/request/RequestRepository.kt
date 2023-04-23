package com.example.data.repoistory.request

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.data.datasource.RequestDataSource
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RequestRepository @Inject constructor(
    private val requestDataSource: RequestDataSource
) {

    fun getOtherUsers(): Flow<List<UserRemote>> {
       return requestDataSource.getOtherRequest()
    }



}
