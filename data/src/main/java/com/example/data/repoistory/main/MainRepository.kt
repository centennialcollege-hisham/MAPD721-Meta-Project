package com.example.data.repoistory.main

import android.net.Uri
import com.example.data.datasource.MainDataSource
import com.example.data.model.UserRemote
import com.example.data.model.setting.Cities
import kotlinx.coroutines.flow.Flow
import java.util.ArrayList
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository @Inject constructor(
    private val mainDataSource: MainDataSource,
) {
    suspend fun checkHaveAccountBefore(): UserRemote? {
        return mainDataSource.checkHaveAccountBefore()
    }

    fun getUserToken() {
        mainDataSource.getUserToken()
    }

    suspend fun getCurrentUser(): UserRemote? {
        return mainDataSource.getCurrentUser()
    }

    fun getNewImage() = mainDataSource.successImageLiveData

    fun updateProfile(pathProfilePhoto: Uri) {
        mainDataSource.updateProfile(pathProfilePhoto)
    }

    fun updateFullName(fullName: String, nameChanged: String) {
        mainDataSource.updateFullName(fullName, nameChanged)
    }

    fun updateLastJoin(time: String) {
        mainDataSource.updateUserLastJoin(time)
    }


     suspend fun getCities(currentLanguage: String?): MutableList<String>? {
        return mainDataSource.getCities(currentLanguage)
    }


}
