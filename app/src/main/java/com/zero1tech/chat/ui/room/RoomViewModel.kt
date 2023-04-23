package com.zero1tech.chat.ui.room

import android.net.Uri
import androidx.lifecycle.*
import com.example.data.model.RoomModel
import com.example.data.repoistory.room.RoomRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RoomViewModel @Inject constructor(private val roomRepo: RoomRepo) : ViewModel(),
    LifecycleObserver {

    private val _errorLiveData = MutableLiveData<Throwable>()
    val errorLiveData: LiveData<Throwable> = _errorLiveData

    private val _loadingLiveData = MutableLiveData(false)
    val loadingLiveData: LiveData<Boolean> = _loadingLiveData

    private var _successRoomPublicLiveData = MutableLiveData<List<RoomModel>>()
    var successRoomPublicLiveData: LiveData<List<RoomModel>> = _successRoomPublicLiveData

    private var _successRoomNamePublicLiveData = MutableLiveData<List<RoomModel>>()
    var successRoomNamePublicLiveData: LiveData<List<RoomModel>> = _successRoomNamePublicLiveData


    private var _successRoomPrivateLiveData = MutableLiveData<List<RoomModel>>()
    var successRoomPrivateLiveData: LiveData<List<RoomModel>> = _successRoomPrivateLiveData


    init {
        getRoomsPrivate()
        getRoomsPublic()
    }

     private fun getRoomsPublic() {

        _loadingLiveData.postValue(true)
        try {

            successRoomPublicLiveData =
                roomRepo.getRoomsPublic().asLiveData(viewModelScope.coroutineContext)
        } catch (e: Exception) {
            _errorLiveData.postValue(e)
        }
        _loadingLiveData.postValue(false)

    }


    fun getRoomsNamesPublic() {

        _loadingLiveData.postValue(true)
        try {

            successRoomNamePublicLiveData =
                roomRepo.getRoomsPublic().asLiveData(viewModelScope.coroutineContext)
        } catch (e: Exception) {
            _errorLiveData.postValue(e)
        }
        _loadingLiveData.postValue(false)

    }



     private fun getRoomsPrivate() {

        _loadingLiveData.postValue(true)
        try {

            successRoomPrivateLiveData =
                roomRepo.getRoomsPrivate().asLiveData(viewModelScope.coroutineContext)
        } catch (e: Exception) {
            _errorLiveData.postValue(e)
        }
        _loadingLiveData.postValue(false)

    }

    fun addPublicRoom(name: String, pathProfilePhoto: Uri?,roomType: String) {
        roomRepo.createRoom(name, pathProfilePhoto,roomType)
    }

    fun giveAccess(userId: String, tableName: String,roomType: String) {
        roomRepo.giveAccess(userId, tableName,roomType)
    }

    fun leaveRoom(userId: String,roomName: String, roomType: String) {
        roomRepo.leaveRoom(userId,roomName,roomType)
    }

    fun deleteRoom(nameTable: String, numberUsersInRoom: Int,roomType: String) {
        if (numberUsersInRoom > 20) {
            roomRepo.sendRequestToDelete(nameTable)
        } else {
            roomRepo.directDeleteRoom(nameTable,roomType)
        }
    }

}