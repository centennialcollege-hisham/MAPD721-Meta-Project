package com.zero1tech.chat.ui.setting

import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.*
import com.example.core.util.Settings
import com.example.data.prefs.Prefs
import com.zero1tech.chat.R
import com.zero1tech.chat.ScreenName
import com.zero1tech.chat.ui.main.MainActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@ScreenName("settings")
@AndroidEntryPoint
class SettingsFragment : PreferenceFragmentCompat(),
    OnSharedPreferenceChangeListener {


    @Inject
    lateinit var prefs: Prefs
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings, rootKey)
    }

    override fun onResume() {
        super.onResume()
        preferenceManager.sharedPreferences.registerOnSharedPreferenceChangeListener(this)
        preferenceScreen.sharedPreferences
            .registerOnSharedPreferenceChangeListener(preferenceChangeListener)
    }

    override fun onPause() {
        super.onPause()
        preferenceManager.sharedPreferences.unregisterOnSharedPreferenceChangeListener(this)
    }


    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        when (key) {
            "theme" -> {
                changeTheme()
            }
            "language" -> {
                startActivity(
                    Intent(
                        context,
                        MainActivity::class.java
                    ).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                )
            }
        }

    }

    private var preferenceChangeListener = OnSharedPreferenceChangeListener { _, key ->
        when (val preference = findPreference<Preference>(key)) {
            is SwitchPreferenceCompat -> {
                if (key == "switch") {
                    Log.d("Test", "${preference.key} : ${preference.isChecked}")
                    prefs.notificationStatus = preference.isChecked
                }
            }
        }
    }

    private fun changeTheme() {
        val context = requireContext()
        val mode = Settings.getNightMode(context)
        AppCompatDelegate.setDefaultNightMode(mode)
    }

}
