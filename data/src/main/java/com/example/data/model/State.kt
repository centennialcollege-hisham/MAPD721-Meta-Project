package com.example.data.model

sealed class State<T> {

    class Loading<T>(val show : Boolean) : State<T>()
    data class Success<T>(val data: T) : State<T>()
    data class Failed<T>(val errorMessage: Exception) : State<T>()


    companion object {
        fun <T> loading( show : Boolean) = Loading<T>(show)
        fun <T> success(data: T) = Success(data)
        fun <T> failed(exception: Exception) = Failed<T>(exception)
    }
}