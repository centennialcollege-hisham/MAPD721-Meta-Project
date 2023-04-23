package com.example.data.repoistory.people

import androidx.lifecycle.MutableLiveData
import com.example.data.model.UserRemote
import com.example.data.datasource.PeopleDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PeopleRepository @Inject constructor(
    private val peopleDataSource: PeopleDataSource,

) {
   fun getFriends(id:String): MutableLiveData<List<UserRemote>> {
        return peopleDataSource.getFriends(id)
    }
    fun searchPeople(str:String): Flow<List<UserRemote>> {
        return peopleDataSource.getSearchPeople(str)
    }
}


