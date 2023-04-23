package com.zero1tech.chat.ui.friends

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.String
import kotlin.jvm.JvmStatic

public data class FriendsFragmentArgs(
  public val AccountType: String? = "\"\""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("AccountType", this.AccountType)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): FriendsFragmentArgs {
      bundle.setClassLoader(FriendsFragmentArgs::class.java.classLoader)
      val __AccountType : String?
      if (bundle.containsKey("AccountType")) {
        __AccountType = bundle.getString("AccountType")
      } else {
        __AccountType = "\"\""
      }
      return FriendsFragmentArgs(__AccountType)
    }
  }
}
