package com.example.core.activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.example.core.Languages


open class BaseActivity : AppCompatActivity() {
    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(Languages.setLocale(newBase))
    }
}
