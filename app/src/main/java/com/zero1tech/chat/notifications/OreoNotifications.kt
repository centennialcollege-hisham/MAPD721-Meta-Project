package com.zero1tech.chat.notifications

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.ContextWrapper
import android.net.Uri
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import com.example.core.constant.CHANNELID
import com.example.core.constant.NAME
import android.annotation.TargetApi


class OreoNotifications(base: Context?) : ContextWrapper(base) {
    private var notificationManager: NotificationManager? = null

    @RequiresApi(api = Build.VERSION_CODES.O)
    private fun createChannel() {
        val notificationChannel =
            NotificationChannel(CHANNELID, NAME, NotificationManager.IMPORTANCE_DEFAULT)
        notificationChannel.enableLights(true)
        notificationChannel.enableVibration(true)
        notificationChannel.lockscreenVisibility = Notification.VISIBILITY_PRIVATE
        manager!!.createNotificationChannel(notificationChannel)
    }

    val manager: NotificationManager?
        get() {
            if (notificationManager == null) {
                notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            }
            return notificationManager
        }

   

    // not using
    @TargetApi(Build.VERSION_CODES.O)
    fun getNotificationShit(
        action: NotificationCompat.Action?,
        title: String?,
        body: String?,
        pIntent: PendingIntent?,
        soundUri: Uri?,
        icon: String,
    ): NotificationCompat.Builder {
        return NotificationCompat.Builder(this, CHANNELID)
            .addAction(action)
            .setContentIntent(pIntent)
            .setContentTitle(title)
            .setContentText(body)
            .setAutoCancel(true)
            .setSound(soundUri)
            .setSmallIcon(icon.toInt())
    }


    init {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createChannel()
        }
    }
}


