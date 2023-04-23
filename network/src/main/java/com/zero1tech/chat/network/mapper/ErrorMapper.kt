package com.zero1tech.chat.network.mapper

import com.zero1tech.chat.network.exceptions.NetworkException
import com.zero1tech.chat.network.exceptions.NoConnectivityException
import com.zero1tech.chat.network.exceptions.TimeoutException
import com.google.firebase.FirebaseNetworkException
import java.io.IOException
import java.net.SocketTimeoutException

abstract class ErrorMapper {

    fun map(throwable: Throwable): NetworkException {
        return when (throwable) {
            is SocketTimeoutException -> {
                TimeoutException(throwable)
            }
            is IOException -> {
                NoConnectivityException(throwable)
            }
            is FirebaseNetworkException -> {
                NoConnectivityException(throwable)
            }
            else -> {
                handle(throwable)
            }
        }
    }

    protected abstract fun handle(throwable: Throwable): NetworkException
}
