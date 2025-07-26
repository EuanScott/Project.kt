package com.example.projectkt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.projectkt.components.EmptyState
import com.example.projectkt.components.LoadingState
import com.example.projectkt.ui.theme.ProjectktTheme

enum class UiState {
    Loading,
    Error,
    Empty,
    DataRetrieved
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectktTheme {
                MainScreen()
            }
        }
    }


    @Composable
    fun MainScreen() {
        // Hard-coded state to simulate different UI states
        val currentState = remember { UiState.Empty } // Change this to test different states

        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            when (currentState) {
                UiState.Loading -> LoadingState(modifier = Modifier.padding(innerPadding))
                UiState.Error -> {
                    // TODO: Empty State
                }

                UiState.Empty -> EmptyState(modifier = Modifier.padding(innerPadding))
                UiState.DataRetrieved -> {
                    // TODO: DataRetrieved State
                }
            }
        }
    }

    @Preview(showBackground = true, device = "id:pixel_tablet", showSystemUi = true)
    @Composable
    fun MainScreenPreview() {
        ProjectktTheme {
            MainScreen()
        }
    }
}