package com.example.data.notification

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import javax.inject.Singleton

@Singleton
interface
ApiService  {
    @Headers(
        "Content-Type:application/json",
        "Authorization:key=AAAALrNxlSs:APA91bHcTAJ0ma4DvJ-MH3JVZjvw0_6S-IjXlAUogr8MJ4xa85Wrdx3MynJh_zYoQxODS-dm47RCssFBACiPSo34EheK_PbA60I1zKQ7g2FtGuJN5b2o61FhP32knfcWMPs4d10LjicJ"
    )

    @POST("fcm/send")
    fun sendNotification(@Body body: Sender): Call<NotificationResponse>
}