package com.zero1tech.chat.ui.setting.contactus

import androidx.lifecycle.ViewModel
import com.example.data.model.ContactUs
import com.example.data.repoistory.contactus.ContactUsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ContactUsViewModel @Inject constructor(val repository: ContactUsRepository) :
    ViewModel() {

    fun contactUs(messageContactUs: ContactUs) {
        repository.contactUs(messageContactUs)
    }
}