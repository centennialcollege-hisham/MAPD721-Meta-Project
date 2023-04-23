package com.zero1tech.chat.ui.room

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.`data`.model.RoomModel
import com.zero1tech.chat.NavGraphXmlDirections
import com.zero1tech.chat.R
import java.io.Serializable
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class RoomFragmentDirections private constructor() {
  private data class ActionRoomFragmentToRoomChatFragment(
    public val room: RoomModel? = null,
    public val isJoined: Boolean
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_roomFragment_to_roomChatFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(RoomModel::class.java)) {
        result.putParcelable("room", this.room as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(RoomModel::class.java)) {
        result.putSerializable("room", this.room as Serializable?)
      }
      result.putBoolean("isJoined", this.isJoined)
      return result
    }
  }

  private data class ActionRoomFragmentToCreateRoomDialog2(
    public val roomType: String,
    public val roomNames: Array<String>
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_roomFragment_to_createRoomDialog2

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("roomType", this.roomType)
      result.putStringArray("roomNames", this.roomNames)
      return result
    }
  }

  private data class ActionRoomFragmentToConfirmDialog(
    public val action: String,
    public val room: RoomModel? = null,
    public val isJoined: Boolean = true,
    public val roomName: String,
    public val roomType: String = "private",
    public val numberUsersInRoom: Int = -1
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_roomFragment_to_confirmDialog

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionRoomFragmentToRoomChatFragment(room: RoomModel? = null, isJoined: Boolean):
        NavDirections = ActionRoomFragmentToRoomChatFragment(room, isJoined)

    public fun actionRoomFragmentToCreateRoomDialog2(roomType: String, roomNames: Array<String>):
        NavDirections = ActionRoomFragmentToCreateRoomDialog2(roomType, roomNames)

    public fun actionRoomFragmentToConfirmDialog(
      action: String,
      room: RoomModel? = null,
      isJoined: Boolean = true,
      roomName: String,
      roomType: String = "private",
      numberUsersInRoom: Int = -1
    ): NavDirections = ActionRoomFragmentToConfirmDialog(action, room, isJoined, roomName, roomType,
        numberUsersInRoom)

    public fun actionGlobalRequestFragment(): NavDirections =
        NavGraphXmlDirections.actionGlobalRequestFragment()

    public fun actionGlobalDialog(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalDialog(cities)

    public fun actionGlobalToRoomChat(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalToRoomChat(cities)
  }
}
