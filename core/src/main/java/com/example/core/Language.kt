package com.example.core

import android.content.Context
import android.content.res.Configuration
import android.util.Log
import androidx.preference.PreferenceManager
import java.util.*

object Languages {


    fun setLocale(context: Context): Context {
        return updateResources(context, getLanguage(context))
    }

     fun getLanguage(context: Context): String? {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
        var language = sharedPreferences.getString("language", Locale.getDefault().language)

        Log.d("TAG11", "getLanguage: =$language" )
        if (language == THEME_DEFAULT_AR || language == THEME_DEFAULT) {
            language = Locale.getDefault().language.toString()
        }

        return language


    }

    private fun updateResources(context: Context, language: String?): Context {
        val result: Context
        val locale = Locale(language ?: Locale.getDefault().language)
        Locale.setDefault(locale)

        val res = context.resources
        val config = Configuration(res?.configuration)
        config.setLocale(locale)
        result = context.createConfigurationContext(config)
        return result
    }

    private const val THEME_DEFAULT_AR = "افتراضي"
    private const val THEME_DEFAULT = "default"

}
