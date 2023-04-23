package com.example.data.prefs

import android.content.SharedPreferences
import androidx.core.content.edit
import com.example.data.model.Message
import com.example.data.model.UserRemote
import com.example.data.model.setting.SettingRemote
import com.squareup.moshi.Moshi

class PrefsImpl(
    val preferences: SharedPreferences,
    moshi: Moshi,
) : Prefs {

    private val settingsAdapter = moshi.adapter(SettingRemote::class.java)
    private val userAdapter = moshi.adapter(UserRemote::class.java)
    private val messageAdapter = moshi.adapter(Message::class.java)


    override var idCurrentUser: String?
        get() = preferences.getString(PrefKey.ID_CURRENT_USER.name, "").toString()
        set(value) = preferences.edit().putString(PrefKey.ID_CURRENT_USER.name, value).apply()

    override var nameCurrentUser: String?
        get() = preferences.getString(PrefKey.NAME_CURRENT_USER.name, "").toString()
        set(value) = preferences.edit().putString(PrefKey.NAME_CURRENT_USER.name, value)
            .apply()

    override var receiverid: String?
        get() = preferences.getString(PrefKey.FRIENDED.name, "").toString()
        set(value) = preferences.edit().putString(PrefKey.FRIENDED.name, value).apply()

    override var token: String?
        get() = preferences.getString(PrefKey.TOKEN.name, "").toString()
        set(value) = preferences.edit().putString(PrefKey.TOKEN.name, value).apply()


    override var userAvailablity: Boolean?
        get() = preferences.getBoolean(PrefKey.STATUS.name, false)
        set(value) = preferences.edit().putBoolean(PrefKey.STATUS.name, value == true).apply()

    override var notificationStatus: Boolean?
        get() = preferences.getBoolean(PrefKey.NOTIFICATION.name, true)
        set(value) = preferences.edit().putBoolean(PrefKey.NOTIFICATION.name, value == true).apply()


    override var settings: SettingRemote
        get() {
            var json = preferences.getString(PrefKey.SETTINGS.name, null)
            if (json == null) {
                json = settingsAdapter.toJson(SettingRemote())
            }
            return settingsAdapter.fromJson(json!!)!!
        }
        set(value) {
            preferences.edit { putString(PrefKey.SETTINGS.name, settingsAdapter.toJson(value)) }
        }

    override var currentUser: UserRemote
        get() {
            var json = preferences.getString(PrefKey.CURRENT_USER.name, null)
            if (json == null) {
                json = userAdapter.toJson(UserRemote())
            }
            return userAdapter.fromJson(json!!)!!

        }
        set(value) {
            preferences.edit { putString(PrefKey.CURRENT_USER.name, userAdapter.toJson(value)) }
        }


    override var isBackground: Boolean
        get() = preferences.getBoolean(PrefKey.IS_BACKGROUND.name, false)
        set(value) {
            preferences.edit { putBoolean(PrefKey.IS_BACKGROUND.name, value) }
        }




    override fun getLastMessage(id: String): Message {
        val json = preferences.getString("lastMessage.$id", "{}")
        return messageAdapter.fromJson(json!!)!!
    }

    override fun saveLastMessage(id: String, message: Message) {
        preferences.edit { putString("lastMessage.$id", messageAdapter.toJson(message)) }
    }

}

enum class PrefKey {

    CURRENT_USER,

    NOTIFICATION,

    STATUS,

    TOKEN,

    NAME_CURRENT_USER,

    ID_CURRENT_USER,

    FRIENDED,

    SETTINGS,

    IS_BACKGROUND,
    PROFILE,

}

