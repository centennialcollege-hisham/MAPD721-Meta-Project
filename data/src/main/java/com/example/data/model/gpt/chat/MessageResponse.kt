package com.example.data.model.gpt.chat

import com.google.gson.annotations.SerializedName

data class MessageResponse(

    @SerializedName("role")
    val role: String,

    @SerializedName("content")
    val content: String
)
