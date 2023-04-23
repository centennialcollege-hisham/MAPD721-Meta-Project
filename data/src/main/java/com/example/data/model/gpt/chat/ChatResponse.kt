package com.example.data.model.gpt.chat

import com.google.gson.annotations.SerializedName


data class ChatResponse(

    @SerializedName("id")
    val id: String,

    @SerializedName("object")
    val objectName: String,

    @SerializedName("created")
    val created: Long,

    @SerializedName("model")
    val model: String,

    @SerializedName("choices")
    val choices: List<ChoicesResponse>,

    )