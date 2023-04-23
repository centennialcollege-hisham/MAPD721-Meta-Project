package com.zero1tech.chat.network.handler

class ErrorHandler {

    fun handle(throwable: Throwable): ErrorCatcher {
        return ErrorCatcher(throwable)
    }
}
