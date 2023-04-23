package com.example.data.model

import android.os.Parcelable
import com.example.data.model.gpt.image.ImageResponse
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Message(

    var senderid: String? = "",
    var receiverid: String? = "",
    var message: String? = "",
    var time: String? = "",
    var senderName: String? = "",
    var timeStamp: Long? = 0,
    var key: String? = "",
    var messages: List<ImageResponse> = listOf(),

) : Parcelable {


}
