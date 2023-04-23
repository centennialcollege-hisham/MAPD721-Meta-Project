package com.zero1tech.chat.network.mapper

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.zero1tech.chat.network.exceptions.NetworkException
import com.zero1tech.chat.network.exceptions.ServerError
import com.zero1tech.chat.network.exceptions.ServerException
import com.zero1tech.chat.network.exceptions.UnexpectedException
import retrofit2.HttpException

open class GeneralErrorMapper : ErrorMapper() {

    private val moshi by lazy { Moshi.Builder().add(KotlinJsonAdapterFactory()).build() }
    private val errorsJsonAdapter by lazy { moshi.adapter(ServerError::class.java) }

    override fun handle(throwable: Throwable): NetworkException {
        if (throwable is HttpException) {
            val json = throwable.response()?.errorBody()?.string()
            return getServerError(throwable, json)
        }
        return UnexpectedException(throwable)
    }

    private fun getServerError(throwable: HttpException, json: String?): NetworkException {
        return if (json != null) {
            try {
                val errors = errorsJsonAdapter.fromJson(json)!!
                ServerException(throwable, errors, throwable.code(), throwable.message())
            } catch (ignored: Throwable) {
                ServerException(
                    throwable,
                    ServerError(false, json, listOf()),
                    throwable.code(),
                    throwable.message()
                )
            }
        } else {
            ServerException(
                throwable,
                ServerError(false, json, listOf(), json),
                throwable.code(),
                throwable.message()
            )
        }
    }
}
