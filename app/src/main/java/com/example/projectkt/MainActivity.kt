// MainActivity.kt
package com.example.projectkt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.projectkt.features.dashboard.DashboardScreen
import com.example.projectkt.ui.theme.ProjectktTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectktTheme {
                DashboardScreen()
            }
        }
    }
}
