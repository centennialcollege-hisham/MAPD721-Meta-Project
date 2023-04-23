package com.zero1tech.chat.ui.splash

import android.os.Bundle
import androidx.navigation.NavDirections
import com.zero1tech.chat.NavGraphXmlDirections
import com.zero1tech.chat.R
import kotlin.Array
import kotlin.Int
import kotlin.String

public class SplashFragmentDirections private constructor() {
  private data class ActionSplashFragmentToFriendsFragment2(
    public val AccountType: String? = "\"\""
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_splashFragment_to_friendsFragment2

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("AccountType", this.AccountType)
      return result
    }
  }

  public companion object {
    public fun actionSplashFragmentToFriendsFragment2(AccountType: String? = "\"\""): NavDirections
        = ActionSplashFragmentToFriendsFragment2(AccountType)

    public fun actionGlobalRequestFragment(): NavDirections =
        NavGraphXmlDirections.actionGlobalRequestFragment()

    public fun actionGlobalDialog(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalDialog(cities)

    public fun actionGlobalToRoomChat(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalToRoomChat(cities)
  }
}
