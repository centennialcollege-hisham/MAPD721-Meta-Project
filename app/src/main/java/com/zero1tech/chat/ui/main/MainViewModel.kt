package com.zero1tech.chat.ui.main

import android.net.Uri
import androidx.lifecycle.*
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import com.example.data.repoistory.main.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository,
    private val prefs: Prefs,
) : ViewModel(), LifecycleObserver {

    private val _haveAccount = MutableLiveData<Boolean>()
    val haveAccount: LiveData<Boolean> = _haveAccount

    private val _successCurrentUserLiveData = MutableLiveData<UserRemote>()
    val successCurrentUserLiveData: LiveData<UserRemote> = _successCurrentUserLiveData


    private var _successReadCities = MutableLiveData<MutableList<String>>()
    var successReadCities: LiveData<MutableList<String>> = _successReadCities


    fun checkHaveAccount() {
        viewModelScope.launch(Dispatchers.IO) {
            if (mainRepository.checkHaveAccountBefore()?.uid?.isNotEmpty() == true) {
                prefs.currentUser = mainRepository.checkHaveAccountBefore()!!
                prefs.nameCurrentUser = mainRepository.checkHaveAccountBefore()!!.fullName
                _haveAccount.postValue(true)
            } else {
                _haveAccount.postValue(false)
            }
        }
    }

    fun getUserToken() {
        mainRepository.getUserToken()
    }

    fun getCurrentUser() {
        viewModelScope.launch(Dispatchers.IO) {
            _successCurrentUserLiveData.postValue(mainRepository.getCurrentUser())
        }
    }


    fun updateProfileImage(pathProfilePhoto: Uri) {
        mainRepository.updateProfile(pathProfilePhoto)
    }

    fun successImageLiveData() = mainRepository.getNewImage()

    fun updateFullName(fullName: String, nameChanged: String) {
        mainRepository.updateFullName(fullName, nameChanged)
    }


    fun updateLastJoin(time: String) {
        mainRepository.updateLastJoin(time)
    }


    fun getCities(currentLanguage: String?) {
        viewModelScope.launch {
            val cities = mainRepository.getCities(currentLanguage)
            _successReadCities.postValue(cities!!)
        }
    }


}
