package com.example.data.model.gpt.image

import com.google.gson.annotations.SerializedName


data class ImagesGenerationsRequest(

    @SerializedName("prompt")
    val prompt: String,

    @SerializedName("n")
    val number: Int,

    @SerializedName("size")
    val size: String,


    )
