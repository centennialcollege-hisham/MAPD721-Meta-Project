package com.zero1tech.chat.ui.dialog

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.String
import kotlin.jvm.JvmStatic

public data class InfoDialogArgs(
  public val cities: Array<String>?
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putStringArray("cities", this.cities)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): InfoDialogArgs {
      bundle.setClassLoader(InfoDialogArgs::class.java.classLoader)
      val __cities : Array<String>?
      if (bundle.containsKey("cities")) {
        __cities = bundle.getStringArray("cities")
      } else {
        throw IllegalArgumentException("Required argument \"cities\" is missing and does not have an android:defaultValue")
      }
      return InfoDialogArgs(__cities)
    }
  }
}
