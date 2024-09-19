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
        "Content-Type: application/json; charset=utf-8",
        "Authorization: Basic NmI0Y2IxN2EtNzExZC00MGNmLWJmZTMtZjE3ZDI3ZThmZGY1" // Replace with your REST API key
    )
    @POST("notifications")
    fun createNotification(@Body notification: OneSignalNotification): Call<Unit>
}

