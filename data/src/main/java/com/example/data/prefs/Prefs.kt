package com.example.data.prefs

import com.example.data.model.Message
import com.example.data.model.UserRemote
import com.example.data.model.setting.SettingRemote

interface Prefs {

    var idCurrentUser: String?

    var nameCurrentUser: String?

    var receiverid: String?

    var token: String?



    var userAvailablity: Boolean?

    var notificationStatus: Boolean?

    var currentUser: UserRemote

    var settings: SettingRemote

//    var message: Message

    var isBackground: Boolean

    fun getLastMessage(id: String): Message

    fun saveLastMessage(id: String, message: Message)
}