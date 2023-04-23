package com.zero1tech.chat.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.core.extinction.getDeviceId
import com.example.data.model.setting.SettingRemote
import com.example.data.prefs.Prefs
import com.zero1tech.chat.BuildConfig
import com.zero1tech.chat.R
import com.zero1tech.chat.ScreenName
import com.zero1tech.chat.base.BaseFragment
import com.zero1tech.chat.databinding.FragmentSplashBinding
import com.zero1tech.chat.ui.activities.Activities
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@ScreenName("splash")
@AndroidEntryPoint
class SplashFragment : BaseFragment() {

    private lateinit var binding: FragmentSplashBinding
    private val viewModel: SplashViewModel by viewModels()

    @Inject
    lateinit var prefs: Prefs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSplashBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSplashBinding.bind(view)
        lifecycle.addObserver(viewModel)
        init()
        saveIdDevice()
        initObserver()
    }

    private fun initObserver() {
        viewModel.errorLiveData.observe(viewLifecycleOwner, ::handleError)
        viewModel.successSettingLiveData.observe(viewLifecycleOwner, ::handleSettingSuccess)


    }


    private fun handleSettingSuccess(firebase: SettingRemote) {

        when {
            firebase.shutdown == true -> {
                toFragment(Activities.Maintenance.action)
            }
            firebase.versionCode > BuildConfig.VERSION_CODE && firebase.forceUpdate == true -> {
                toFragment(Activities.ForceUpdate.action)
            }
            else -> {
                toFragment(Activities.Home.action)
            }
        }
    }

    private fun toFragment(action: Int) {
        findNavController().navigate(action)
    }

    private fun handleError(throwable: Throwable?) {
        Toast.makeText(context, throwable?.message ?: getString(R.string.NoInternet), Toast.LENGTH_LONG).show()
    }

    private fun saveIdDevice() {
        prefs.idCurrentUser = getDeviceId(requireContext())
    }

    private fun init() {
        binding.apply {
            tvVersion.text = "V ${BuildConfig.VERSION_NAME}"
            Glide.with(requireActivity()).load(R.drawable.meta_logo).into(ivLogo)
        }
    }
}