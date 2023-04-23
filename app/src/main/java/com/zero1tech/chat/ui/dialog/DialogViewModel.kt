package com.zero1tech.chat.ui.dialog

import android.content.Context
import android.util.Log
import androidx.lifecycle.*
import com.example.data.repoistory.dialogregister.DialogRegisterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.Exception
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

@HiltViewModel
class DialogViewModel @Inject constructor(
    private val dialogRegisterRepository: DialogRegisterRepository
) : ViewModel(), LifecycleObserver {

    fun resisterUserDevice(
        deviceId: String,
        fullName: String,
        age: String,
        from: String,
    ) {
        dialogRegisterRepository.resisterUserDevice(deviceId, fullName, age, from)
    }




}