package com.zero1tech.chat.network.exceptions

abstract class NetworkException(
    throwable: Throwable,
    message: String = throwable.message ?: ""
) : RuntimeException(message, throwable)
