package com.example.notify.onesignalservice

//import retrofit2.Call
//import retrofit2.http.Body
//import retrofit2.http.Headers
//import retrofit2.http.POST
//
//interface OneSignalApiService {
//
//    @Headers(
//        "Content-Type: application/json; charset=utf-8",
//        "Authorization: Basic "
//    )
//    @POST("https://api.onesignal.com/notifications")
//    fun sendNotification(@Body notification: OneSignalNotification): Call<Unit>
//
//}
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.Call

interface OneSignalApiService {
    @Headers(
        "Content-Type: application/json",
        "Authorization: Bearer ZTJhYTJiYjYtMDViMC00ZTJjLTgxOWEtMWIxNTI2NTc0MzBk" // Replace with your REST API key
    )
    @POST("notifications?c=push")
    fun createNotification(@Body notification: OneSignalNotification): Call<Unit>
}

