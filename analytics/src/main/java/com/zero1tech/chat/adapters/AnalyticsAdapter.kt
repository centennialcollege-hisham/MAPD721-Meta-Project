package com.zero1tech.chat.adapters

import com.zero1tech.chat.EventId


interface AnalyticsAdapter {

    fun logEvent(eventId: EventId, data: Map<String, Any?>)

    fun logEvent(eventId: EventId)

    fun logError(id: String, message: String, throwable: Throwable)
}
