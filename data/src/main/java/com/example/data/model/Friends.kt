package com.example.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Friends(
    var lastMessage: String? = "",
    var timeStamp: Long? = -1
): Parcelable
