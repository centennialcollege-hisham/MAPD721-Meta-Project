package com.zero1tech.events

import com.zero1tech.chat.annotations.Analytics


open class ApiLoadedEvent(@Analytics("apiName") val name: String)
