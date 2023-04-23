package com.zero1tech.chat.ui.people

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.`data`.model.UserRemote
import com.zero1tech.chat.NavGraphXmlDirections
import com.zero1tech.chat.R
import java.io.Serializable
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress

public class PeopleFragmentDirections private constructor() {
  private data class ActionPeopleFragment2ToChatFragment(
    public val user: UserRemote? = null,
    public val fromSuggest: Boolean = false,
    public val flag: String = "notification",
    public val receiverID: String? = "null"
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_peopleFragment2_to_chatFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionPeopleFragment2ToChatFragment(
      user: UserRemote? = null,
      fromSuggest: Boolean = false,
      flag: String = "notification",
      receiverID: String? = "null"
    ): NavDirections = ActionPeopleFragment2ToChatFragment(user, fromSuggest, flag, receiverID)

    public fun actionPeopleFragmentToSearchPeopleFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_peopleFragment_to_searchPeopleFragment)

    public fun actionGlobalRequestFragment(): NavDirections =
        NavGraphXmlDirections.actionGlobalRequestFragment()

    public fun actionGlobalDialog(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalDialog(cities)

    public fun actionGlobalToRoomChat(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalToRoomChat(cities)
  }
}
