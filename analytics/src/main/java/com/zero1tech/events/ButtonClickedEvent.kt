package com.zero1tech.events

import com.zero1tech.chat.annotations.Analytics


open class ButtonClickedEvent(
    @Analytics("buttonName")
    val name: String
)
