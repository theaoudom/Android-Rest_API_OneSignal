package com.example.notify

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.notify.onesignalservice.sendPushNotification
import com.example.notify.ui.theme.NotifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotifyTheme {
                Column (
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = "My App",
                        modifier = Modifier
                            .clickable {
                                sendPushNotification(
                                    subscriptionIds = listOf("9bf935c3-f323-440a-9cdf-2d14ddc46b46","4e1d8e7f-f4d5-4502-aacf-aade34deafe2","09f167ed-f331-4b9d-9020-16fc05adbb2b"), // Replace with actual subscription IDs
                                    title = "English Title",
                                    message = "English Message"
                                )

                            }
                    )
                }
            }
        }
    }
}
