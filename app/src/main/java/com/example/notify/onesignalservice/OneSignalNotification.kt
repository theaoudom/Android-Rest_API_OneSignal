package com.example.notify.onesignalservice

data class OneSignalNotification(
    val app_id: String,
    val name: Map<String, String>,
    val contents: Map<String, String>,
    val headings: Map<String, String>,
    val include_subscription_ids: List<String>
)
