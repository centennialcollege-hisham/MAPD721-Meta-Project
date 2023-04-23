package com.zero1tech.chat.common

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import com.example.data.prefs.Prefs

class AppLifecycleObserver(var prefs: Prefs) : LifecycleObserver {


    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onEnterForeground() {
        prefs.isBackground = false
        Log.i("AppLifecycleObserver", "onEnterForeground")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onEnterBackground() {
        prefs.isBackground = true
        Log.i("AppLifecycleObserver", "onEnterBackground")
    }
}