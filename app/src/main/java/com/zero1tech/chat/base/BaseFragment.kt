package com.zero1tech.chat.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.zero1tech.chat.AnalyticsDispatcher
import com.zero1tech.chat.EventId
import com.zero1tech.chat.ScreenName
import com.zero1tech.events.ScreenLoadEvent
import javax.inject.Inject


abstract class BaseFragment() : Fragment() {

    @Inject
    lateinit var dispatcher: AnalyticsDispatcher

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val screenName = this.javaClass.getAnnotation(ScreenName::class.java)
        val screen = screenName?.value ?: this.javaClass.simpleName
        val event = ScreenLoadEvent(screen)
        dispatcher.dispatchEvent(EventId.SCREEN_LOADED, event)
    }


}