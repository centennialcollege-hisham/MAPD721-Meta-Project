package com.alamarfoods.pathone

import android.app.Activity
import android.app.Application.ActivityLifecycleCallbacks
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.core.annotations.EnableBackButton

import com.zero1tech.chat.AnalyticsDispatcher
import com.zero1tech.chat.EventId
import com.zero1tech.chat.ScreenName
import com.zero1tech.events.ScreenLoadEvent

class LifecycleCallbacks(
    private val dispatcher: AnalyticsDispatcher,
) : ActivityLifecycleCallbacks {

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
//        handleScreenLoadEvent(activity)
//        handleBackButton(activity)

        Log.i("Tracking_Activity", "Created : " + activity.javaClass.simpleName)

    }

    private fun handleScreenLoadEvent(activity: Activity) {
        val screenName = activity.javaClass.getAnnotation(ScreenName::class.java)
        val screen = screenName?.value ?: activity.javaClass.simpleName
        val event = ScreenLoadEvent(screen)
        dispatcher.dispatchEvent(EventId.SCREEN_LOADED, event)
    }

    private fun handleBackButton(activity: Activity) {
        val enableBackButton = activity.javaClass.getAnnotation(EnableBackButton::class.java)
        if (enableBackButton != null) {
            val appCompatActivity = activity as AppCompatActivity
            val actionBar = appCompatActivity.supportActionBar
            actionBar?.setDisplayHomeAsUpEnabled(true)
        }
    }


    override fun onActivityStarted(activity: Activity) {
        Log.i("Tracking_Activity", "Started : " + activity.javaClass.simpleName)
        //do nothing
    }

    override fun onActivityResumed(activity: Activity) {
        Log.i("Tracking_Activity", "Resumed : " + activity.javaClass.simpleName)
    }

    override fun onActivityPaused(activity: Activity) {
        Log.i("Tracking_Activity", "Paused : " + activity.javaClass.simpleName)
    }

    override fun onActivityStopped(activity: Activity) {
        Log.i("Tracking_Activity", "Stopped : " + activity.javaClass.simpleName)
    }

    override fun onActivitySaveInstanceState(activity: Activity, bundle: Bundle) {
        Log.i("Tracking_Activity", "SaveInstanceState : " + activity.javaClass.getSimpleName())
    }

    override fun onActivityDestroyed(activity: Activity) {
        Log.i("Tracking_Activity", "Destroyed : " + activity.javaClass.simpleName)
    }
}
