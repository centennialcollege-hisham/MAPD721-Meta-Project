package com.example.data.notification


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Result(
    @Json(name = "message_id")
    var messageId: String? = ""
)