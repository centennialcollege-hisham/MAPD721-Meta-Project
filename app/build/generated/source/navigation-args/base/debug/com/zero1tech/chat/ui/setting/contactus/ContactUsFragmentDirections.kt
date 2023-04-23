package com.zero1tech.chat.ui.setting.contactus

import androidx.navigation.NavDirections
import com.zero1tech.chat.NavGraphXmlDirections
import kotlin.Array
import kotlin.String

public class ContactUsFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalRequestFragment(): NavDirections =
        NavGraphXmlDirections.actionGlobalRequestFragment()

    public fun actionGlobalDialog(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalDialog(cities)

    public fun actionGlobalToRoomChat(cities: Array<String>?): NavDirections =
        NavGraphXmlDirections.actionGlobalToRoomChat(cities)
  }
}
