package com.zero1tech.chat.ui.room.chat

import android.util.Log
import androidx.lifecycle.*
import com.example.data.model.LastMessage
import com.example.data.model.Message
import com.example.data.repoistory.room.RoomRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RoomChatViewModel @Inject constructor(private val roomRepo: RoomRepo) : ViewModel() {

    private val _errorLiveData = MutableLiveData<Throwable>()
    val errorLiveData: LiveData<Throwable> = _errorLiveData

    private val _loadingLiveData = MutableLiveData(false)
    val loadingLiveData: LiveData<Boolean> = _loadingLiveData

    private val _successMessagesLiveData = MutableLiveData<List<Message>>()
    var successMessageLiveData: LiveData<List<Message>> = _successMessagesLiveData

    private val _successMoreMessagesLiveData = MutableLiveData<List<Message>>()
    var successMoreMessageLiveData = MutableStateFlow(emptyList<Message>())


    fun sendMessage(tableName: String, message: Message, roomType: String) {

        roomRepo.sendMessage(tableName, message, roomType)

    }

    fun readMessage(nameTable: String, roomType: String) {
        _loadingLiveData.postValue(true)
        try {
            successMessageLiveData = roomRepo.readMessage(nameTable, roomType)
                .asLiveData(viewModelScope.coroutineContext)

        } catch (e: Exception) {
            _errorLiveData.postValue(e)
        }
        _loadingLiveData.postValue(false)

    }

    fun readMoreMessage(nameTable: String, roomType: String, page: String) {
        viewModelScope.launch {
            try {
                roomRepo.readMoreMessage(nameTable, roomType, page).buffer().collect {
                    Log.d("TAG00", "readMoreMessage: flow ${it.size}")
                    successMoreMessageLiveData.emit(it)
                }
            } catch (e: Exception) {
                _errorLiveData.postValue(e)
            }
        }
    }


    fun saveLastMessage(tableName: String, lastMessage: LastMessage, roomType: String) {
        roomRepo.saveLastMessage(tableName, lastMessage, roomType)
    }

    fun giveAccess(userId: String, tableName: String, roomType: String) {
        roomRepo.giveAccess(userId, tableName, roomType)
    }


    fun setTimeAccess(
        roomType: String,
        tableName: String,
        idCurrentUser: String,
        timeStamp: String
    ) {

        roomRepo.setTimeAccess(roomType, tableName, idCurrentUser, timeStamp)

    }

    fun seeLastMessage(
        roomType: String,
        tableName: String,
        idCurrentUser: String,
    ) {
        roomRepo.seeLastMessage(roomType,tableName,idCurrentUser)
    }

}
