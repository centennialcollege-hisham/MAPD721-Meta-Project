package com.example.data.repoistory.dialogregister

import com.example.core.constant.DEFAULT_PROFILE_PHOTO
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import com.google.firebase.database.*
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.collections.HashMap

@Singleton
class DialogRegisterRepository @Inject constructor(
    private val databaseReference: DatabaseReference,
    var prefs: Prefs,
) {

    fun resisterUserDevice(
        deviceId: String,
        fullName: String,
        age: String,
        from: String,

        ) {
        register(deviceId, fullName, age, from)
    }

    private fun register(
        deviceId: String,
        fullName: String,
        age: String,
        from: String,
    ) {

        val newUser= UserRemote(
            fullName = fullName,
            uid = deviceId,
            profile = DEFAULT_PROFILE_PHOTO,
            from = from,
            nameChanged = "No",
            age = age,
            token =  prefs.token.toString(),
            timeStampRegister = System.currentTimeMillis().toString(),
            lastJoin = System.currentTimeMillis().toString(),
        )
        databaseReference.child(com.example.core.constant.USERS_TABLE).child(deviceId)
            .setValue(newUser)


    }



}