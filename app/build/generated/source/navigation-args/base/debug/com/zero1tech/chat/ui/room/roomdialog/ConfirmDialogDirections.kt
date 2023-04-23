package com.zero1tech.chat.ui.room.roomdialog

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

public class ConfirmDialogDirections private constructor() {
  private data class ActionConfirmDialogToRoomChatFragment(
    public val room: RoomModel? = null,
    public val isJoined: Boolean
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_confirmDialog_to_roomChatFragment

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

  public companion object {
    public fun actionConfirmDialogToRoomChatFragment(room: RoomModel? = null, isJoined: Boolean):
        NavDirections = ActionConfirmDialogToRoomChatFragment(room, isJoined)

    public fun actionConfirmDialogToRoomFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_confirmDialog_to_roomFragment)

    public fun actionGlobalRequestFragment(): NavDirections =
        NavGraphXmlDirections.actionGlobalRequestFragment()

    public fun actionGlobalDialog(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalDialog(cities)

    public fun actionGlobalToRoomChat(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalToRoomChat(cities)
  }
}
