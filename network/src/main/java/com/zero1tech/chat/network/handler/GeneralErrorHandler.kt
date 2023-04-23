package com.zero1tech.chat.network.handler

import android.content.Context
import com.zero1tech.chat.network.mapper.GeneralErrorMapper
import com.zero1tech.chat.network.R
import com.zero1tech.chat.network.exceptions.NetworkException
import com.zero1tech.chat.network.exceptions.NoConnectivityException
import com.zero1tech.chat.network.exceptions.ServerException

open class GeneralErrorHandler(
    private val context: Context,
    private val errorMapper: GeneralErrorMapper
) {

    open fun getMessage(throwable: Throwable): String {
        return getMessage(networkException = errorMapper.map(throwable))
    }

    fun getMessage(networkException: NetworkException): String {
        return when (networkException) {
            is NoConnectivityException -> {
                context.getString(R.string.message_no_internet_connection)
            }
            is ServerException -> {
                networkException.serverError.getErrorMessage()
            }
            else -> {
                context.getString(R.string.message_something_went_wrong)
            }
        }
    }

    open fun getTitle(throwable: Throwable): String {
        return when (errorMapper.map(throwable)) {
            is NoConnectivityException -> {
                context.getString(R.string.title_no_internet_connection)
            }
            else -> {
                context.getString(R.string.title_something_went_wrong)
            }
        }
    }
}
