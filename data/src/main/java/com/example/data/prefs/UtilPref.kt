package com.example.data.prefs

import android.content.Context
import android.content.SharedPreferences
import com.example.core.constant.PREF_LAST_MESSAGE
import com.example.core.extinction.sortID
import com.example.data.model.Message
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UtilPref @Inject constructor() {

    fun saveLastMessage(message: Message, context: Context) {
        val preferences: SharedPreferences =
            context.getSharedPreferences(PREF_LAST_MESSAGE, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = preferences.edit()
        editor.putString(sortID(message.senderid.toString(), message.receiverid.toString()), message.message)
        editor.apply()

    }

    fun readLastMessage(context: Context, senderID: String, receiverID: String): String {
        val preferences: SharedPreferences =
            context.getSharedPreferences(PREF_LAST_MESSAGE, Context.MODE_PRIVATE)
        return preferences.getString(sortID(senderID, receiverID), "")!!
    }


}