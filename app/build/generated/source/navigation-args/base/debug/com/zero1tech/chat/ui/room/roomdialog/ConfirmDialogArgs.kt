package com.zero1tech.chat.ui.room.roomdialog

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.`data`.model.RoomModel
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ConfirmDialogArgs(
  public val action: String,
  public val room: RoomModel? = null,
  public val isJoined: Boolean = true,
  public val roomName: String,
  public val roomType: String = "private",
  public val numberUsersInRoom: Int = -1
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("action", this.action)
    if (Parcelable::class.java.isAssignableFrom(RoomModel::class.java)) {
      result.putParcelable("room", this.room as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(RoomModel::class.java)) {
      result.putSerializable("room", this.room as Serializable?)
    }
    result.putBoolean("isJoined", this.isJoined)
    result.putString("roomName", this.roomName)
    result.putString("roomType", this.roomType)
    result.putInt("numberUsersInRoom", this.numberUsersInRoom)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ConfirmDialogArgs {
      bundle.setClassLoader(ConfirmDialogArgs::class.java.classLoader)
      val __action : String?
      if (bundle.containsKey("action")) {
        __action = bundle.getString("action")
        if (__action == null) {
          throw IllegalArgumentException("Argument \"action\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"action\" is missing and does not have an android:defaultValue")
      }
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
        __isJoined = true
      }
      val __roomName : String?
      if (bundle.containsKey("roomName")) {
        __roomName = bundle.getString("roomName")
        if (__roomName == null) {
          throw IllegalArgumentException("Argument \"roomName\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"roomName\" is missing and does not have an android:defaultValue")
      }
      val __roomType : String?
      if (bundle.containsKey("roomType")) {
        __roomType = bundle.getString("roomType")
        if (__roomType == null) {
          throw IllegalArgumentException("Argument \"roomType\" is marked as non-null but was passed a null value.")
        }
      } else {
        __roomType = "private"
      }
      val __numberUsersInRoom : Int
      if (bundle.containsKey("numberUsersInRoom")) {
        __numberUsersInRoom = bundle.getInt("numberUsersInRoom")
      } else {
        __numberUsersInRoom = -1
      }
      return ConfirmDialogArgs(__action, __room, __isJoined, __roomName, __roomType,
          __numberUsersInRoom)
    }
  }
}
