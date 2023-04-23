package com.zero1tech.chat.ui.chat.gpt.images

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.zero1tech.chat.NavGraphXmlDirections
import com.zero1tech.chat.R
import kotlin.Array
import kotlin.Int
import kotlin.String

public class ImagesBotFragmentDirections private constructor() {
  private data class ActionChatFragmentToFriendsFragment(
    public val AccountType: String? = "\"\""
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_chatFragment_to_friendsFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("AccountType", this.AccountType)
      return result
    }
  }

  public companion object {
    public fun actionChatFragmentToFriendsFragment(AccountType: String? = "\"\""): NavDirections =
        ActionChatFragmentToFriendsFragment(AccountType)

    public fun actionChatFragmentToFriendsFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_chatFragment_to_friendsFragment2)

    public fun actionGlobalRequestFragment(): NavDirections =
        NavGraphXmlDirections.actionGlobalRequestFragment()

    public fun actionGlobalDialog(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalDialog(cities)

    public fun actionGlobalToRoomChat(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalToRoomChat(cities)
  }
}
