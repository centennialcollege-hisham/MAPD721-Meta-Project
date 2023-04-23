package com.zero1tech.chat.ui.friends

import androidx.lifecycle.*
import com.example.data.model.RoomModel
import com.example.data.model.State
import com.example.data.model.UserRemote
import com.example.data.repoistory.friends.FriendsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FriendsViewModel @Inject constructor(
    private val friendsRepository: FriendsRepository,
) : ViewModel(), LifecycleObserver {


    private val _errorLiveData = MutableLiveData<Throwable>()
    val errorLiveData: LiveData<Throwable> = _errorLiveData

    private val _loadingLiveData = MutableLiveData(false)
    val loadingLiveData: LiveData<Boolean> = _loadingLiveData


    private var _successFriendsLiveData = MutableLiveData<List<UserRemote>>()
    var successFriendsLiveData: LiveData<List<UserRemote>> = _successFriendsLiveData

    private var _successOtherCountLiveData = MutableLiveData<Long>()
    var successOtherCountLiveData: LiveData<Long> = _successOtherCountLiveData


    init {
        getFriends()
        getOtherCount()
    }


    private fun getFriends() {
        _loadingLiveData.postValue(true)
        try {
            successFriendsLiveData =
                friendsRepository.getFriends().asLiveData(viewModelScope.coroutineContext)
        } catch (e: Exception) {
            _errorLiveData.postValue(e)
        }
        _loadingLiveData.postValue(false)
    }


    private fun getOtherCount() {

        _loadingLiveData.postValue(true)
        try {
            successOtherCountLiveData =
                friendsRepository.getOtherCount().asLiveData(viewModelScope.coroutineContext)

        } catch (e: Exception) {
            _errorLiveData.postValue(e)
        }
        _loadingLiveData.postValue(false)
    }

    fun getButImagesInfo(): UserRemote {
       return friendsRepository.getButImagesInfo()
    }

    fun getButChatInfo(): UserRemote {
       return friendsRepository.getButChatInfo()
    }


}
