package com.zero1tech.chat

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Array
import kotlin.Int
import kotlin.String

public class NavGraphXmlDirections private constructor() {
  private data class ActionGlobalDialog(
    public val cities: Array<String>?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_global_dialog

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putStringArray("cities", this.cities)
      return result
    }
  }

  private data class ActionGlobalToRoomChat(
    public val cities: Array<String>?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_global_to_room_chat

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putStringArray("cities", this.cities)
      return result
    }
  }

  public companion object {
    public fun actionGlobalRequestFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_requestFragment)

    public fun actionGlobalDialog(cities: Array<String>?): NavDirections =
        ActionGlobalDialog(cities)

    public fun actionGlobalToRoomChat(cities: Array<String>?): NavDirections =
        ActionGlobalToRoomChat(cities)
  }
}
