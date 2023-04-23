package com.example.core.extinction

import android.annotation.SuppressLint
import android.content.Context
import android.provider.Settings
import android.text.format.DateFormat
import android.view.View
import android.widget.EditText
import com.example.core.util.SafeClickListener
import java.util.*

const val isEmpty = false


@SuppressLint("HardwareIds")
fun getDeviceId(context: Context): String {
    return Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
}


fun EditText.getString() = text.toString().trim()
fun EditText.getTexts() = text.toString()
fun EditText.isEmpty() = text.toString().trim().isEmpty() || text.toString() == ""
fun String.checkEmpty() = this.isEmpty() || this == ""

fun createdDateFormatted(time: String): String {
    var cal: Calendar = Calendar.getInstance(Locale.ENGLISH)
    cal.timeInMillis = (time.toLong()) * 1000L

    return DateFormat.format("hh:mm a", cal).toString()
}

fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
    val safeClickListener = SafeClickListener {
        onSafeClick(it)
    }
    setOnClickListener(safeClickListener)
}

fun sortID(receiverUser: String, idCurrentUser: String): String {
    val mergedId = receiverUser + idCurrentUser
    val tempArray = mergedId.toCharArray()
    Arrays.sort(tempArray)
    return String(tempArray)
}
