package com.zero1tech.chat.ui.setting.contactus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.core.extinction.getTexts
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.model.ContactUs
import com.zero1tech.chat.R
import com.zero1tech.chat.ScreenName
import com.zero1tech.chat.databinding.FragmentContactUsBinding
import dagger.hilt.android.AndroidEntryPoint

@ScreenName("contactUs")
@AndroidEntryPoint
class ContactUsFragment : Fragment() {
    private lateinit var binding: FragmentContactUsBinding
    private val contactUsViewModel: ContactUsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentContactUsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
    }

    private fun initListener() {
        binding.butSubmit.setSafeOnClickListener {
            contactUsViewModel.contactUs(dataCollection())
            requireActivity().onBackPressed()
        }
    }

    private fun backFragment() {
        findNavController().navigate(R.id.friendsFragment)
    }


    private fun dataCollection(): ContactUs {
        binding.apply {
            return ContactUs(etFullName.getTexts(),
                etEmail.getTexts(),
                etPhoneNumber.getTexts(),
                etMsg.getTexts(),
                System.currentTimeMillis().toString()
            )
        }
    }
}