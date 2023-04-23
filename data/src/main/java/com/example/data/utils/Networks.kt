package com.example.data.utils

import androidx.annotation.WorkerThread
import java.net.InetAddress

@WorkerThread
fun isInternetAvailable(): Boolean {
    return try {
        val inetAddress: InetAddress = InetAddress.getByName("google.com")
        !inetAddress.equals("")
    } catch (e: Exception) {
        false
    }
}
