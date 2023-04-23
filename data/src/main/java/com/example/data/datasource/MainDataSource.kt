package com.example.data.datasource

import android.net.Uri
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.core.constant.*
import com.example.data.common.awaitsSingle
import com.example.data.common.singleChildEvent
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.storage.StorageReference
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.lang.Exception
import java.util.*
import javax.inject.Inject

class MainDataSource @Inject constructor(
    private val firebaseDatabase: FirebaseDatabase,
    private val prefs: Prefs,
    private val storageReference: StorageReference,
) {

    private val _successImageLiveData = MutableLiveData<String>()
    val successImageLiveData: LiveData<String> = _successImageLiveData

    suspend fun checkHaveAccountBefore(): UserRemote? {
        return firebaseDatabase.getReference(USER_REFERENCE).child(prefs.idCurrentUser.toString())
            .awaitsSingle()?.getValue(UserRemote::class.java)
    }


    fun getUserToken() {
        FirebaseMessaging.getInstance().token.addOnCompleteListener {
            if (it.isComplete) {
                prefs.token = it.result.toString()
            }
        }
    }

    suspend fun getCurrentUser(): UserRemote? {
        return firebaseDatabase.getReference(USER_REFERENCE).child(prefs.idCurrentUser.toString())
            .awaitsSingle()?.getValue(UserRemote::class.java)
    }

    fun updateUserLastJoin(time: String) {
        try {
            firebaseDatabase.reference.child("Users").child(prefs.idCurrentUser.toString())
                .child("lastJoin").setValue(time)

        } catch (ex: Exception) {
            Log.d("TAG", "updateUserLastJoin: ${ex.toString()}")
        }
    }


    fun updateProfile(pathProfilePhoto: Uri) {
        var imageLink: String? = ""

        val ref: StorageReference =
            storageReference.child(UUID.randomUUID().toString()) //todo clean single
        ref.putFile(pathProfilePhoto).addOnSuccessListener {
            it.metadata?.reference?.downloadUrl?.addOnSuccessListener { url ->
                imageLink = url.toString()
                _successImageLiveData.postValue(imageLink ?: "")
                updateProfileUserPref(imageLink ?: "")
                updateProfilePhoto(imageLink ?: "")
            }
        }

    }

    private fun updateProfileUserPref(imageUrl: String) {
        val oldUser = prefs.currentUser
        var newUser = oldUser
        newUser.profile = imageUrl
        prefs.currentUser = newUser
    }

    private fun updateProfilePhoto(ivProfile: String) {
        val refUser =
            firebaseDatabase.reference.child(USER_REFERENCE).child(prefs.idCurrentUser.toString())
        val hashMap: HashMap<String, Any> = HashMap()
        hashMap["profile"] = ivProfile
        refUser.updateChildren(hashMap)
    }

    fun updateFullName(fullName: String, nameChanged: String) {
        val refUser =
            firebaseDatabase.reference.child(USER_REFERENCE).child(prefs.idCurrentUser.toString())
        val hashMap: HashMap<String, Any> = HashMap()
        hashMap["fullName"] = fullName
        hashMap["nameChanged"] = nameChanged
        refUser.updateChildren(hashMap)
    }

    suspend fun getCities(currentLanguage: String?): MutableList<String>? {
        var pathLanguage = ARABIC_REFERENCE
        if (currentLanguage == "en") {
            pathLanguage = ENGLISH_REFERENCE
        }
        return firebaseDatabase.reference.child(CITIES_REFERENCE)
            .child(KEY_GENERIC_REFERENCE).child(pathLanguage)
            .awaitsSingle()?.value as MutableList<String>?
    }
}

