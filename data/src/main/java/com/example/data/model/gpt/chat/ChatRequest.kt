package com.example.data.model.gpt.chat

import com.google.gson.annotations.SerializedName

data class ChatRequest(

    @SerializedName("model")
    val model: String,

    @SerializedName("messages")
    val messages: List<MessageRequest>

)