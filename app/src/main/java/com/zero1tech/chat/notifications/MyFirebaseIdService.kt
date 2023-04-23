package com.zero1tech.chat.notifications

import android.annotation.SuppressLint
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.media.RingtoneManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.core.app.RemoteInput
import androidx.navigation.NavDeepLinkBuilder
import com.example.core.constant.FRIENDID
import com.example.core.constant.KEY_TEXT_REPLAY
import com.example.core.extinction.sortID
import com.example.data.model.Message
import com.example.data.prefs.Prefs
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.zero1tech.chat.R
import com.zero1tech.chat.ui.chat.friend.ChatFragment
import com.zero1tech.chat.ui.main.MainActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
@SuppressLint("MissingFirebaseInstanceTokenRefresh")
class MyFirebaseIdService : FirebaseMessagingService() {

    @Inject
    lateinit var prefs: Prefs

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)


        val senderId = remoteMessage.data["senderId"]
        val receiverId = remoteMessage.data["receiverID"]
        val icon = remoteMessage.data["profile"]
        val title = remoteMessage.data["senderName"]
        val body = remoteMessage.data["message"]

        val message = Message(senderId.toString(),
            receiverId.toString(),
            body.toString(),
            "00",
            title.toString())

        prefs.saveLastMessage(sortID(senderId ?: "", receiverId ?: ""), message)


        if (prefs.notificationStatus == true && prefs.isBackground)
            if (Build.VERSION.SDK_INT > +Build.VERSION_CODES.O) {

                sendOreoNotification(remoteMessage)
            } else {

                sendNormalNotification(remoteMessage)
            }
    }

    private fun sendNormalNotification(remoteMessage: RemoteMessage) {

        val senderId = remoteMessage.data["senderId"]
        val icon = remoteMessage.data["profile"]
        val title = remoteMessage.data["senderName"]
        val body = remoteMessage.data["message"]


        val intent = Intent(this, ChatFragment::class.java)

        val bundle = Bundle()
        bundle.putString(FRIENDID, senderId)

        prefs.receiverid = (senderId!!)


        intent.putExtras(bundle)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        val pendingIntent =
            PendingIntent.getActivity(this, 1002, intent, PendingIntent.FLAG_ONE_SHOT)

        val defaultSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)


        val builder: NotificationCompat.Builder = NotificationCompat.Builder(this)
            .setSmallIcon(R.drawable.ic_arrow_drop_down_gray)
            .setContentTitle(title)
            .setContentText(body)
            .setAutoCancel(true)
            .setSound(defaultSound)
            .setContentIntent(pendingIntent)


        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        notificationManager.notify(1002, builder.build())

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private fun sendOreoNotification(remoteMessage: RemoteMessage) {
        val senderId: String = remoteMessage.data["senderId"]!!
        val icon: String = R.drawable.ic_add.toString()
        val title: String = remoteMessage.data["senderName"]!!
        val body: String = remoteMessage.data["message"]!!


        val notification = remoteMessage.data


        var bundle = Bundle()
        bundle.putString(FRIENDID, senderId)



        prefs.receiverid = senderId


        val defaultSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        val oreoNotification = OreoNotifications(this)


        val remoteInput =
            RemoteInput.Builder(KEY_TEXT_REPLAY).setLabel("your Message").build()
        var replyIntent: Intent
        var pIntentreply: PendingIntent? = null


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            replyIntent = Intent(this, NotificationService::class.java)

            pIntentreply = PendingIntent.getActivity(this, 0, replyIntent, PendingIntent.FLAG_MUTABLE)
        }


        val replyAction: NotificationCompat.Action = NotificationCompat.Action.Builder(
            R.drawable.ic_arrow_drop_down_gray,
            "Reply", pIntentreply
        ).addRemoteInput(remoteInput).build()


//        val pendgShit: PendingIntent =//todo go to main activity
//            NavDeepLinkBuilder(applicationContext).setGraph(R.navigation.nav_graph)
//                .setArguments(bundle).setDestination(R.id.friendsFragment)
//                .createPendingIntent()
//                .addFlags(PendingIntent.FLAG_IMMUTABLE)


        val intent = Intent(this, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_MUTABLE)

       val builder = oreoNotification.getNotificationShit(
            replyAction, title, body, pendingIntent,
            defaultSound, icon
        )

        val preferences: SharedPreferences =
            getSharedPreferences("NEWPREFS", Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = preferences.edit()
        editor.putInt("values", 1002)
        editor.apply()

        oreoNotification.manager?.notify(1002, builder.build())
    }


}

