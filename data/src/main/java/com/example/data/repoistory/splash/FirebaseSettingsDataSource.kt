package com.example.data.repoistory.splash

import com.example.data.common.awaitsSingle
import com.example.data.model.setting.SettingRemote
import com.google.firebase.database.FirebaseDatabase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FirebaseSettingsDataSource @Inject constructor(private val firebaseDatabase: FirebaseDatabase) {

    suspend fun getSetting(): SettingRemote? {
        return firebaseDatabase.reference.child(SETTING_REFERENCE)
            .awaitsSingle()
            ?.getValue(SettingRemote::class.java)
    }

    private companion object {
        private const val SETTING_REFERENCE = "Setting"
    }
}
