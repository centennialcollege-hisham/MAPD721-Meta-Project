package com.example.data.repoistory.splash

import com.example.data.model.setting.SettingRemote
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SplashRepository @Inject constructor(
    private val firebaseDataSource: FirebaseSettingsDataSource,
    private val localDataSource: LocalSettingsDataSource,
) {

    suspend fun getSettings(): SettingRemote {
        return localDataSource.save(firebaseDataSource.getSetting()!!)
    }



}