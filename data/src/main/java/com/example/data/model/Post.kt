package com.example.data.model

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Parcelable
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.example.data.R
import com.google.android.material.internal.ContextUtils.getActivity
import kotlinx.parcelize.Parcelize
import android.os.Build
import com.google.firebase.database.Exclude


@Parcelize
data class Post(
    var id: String? = null,
    var title: String? = null,
    var date: String? = null,
    var message: String? = null,
    var likeCount: Int? = 0,
    var shareCount: Int? = 0,
    var userId: String? = null,
    var image: String? = null,
    var isChecked: Boolean? = false,
    var likeIsVisible: Boolean? = false,
    var shareIsVisible: Boolean? = false,
    var likeId: MutableList<String>? = mutableListOf(),
    var shareId: MutableList<String>? = mutableListOf(),
    var hideId: MutableList<String>? = mutableListOf(),


    ) : Parcelable {


}