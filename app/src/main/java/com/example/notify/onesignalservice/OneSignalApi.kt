package com.example.notify.onesignalservice


import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object OneSignalApi {
    private val okHttpClient: OkHttpClient = OkHttpClient.Builder()
        .retryOnConnectionFailure(true)
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.onesignal.com/") // Base URL for OneSignal API
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    val service: OneSignalApiService = retrofit.create(OneSignalApiService::class.java)
}
