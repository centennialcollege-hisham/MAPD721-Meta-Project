package com.zero1tech.chat.ui.chat.gpt.completion

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.`data`.model.UserRemote
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ChatBotFragmentArgs(
  public val user: UserRemote? = null,
  public val fromSuggest: Boolean = false,
  public val flag: String = "notification",
  public val receiverID: String? = "null"
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(UserRemote::class.java)) {
      result.putParcelable("user", this.user as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(UserRemote::class.java)) {
      result.putSerializable("user", this.user as Serializable?)
    }
    result.putBoolean("fromSuggest", this.fromSuggest)
    result.putString("flag", this.flag)
    result.putString("receiverID", this.receiverID)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ChatBotFragmentArgs {
      bundle.setClassLoader(ChatBotFragmentArgs::class.java.classLoader)
      val __user : UserRemote?
      if (bundle.containsKey("user")) {
        if (Parcelable::class.java.isAssignableFrom(UserRemote::class.java) ||
            Serializable::class.java.isAssignableFrom(UserRemote::class.java)) {
          __user = bundle.get("user") as UserRemote?
        } else {
          throw UnsupportedOperationException(UserRemote::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __user = null
      }
      val __fromSuggest : Boolean
      if (bundle.containsKey("fromSuggest")) {
        __fromSuggest = bundle.getBoolean("fromSuggest")
      } else {
        __fromSuggest = false
      }
      val __flag : String?
      if (bundle.containsKey("flag")) {
        __flag = bundle.getString("flag")
        if (__flag == null) {
          throw IllegalArgumentException("Argument \"flag\" is marked as non-null but was passed a null value.")
        }
      } else {
        __flag = "notification"
      }
      val __receiverID : String?
      if (bundle.containsKey("receiverID")) {
        __receiverID = bundle.getString("receiverID")
      } else {
        __receiverID = "null"
      }
      return ChatBotFragmentArgs(__user, __fromSuggest, __flag, __receiverID)
    }
  }
}
