package com.zero1tech.chat.adapters

import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.zero1tech.chat.EventId
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FirebaseAnalyticsAdapter @Inject constructor(
    private val firebaseAnalytics: FirebaseAnalytics,
    private val firebaseCrashlytics: FirebaseCrashlytics
) : AnalyticsAdapter {

    override fun logEvent(eventId: EventId, data: Map<String, Any?>) {
        val bundle = Bundle()
        data.forEach { bundle.putString(it.key, it.value.toString()) }
        firebaseAnalytics.logEvent(eventId.value, bundle)
    }

    override fun logEvent(eventId: EventId) {
        firebaseAnalytics.logEvent(eventId.value, Bundle())
    }

    override fun logError(id: String, message: String, throwable: Throwable) {
        firebaseCrashlytics.recordException(throwable)
    }
}
