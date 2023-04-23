package com.example.core.util

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import java.lang.Exception
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*

fun getTimeAgo(time: Long): String {
    var time = time
    if (time < 1000000000000L) {
        // if timestamp given in seconds, convert to millis
        time *= 1000
    }
    val now: Long = System.currentTimeMillis()
    if (time > now || time <= 0) {
        return ""
    }

    val diff: Long = now - time
    when {
        diff < MINUTE_MILLIS -> {
            return if (diff / SECOND_MILLIS < 10) {
                "now"
            } else
                (diff / SECOND_MILLIS).toString() + " s  ago"
        }
        diff < 2 * MINUTE_MILLIS -> {
            return "a minute ago"
        }
        diff < 50 * MINUTE_MILLIS -> {
            return (diff / MINUTE_MILLIS).toString() + " minute ago"
        }
        diff < 90 * MINUTE_MILLIS -> {
            return "an hour ago"
        }
        diff < 24 * HOUR_MILLIS -> {
            return (diff / HOUR_MILLIS).toString() + " hours ago"
        }
        diff < 48 * HOUR_MILLIS -> {
            return "yesterday"
        }
        else -> {
            return (diff / DAY_MILLIS).toString() + " days ago"
        }
    }

}

@RequiresApi(Build.VERSION_CODES.O)
fun checkLastJoin(lastJoin: String): Boolean {
    var flag = false
    if (lastJoin.isNullOrBlank())
        flag = true

    try {
        val simpleDateFormat = SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH)
        val formate = simpleDateFormat.format(lastJoin.toLong())

        val cureentDate = LocalDate.now()
        val lastJoinDate = LocalDate.parse(formate)
        val lastweek = cureentDate.minusWeeks(1)
        flag = lastJoinDate.isBefore(lastweek)

    } catch (ex: Exception) {
        Log.d("TAG200", "getLastJoin: $ex")
    }
    return flag

}

private val SECOND_MILLIS = 1000
private val MINUTE_MILLIS = 60 * SECOND_MILLIS
private val HOUR_MILLIS = 60 * MINUTE_MILLIS
private val DAY_MILLIS = 24 * HOUR_MILLIS

