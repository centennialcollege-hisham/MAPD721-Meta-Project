package com.example.data.repoistory.splash

import com.example.data.model.setting.SettingRemote
import com.example.data.prefs.Prefs
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalSettingsDataSource @Inject constructor(private val prefs: Prefs) {
    fun save(settings: SettingRemote): SettingRemote {
        prefs.settings = settings
        return settings
    }
}
