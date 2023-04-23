package com.example.data.model.gpt.completion

import com.google.gson.annotations.SerializedName


data class CompletionsRequest(

    @SerializedName("model")
    val model: String,

    @SerializedName("prompt")
    val prompt: String,

    @SerializedName("max_tokens")
    val maxTokens: Int,

    @SerializedName("temperature")
    val temperature: Int,

    )