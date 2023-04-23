package com.example.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "recent_search")
@Parcelize
data class UserRemote(
    var fullName: String = "",
    @PrimaryKey
    var uid: String = "",
    var profile: String = "",
    var phone: String = "",
    var age: String = "",
    var from: String = "",
    var lastMessage: String = "",
    var timeStamp: Long = 0,
    var token: String = "",
    var nameChanged: String = "No",
    var timeStampRegister: String = "",
    var lastJoin: String = "",
    var seeIt: Boolean = false,
    var senderLastMessage: String = "",
) : Parcelable {
    fun getAgeWithYear() = "$age-year-old"
}