package com.zero1tech.chat.ui.splash

import androidx.lifecycle.*
import com.example.data.model.State
import com.example.data.model.setting.SettingRemote
import com.example.data.repoistory.splash.SplashRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(private val splashRepository: SplashRepository) :
    ViewModel(), LifecycleObserver {

    private val _errorLiveData = MutableLiveData<Throwable>()
    val errorLiveData: LiveData<Throwable> = _errorLiveData

    private val _successSettingLiveData = MutableLiveData<SettingRemote>()
    val successSettingLiveData: LiveData<SettingRemote> = _successSettingLiveData

    init {
        viewModelScope.launch(Dispatchers.IO) {
            getSettings()
        }
    }


    private fun getSettings() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                _successSettingLiveData.postValue(splashRepository.getSettings())
            } catch (e: Exception) {
                _errorLiveData.postValue(e)
            }
        }
    }


}