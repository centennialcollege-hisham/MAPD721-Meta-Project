package com.example.data.model.setting

data class SettingRemote(
    val forceUpdate: Boolean? = false,
    val daysForFlexibleUpdate: Int? = -1,
    val publicRoom: Boolean? = false,
    val minVersionCode: Int = -1,
    val versionCode: Int = -1,
    val versionName: String = "1.0.0.0",
    val shutdown: Boolean? = false,
    val urlLatestVersionApp: String? = "",
    val metaChatLink: String? = ""
)