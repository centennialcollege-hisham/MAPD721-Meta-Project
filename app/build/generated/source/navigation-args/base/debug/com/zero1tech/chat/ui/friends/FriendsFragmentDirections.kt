package com.zero1tech.chat.ui.friends

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

public class FriendsFragmentDirections private constructor() {
  private data class ActionFriendsFragment2ToChatFragment(
    public val user: UserRemote? = null,
    public val fromSuggest: Boolean = false,
    public val flag: String = "notification",
    public val receiverID: String? = "null"
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_friendsFragment2_to_chatFragment

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

  private data class ActionFriendsFragmentToImagesFragment(
    public val user: UserRemote? = null,
    public val fromSuggest: Boolean = false,
    public val flag: String = "notification",
    public val receiverID: String? = "null"
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_friendsFragment_to_imagesFragment

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

  private data class ActionFriendsFragmentToChatBotFragment(
    public val user: UserRemote? = null,
    public val fromSuggest: Boolean = false,
    public val flag: String = "notification",
    public val receiverID: String? = "null"
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_friendsFragment_to_chatBotFragment

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

  private data class ActionFriendsFragmentToInfoDialog(
    public val cities: Array<String>?
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_friendsFragment_to_infoDialog

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putStringArray("cities", this.cities)
      return result
    }
  }

  public companion object {
    public fun actionFriendsFragment2ToChatFragment(
      user: UserRemote? = null,
      fromSuggest: Boolean = false,
      flag: String = "notification",
      receiverID: String? = "null"
    ): NavDirections = ActionFriendsFragment2ToChatFragment(user, fromSuggest, flag, receiverID)

    public fun actionFriendsFragmentToImagesFragment(
      user: UserRemote? = null,
      fromSuggest: Boolean = false,
      flag: String = "notification",
      receiverID: String? = "null"
    ): NavDirections = ActionFriendsFragmentToImagesFragment(user, fromSuggest, flag, receiverID)

    public fun actionFriendsFragmentToChatBotFragment(
      user: UserRemote? = null,
      fromSuggest: Boolean = false,
      flag: String = "notification",
      receiverID: String? = "null"
    ): NavDirections = ActionFriendsFragmentToChatBotFragment(user, fromSuggest, flag, receiverID)

    public fun actionFriendsFragmentToInfoDialog(cities: Array<String>?): NavDirections =
        ActionFriendsFragmentToInfoDialog(cities)

    public fun actionFriendsFragmentToRequestFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_friendsFragment_to_requestFragment)

    public fun actionFriendsFragmentToRequestFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_friendsFragment_to_requestFragment2)

    public fun actionFriendsFragmentToPeopleFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_friendsFragment_to_peopleFragment)

    public fun actionGlobalRequestFragment(): NavDirections =
        NavGraphXmlDirections.actionGlobalRequestFragment()

    public fun actionGlobalDialog(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalDialog(cities)

    public fun actionGlobalToRoomChat(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalToRoomChat(cities)
  }
}
