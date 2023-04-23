package com.zero1tech.chat.common

import android.graphics.Color
import android.graphics.Typeface
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import android.graphics.drawable.Drawable
import android.util.TypedValue

import androidx.core.content.ContextCompat

import android.widget.TextView
import com.zero1tech.chat.R
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("imageUri")
fun setImageUri(imageView: ImageView, uri: String) {
    Glide.with(imageView.context).load(uri).into(imageView)
}

@BindingAdapter("imageUri")
fun ImageView.setImageURI(uri: String) {
    Glide.with(this.context).load(uri).into(this)
}

@BindingAdapter("drawableStartImage")
fun setDrawableStart(view: TextView, isChecked: Boolean) {
    var drawable: Drawable? = null
    if (isChecked)
        drawable = ContextCompat.getDrawable(view.context, R.drawable.ic_like)
    else
        drawable = ContextCompat.getDrawable(view.context, R.drawable.ic_baseline_thumb_up_24)

    view.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, null, null, null)
}

@BindingAdapter("textWithSayHi")
fun textWithSayHi(view: TextView, text: String) {
    if (text.isEmpty())
        view.text = view.context.getString(R.string.say_hi)
    else
        view.text = text
}

@BindingAdapter("styleLastMessage")
fun styleLastMessage(textView: TextView, seeIt: Boolean) {
    if (!seeIt) {
        textView.setTypeface(textView.typeface, Typeface.BOLD);
        textView.setTextColor(Color.parseColor("#FF000000"));//black
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,14f);
    } else {
        textView.setTypeface(textView.typeface, Typeface.NORMAL);
        textView.setTextColor(Color.parseColor("#AD87868A"));//gray
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,12f);

    }
}


@BindingAdapter("joinImage")
fun setJoinDot(imageView: ImageView, isJoin: Boolean) {
    if (isJoin) {
        Glide.with(imageView.context).load(R.drawable.ic_dot_off).into(imageView)
    } else {
        Glide.with(imageView.context).load(R.drawable.ic_dot_on).into(imageView)
    }
}

@BindingAdapter("simpleDate")
fun simpleDateFormat(textView: TextView, timeStamp: String) {
    val sdf = SimpleDateFormat("EEEE hh:mm a")
    val netDate = Date(timeStamp.toLong())
    textView.text = sdf.format(netDate)
}
