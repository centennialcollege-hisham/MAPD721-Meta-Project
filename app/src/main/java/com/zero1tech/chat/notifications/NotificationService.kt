package com.zero1tech.chat.notifications

import android.app.NotificationManager
import android.app.RemoteInput
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.os.Build
import android.text.format.DateFormat
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.zero1tech.chat.R
import com.example.core.constant.CHANNELID
import com.example.core.constant.KEY_TEXT_REPLAY
import com.example.core.extinction.sortID
import com.example.data.prefs.Prefs
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject


class NotificationService @Inject constructor(val prefs: Prefs) : BroadcastReceiver() {


    @RequiresApi(api = Build.VERSION_CODES.KITKAT_WATCH)
    override fun onReceive(context: Context?, intent: Intent?) {

        val notification =
            context?.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager


        val remoteinput = RemoteInput.getResultsFromIntent(intent)

        if (remoteinput != null) {
            val replyText: String = remoteinput.get(KEY_TEXT_REPLAY).toString()

            val userId = prefs.idCurrentUser.toString()
            val receiverId: String = prefs.receiverid.toString()

            val time = (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).toString()


            val reference: DatabaseReference = FirebaseDatabase.getInstance().reference
            val hashMap: HashMap<String, String> = HashMap()
            hashMap["senderid"] = userId
            hashMap["receiverid"] = receiverId
            hashMap["message"] = replyText
            hashMap["time"] = currentTime(time)

            reference.child("Chat").child(
                sortID(
                    receiverId,
                    prefs.idCurrentUser.toString()
                )
            ).push().setValue(hashMap)

            val pref1 = context.getSharedPreferences("NEWPREFS", MODE_PRIVATE)

            val shit = pref1.getInt("values", 0)

            val repliedNotification = NotificationCompat.Builder(context, CHANNELID)
                .setSmallIcon(R.drawable.linkage_logoa)
                .setContentText("Reply received")
                .build()
            notification.notify(shit, repliedNotification)

        }
    }

    private fun currentTime(time: String): String {
        val cal: Calendar = Calendar.getInstance(Locale.ENGLISH)
        cal.timeInMillis = (time.toLong()) * 1000L
        return DateFormat.format("hh:mm a", cal).toString()
    }

}