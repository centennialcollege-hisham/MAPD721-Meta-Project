package com.example.data.repoistory.contactus

import com.example.core.constant.CONTACT_US_REFERENCE
import com.example.data.model.ContactUs
import com.example.data.prefs.Prefs
import com.example.data.prefs.PrefsImpl
import com.google.firebase.database.FirebaseDatabase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ContactUsRepository @Inject constructor(
    private val databaseReference: FirebaseDatabase,
    private val pref: Prefs
) {
    fun contactUs(messageContactUs: ContactUs) {
        databaseReference.reference.child(CONTACT_US_REFERENCE).child(pref.idCurrentUser.toString()).push().setValue(messageContactUs)
    }

}