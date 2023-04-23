package com.example.data.model.gpt.image

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ImageResponse(
    val url: String? = null
): Parcelable
