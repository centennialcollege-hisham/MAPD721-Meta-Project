package com.example.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LastMessage(
    val message : String?="",
    val senderName:String?="",
    val timeMessage:String?="",
    val usersSee:HashMap<String,String>?=null
): Parcelable