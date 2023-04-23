package com.example.core.util

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.core.R


@BindingAdapter("loadImageUrl")
fun setImageUrl(view: ImageView, url: String) {

        Glide
            .with(view.context)
            .load(url)
            .into(view)

}


