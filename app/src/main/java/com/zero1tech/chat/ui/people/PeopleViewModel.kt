package com.zero1tech.chat.ui.people

import androidx.lifecycle.*
import com.app.di.room.UserDao
import com.example.core.constant.USER_REFERENCE
import com.example.data.model.UserRemote
import com.example.data.repoistory.people.PeopleRepository
import com.google.firebase.database.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PeopleViewModel @Inject constructor(
    private val peopleRepository: PeopleRepository,
    private val userDao: UserDao
) : ViewModel(), LifecycleObserver {

    private val _errorLiveData = MutableLiveData<Throwable>()
    val errorLiveData: LiveData<Throwable> = _errorLiveData

    private val _loadingLiveData = MutableLiveData(true)
    val loadingLiveData: LiveData<Boolean> = _loadingLiveData


    private val _successUsersLiveData = MutableLiveData<List<UserRemote>>()
    var successUsersLiveData: LiveData<List<UserRemote>> = _successUsersLiveData

    private val _successResentSearchLiveData = MutableLiveData<List<UserRemote>>()
    var successResentSearchLiveData: LiveData<List<UserRemote>> = _successResentSearchLiveData

    private val _successSearchUsersLiveData = MutableLiveData<List<UserRemote>>()
    var successSearchUsersLiveData: LiveData<List<UserRemote>> = _successSearchUsersLiveData

    fun getFriends(id: String) {
        _loadingLiveData.postValue(true)
        try {
            successUsersLiveData =
                peopleRepository.getFriends(id)

        } catch (e: Exception) {
            _errorLiveData.postValue(e)
        }
        _loadingLiveData.postValue(false)
    }


    fun searchPeople(str: String) {

        var query: Query =
            FirebaseDatabase.getInstance().reference.child(USER_REFERENCE).orderByChild("fullName")
                .startAt(str)
                .endAt("$str~")

        val list = ArrayList<UserRemote>()
        query.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                snapshot.children.forEach { child ->
                    val user = child.getValue(UserRemote::class.java)
                    user?.let { list.add(it) }

                }
                _successSearchUsersLiveData.postValue(list)

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
    }

    fun addToRecentSearch(userRemote: UserRemote) {
        viewModelScope.launch {
            userDao.insert(userRemote)
        }

    }
    fun deleteFromRecentSearch(userRemote: UserRemote) {
        viewModelScope.launch {
            userDao.deleteFromResentSearch(userRemote)
        }

    }

    fun getResentSearch() {
        viewModelScope.launch {
            successResentSearchLiveData =
                userDao.getRecentSearch().asLiveData(viewModelScope.coroutineContext)
        }
    }
}



