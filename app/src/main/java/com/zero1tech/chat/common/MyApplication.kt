package com.zero1tech.chat.common

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.ProcessLifecycleOwner
import androidx.preference.PreferenceManager
import com.alamarfoods.pathone.LifecycleCallbacks
import com.example.core.Languages
import com.example.core.util.Settings
import com.example.data.prefs.Prefs
import com.vanniktech.emoji.EmojiManager
import com.vanniktech.emoji.google.GoogleEmojiProvider
import com.zero1tech.chat.AnalyticsDispatcher
import com.zero1tech.chat.R
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class MyApplication : Application() {

    @Inject
    lateinit var prefs: Prefs

    @Inject
    lateinit var analyticsDispatcher: AnalyticsDispatcher

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(Languages.setLocale(base))
    }

    override fun onCreate() {
        super.onCreate()
        setDefaultTheme()
        initActivityLifecycle()
        ProcessLifecycleOwner.get().lifecycle.addObserver(AppLifecycleObserver(prefs))
        installEmojiManger()

    }

    private fun installEmojiManger() {
        EmojiManager.install(GoogleEmojiProvider())
    }

    private fun setDefaultTheme() {
        PreferenceManager.setDefaultValues(this, R.xml.settings, true)
        val mode = Settings.getNightMode(this)
        AppCompatDelegate.setDefaultNightMode(mode)
    }

    private fun initActivityLifecycle() {
        registerActivityLifecycleCallbacks(LifecycleCallbacks(analyticsDispatcher))
    }


}