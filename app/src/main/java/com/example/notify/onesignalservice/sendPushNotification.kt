package com.example.notify.onesignalservice

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun sendPushNotification(subscriptionIds: List<String>, title: String, message: String) {
    val notification = OneSignalNotification(
        app_id = "5523200d-4cd5-4150-930a-ccb64ec8f1a2", // Replace with your OneSignal app ID
        name = mapOf("en" to "My Notification Name"),
        contents = mapOf("en" to message),
        headings = mapOf("en" to title),
        include_subscription_ids = subscriptionIds
    )

    OneSignalApi.service.createNotification(notification).enqueue(object : Callback<Unit> {
        override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
            if (response.isSuccessful) {
                Log.d("OneSignalss", "Notification sent successfully.")
            } else {
                Log.e("OneSignalss", "Error sending notification: ${response.errorBody()?.string()}")
            }
        }

        override fun onFailure(call: Call<Unit>, t: Throwable) {
            Log.e("OneSignalss", "Error sending notification : ${t.message}")
        }
    })
}
