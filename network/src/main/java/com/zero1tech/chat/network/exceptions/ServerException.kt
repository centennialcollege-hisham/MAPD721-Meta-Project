package com.zero1tech.chat.network.exceptions

import com.squareup.moshi.Json


class ServerException constructor(
    throwable: Throwable,
    val serverError: ServerError,
    val statusCode: Int,
    message: String
) : NetworkException(throwable, message)

data class ServerError(

    @Json(name = "status")
    val status: Boolean?,

    @Json(name = "message")
    val message: String?,

    @Json(name = "errors")
    val errors: List<String>?,

    @Json(name = "error")
    val error: String? = "",
) {

    fun getErrorMessage() = if (errors?.isNotEmpty() == true) {
        errors.joinToString { it }
    } else {
        (message ?: error ?: "").replace("\"", "")
    }
}
