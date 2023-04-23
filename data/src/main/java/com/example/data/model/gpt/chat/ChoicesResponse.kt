package com.example.data.model.gpt.chat

import com.google.gson.annotations.SerializedName

data class ChoicesResponse(

    @SerializedName("message")
    val message: MessageResponse,

    @SerializedName("finish_reason")
    val finishReason: String,

    )
