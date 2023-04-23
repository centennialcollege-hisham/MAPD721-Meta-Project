package com.zero1tech.chat.ui.activities

import com.zero1tech.chat.R



interface AddressableActivity {
    val action: Int
}

object Activities {

    object Home : AddressableActivity {
        override val action: Int = R.id.friendsFragment
    }

    object Maintenance : AddressableActivity {
        override val action: Int = R.id.maintenanceFragment
    }

    object ForceUpdate : AddressableActivity {
        override val action: Int = R.id.forceUpdateFragment
    }


}
