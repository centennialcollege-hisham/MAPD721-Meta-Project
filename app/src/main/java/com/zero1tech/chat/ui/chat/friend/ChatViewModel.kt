package com.zero1tech.chat.ui.chat.friend

import androidx.lifecycle.*
import com.example.data.model.Message
import com.example.data.model.UserRemote
import com.example.data.repoistory.chat.ChatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ChatViewModel @Inject constructor(private val chatRepository: ChatRepository) : ViewModel() {

    private val _errorLiveData = MutableLiveData<Throwable>()
    val errorLiveData: LiveData<Throwable> = _errorLiveData

    private val _loadingLiveData = MutableLiveData(false)
    val loadingLiveData: LiveData<Boolean> = _loadingLiveData

    private val _successReadMessageLiveData = MutableLiveData<List<Message>>()
    var successReadMessageLiveData: LiveData<List<Message>> = _successReadMessageLiveData


    private val _successReceiverUserLiveData = MutableLiveData<UserRemote>()
    var successReceiverUserLiveData: LiveData<UserRemote> = _successReceiverUserLiveData

    private val _successCheckAlreadyFriendsLiveData = MutableLiveData<Boolean>()
    var successCheckAlreadyFriendsLiveData: LiveData<Boolean> = _successCheckAlreadyFriendsLiveData

    fun sendMessage(message: Message, profile: String, tokenReceiverId: String) {
        viewModelScope.launch {
            _loadingLiveData.postValue(true)
            try {
                chatRepository.sendMessage(message, profile, tokenReceiverId)
            } catch (e: Exception) {
                _errorLiveData.postValue(e)
            }
            _loadingLiveData.postValue(false)

        }
    }

    fun readMessage(roomID: String, page: String) {
        _loadingLiveData.postValue(true)
        try {
            successReadMessageLiveData =
                chatRepository.readMessage(roomID,page).asLiveData(viewModelScope.coroutineContext)
        } catch (e: Exception) {
            _errorLiveData.postValue(e)
        }
        _loadingLiveData.postValue(false)
    }

    fun getReceiverUser(receiverID: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _loadingLiveData.postValue(true)
            try {
                _successReceiverUserLiveData.postValue(chatRepository.getReceiverUser(receiverID))


            } catch (e: Exception) {
                _errorLiveData.postValue(e)
            }
            _loadingLiveData.postValue(false)
        }
    }

    fun deleteFromRequestAndAddToFriends(
        receiverUser: UserRemote,
        message: String,
    ) {
        chatRepository.deleteFromRequestAndAddToFriends(receiverUser, message)
    }

    fun sendLastMessageAndTimestamp(receiverID: String, message: String) {
        chatRepository.sendLastMessageAndTimestamp(receiverID, message)

    }

    fun processRequest(user: UserRemote, currentUser: UserRemote, message: String) {
        viewModelScope.launch(Dispatchers.IO) {
            chatRepository.processRequest(user, currentUser, message)
        }
    }

    fun checkAlreadyFriends(receiverID: String) {
        _loadingLiveData.postValue(true)
        try {
            successCheckAlreadyFriendsLiveData =
                chatRepository.checkAlreadyFriends(receiverID)
                    .asLiveData(viewModelScope.coroutineContext)
        } catch (e: Exception) {
            _errorLiveData.postValue(e)
        }
        _loadingLiveData.postValue(false)

    }

    fun savedLastSee(receiverID: String) {
        chatRepository.savedLastSee(receiverID)
    }
}
