package com.example.projectkt

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.projectkt.components.EmptyState
import com.example.projectkt.components.LoadingState
import com.example.projectkt.ui.theme.ProjectktTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectktTheme {
                val viewModel: MainViewModel = hiltViewModel()

                Log.d("MainActivity", "ViewModel instance received in UI.")

                MainScreen()
            }
        }
    }


    @Composable
    fun MainScreen(viewModel: MainViewModel = hiltViewModel()) {
        val uiState by viewModel.uiState.collectAsStateWithLifecycle()

        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            when (uiState) {
                MainUiState.Loading -> LoadingState(modifier = Modifier.padding(innerPadding))
                MainUiState.Error -> EmptyState(modifier = Modifier.padding(innerPadding))
                MainUiState.Success -> {
                    // TODO: Success State
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