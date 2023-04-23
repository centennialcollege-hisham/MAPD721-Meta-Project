package com.zero1tech.chat.ui.room.chat

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
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

public class RoomChatFragmentDirections private constructor() {
  private data class ActionRoomChatFragmentToConfirmDialog(
    public val action: String,
    public val room: RoomModel? = null,
    public val isJoined: Boolean = true,
    public val roomName: String,
    public val roomType: String = "private",
    public val numberUsersInRoom: Int = -1
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_roomChatFragment_to_confirmDialog

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
    public fun actionRoomChatFragmentToRoomFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_roomChatFragment_to_roomFragment)

    public fun actionRoomChatFragmentToConfirmDialog(
      action: String,
      room: RoomModel? = null,
      isJoined: Boolean = true,
      roomName: String,
      roomType: String = "private",
      numberUsersInRoom: Int = -1
    ): NavDirections = ActionRoomChatFragmentToConfirmDialog(action, room, isJoined, roomName,
        roomType, numberUsersInRoom)

    public fun actionGlobalRequestFragment(): NavDirections =
        NavGraphXmlDirections.actionGlobalRequestFragment()

    public fun actionGlobalDialog(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalDialog(cities)

    public fun actionGlobalToRoomChat(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalToRoomChat(cities)
  }
}
