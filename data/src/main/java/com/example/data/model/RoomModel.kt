package com.example.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RoomModel(
    val id: Int? = -1,
    val icon: String?="",
    val name: String?="",
    val lastMassage: LastMessage?=LastMessage(),
    val key :String="",
    val accessUsers :HashMap<String,String>?=null,
    val roomType:String="",
    val roomAdmin:String=""
):Parcelable