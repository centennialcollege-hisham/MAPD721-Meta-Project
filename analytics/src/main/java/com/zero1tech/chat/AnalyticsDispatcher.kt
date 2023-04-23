package com.zero1tech.chat

import com.zero1tech.chat.adapters.AnalyticsAdapter
import com.zero1tech.chat.annotations.Analytics
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnalyticsDispatcher @Inject constructor(private val adapters: Set<AnalyticsAdapter>) {

    fun dispatchEvent(eventId: EventId, event: Any) {
        val cls = event::class.java
        val fields = cls.declaredFields
        val data = mutableMapOf<String, Any?>()
        fields.forEach { field ->
            field?.isAccessible = true
            val analytics = field.getAnnotation(Analytics::class.java)
            val name = analytics?.value ?: field.name
            val value = field?.get(event)
            data[name] = value
        }
        adapters.forEach { it.logEvent(eventId, data) }
    }

    fun dispatchEvent(eventId: EventId) {
        adapters.forEach { it.logEvent(eventId) }
    }

    fun dispatchError(id: String, message: String, throwable: Throwable) {
        adapters.forEach { it.logError(id, message, throwable) }
    }

    fun dispatchError(throwable: Throwable) {
        adapters.forEach { it.logError("", throwable.message ?: "", throwable) }
    }

}
