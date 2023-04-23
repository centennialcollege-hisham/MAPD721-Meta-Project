package com.example.core.util

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatDelegate
import androidx.preference.PreferenceManager


object Settings {

    private const val THEME = "theme"
    private const val THEME_LIGHT = "light"
    private const val THEME_DARK = "dark"
    private const val THEME_DEFAULT = "default"
    private const val THEME_LIGHT_AR = "إضاءة"
    private const val THEME_DARK_AR = "داكن"
    private const val THEME_DEFAULT_AR = "افتراضي"


    fun getNightMode(context: Context): Int {
        val prefs = PreferenceManager.getDefaultSharedPreferences(context)
        return when (prefs.getString(THEME, THEME_DEFAULT)) {
            THEME_LIGHT , THEME_LIGHT_AR -> AppCompatDelegate.MODE_NIGHT_NO
            THEME_DARK, THEME_DARK_AR -> AppCompatDelegate.MODE_NIGHT_YES
            else -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
            } else {
                AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY
            }
        }
    }

}
