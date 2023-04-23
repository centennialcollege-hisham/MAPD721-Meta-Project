package com.zero1tech.events

import com.zero1tech.chat.annotations.Analytics


data class ScreenLoadEvent(
    @Analytics("screenName")
    val screenName: String
)
