package com.zero1tech.chat.ui.friends.request

import androidx.lifecycle.*
import com.example.data.model.UserRemote
import com.example.data.repoistory.request.RequestRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RequestViewModel @Inject constructor(
    private val requestRepository: RequestRepository,
) :
    ViewModel(),LifecycleObserver {

    private val _errorLiveData = MutableLiveData<Throwable>()
    val errorLiveData: LiveData<Throwable> = _errorLiveData

    private val _loadingLiveData = MutableLiveData(false)
    val loadingLiveData: LiveData<Boolean> = _loadingLiveData

    private var _successOtherUserLiveData = MutableLiveData<List<UserRemote>>()
    var successOtherUserLiveData: LiveData<List<UserRemote>> = _successOtherUserLiveData


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        getOtherUsers()
    }

    fun getOtherUsers() {

        _loadingLiveData.postValue(true)
        try {
            successOtherUserLiveData = requestRepository.getOtherUsers()
                .asLiveData(viewModelScope.coroutineContext)

        } catch (e: Exception) {
            _errorLiveData.postValue(e)
        }
        _loadingLiveData.postValue(false)

    }

}



