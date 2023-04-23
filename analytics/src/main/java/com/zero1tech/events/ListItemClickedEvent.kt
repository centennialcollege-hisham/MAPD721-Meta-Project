package com.zero1tech.events

import com.zero1tech.chat.annotations.Analytics


data class ListItemClickedEvent(@Analytics("listName") val listName: String)
