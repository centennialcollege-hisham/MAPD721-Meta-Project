package com.example.data.model.gpt.image

import com.google.gson.annotations.SerializedName


data class ImagesGenerationsResponse(

    @SerializedName("created")
    val created: Long,

    @SerializedName("data")
    val images: List<ImageResponse>

)
