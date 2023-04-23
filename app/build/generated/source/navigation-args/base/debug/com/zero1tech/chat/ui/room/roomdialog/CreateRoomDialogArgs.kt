package com.zero1tech.chat.ui.room.roomdialog

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.String
import kotlin.jvm.JvmStatic

public data class CreateRoomDialogArgs(
  public val roomType: String,
  public val roomNames: Array<String>
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("roomType", this.roomType)
    result.putStringArray("roomNames", this.roomNames)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CreateRoomDialogArgs {
      bundle.setClassLoader(CreateRoomDialogArgs::class.java.classLoader)
      val __roomType : String?
      if (bundle.containsKey("roomType")) {
        __roomType = bundle.getString("roomType")
        if (__roomType == null) {
          throw IllegalArgumentException("Argument \"roomType\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"roomType\" is missing and does not have an android:defaultValue")
      }
      val __roomNames : Array<String>?
      if (bundle.containsKey("roomNames")) {
        __roomNames = bundle.getStringArray("roomNames")
        if (__roomNames == null) {
          throw IllegalArgumentException("Argument \"roomNames\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"roomNames\" is missing and does not have an android:defaultValue")
      }
      return CreateRoomDialogArgs(__roomType, __roomNames)
    }
  }
}
