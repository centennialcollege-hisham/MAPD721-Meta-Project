package com.zero1tech.chat.ui.room.chat

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.`data`.model.RoomModel
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class RoomChatFragmentArgs(
  public val room: RoomModel? = null,
  public val isJoined: Boolean
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(RoomModel::class.java)) {
      result.putParcelable("room", this.room as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(RoomModel::class.java)) {
      result.putSerializable("room", this.room as Serializable?)
    }
    result.putBoolean("isJoined", this.isJoined)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RoomChatFragmentArgs {
      bundle.setClassLoader(RoomChatFragmentArgs::class.java.classLoader)
      val __room : RoomModel?
      if (bundle.containsKey("room")) {
        if (Parcelable::class.java.isAssignableFrom(RoomModel::class.java) ||
            Serializable::class.java.isAssignableFrom(RoomModel::class.java)) {
          __room = bundle.get("room") as RoomModel?
        } else {
          throw UnsupportedOperationException(RoomModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __room = null
      }
      val __isJoined : Boolean
      if (bundle.containsKey("isJoined")) {
        __isJoined = bundle.getBoolean("isJoined")
      } else {
        throw IllegalArgumentException("Required argument \"isJoined\" is missing and does not have an android:defaultValue")
      }
      return RoomChatFragmentArgs(__room, __isJoined)
    }
  }
}
