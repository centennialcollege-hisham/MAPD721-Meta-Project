package com.zero1tech.chat.ui.splash.update

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.core.extinction.setSafeOnClickListener
import com.example.data.model.setting.SettingRemote
import com.example.data.prefs.Prefs
import com.zero1tech.chat.BuildConfig
import com.zero1tech.chat.R
import com.zero1tech.chat.ScreenName
import com.zero1tech.chat.databinding.FragmentForceUpdateBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@ScreenName("ForceUpdate")
@AndroidEntryPoint
class ForceUpdateFragment : Fragment() {


    private lateinit var binding: FragmentForceUpdateBinding
    private lateinit var appSettings : SettingRemote
    @Inject
    lateinit var prefs: Prefs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentForceUpdateBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAppSettings()
        initView()
        initListener()
    }

    private fun initAppSettings() {
        appSettings =prefs.settings
    }

    private fun initListener() {
        binding.buttonDownload.setSafeOnClickListener { goToGooglePlay() }
    }

    private fun goToGooglePlay() {
        val uri = Uri.parse(getGooglePlayUri())
        val intent = Intent(Intent.ACTION_VIEW, uri)
        when {
            intent.resolveActivity(requireContext().packageManager) != null -> {
                startActivity(intent)
            }
            else -> {
                Toast.makeText(requireContext(),
                    getString(R.string.error_contact_support_team),
                    Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun getGooglePlayUri(): String {
        return appSettings.urlLatestVersionApp.toString()
    }

    private fun initView() {
        binding.textViewCurrentVersion.text =
            getString(R.string.label_current_version, BuildConfig.VERSION_NAME)
        binding.textViewNewVersion.text =
            getString(R.string.label_new_version, appSettings.versionName)

    }
}