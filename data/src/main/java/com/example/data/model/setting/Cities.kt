package com.example.data.model.setting

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Cities(
    var arabic: MutableList<String>? = mutableListOf(),
    var english: MutableList<String>? = mutableListOf(),
) : Parcelable