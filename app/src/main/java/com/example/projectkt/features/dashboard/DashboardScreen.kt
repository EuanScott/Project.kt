package com.example.projectkt.features.dashboard

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.projectkt.core.components.EmptyState
import com.example.projectkt.core.components.LoadingState
import com.example.projectkt.ui.theme.ProjectktTheme

@Composable
fun DashboardScreen(viewModel: DashboardViewModel = hiltViewModel()) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        when (uiState) {
            DashboardUiState.Loading -> LoadingState(modifier = Modifier.padding(innerPadding))
            DashboardUiState.Error -> EmptyState(modifier = Modifier.padding(innerPadding))
            DashboardUiState.Success -> {
                // TODO: Success State for Dashboard
            }
        }
    }
}

@Preview(showBackground = true, device = "id:pixel_tablet", showSystemUi = true)
@Composable
fun DashboardScreenPreview() {
    ProjectktTheme {
        DashboardScreen()
    }
}
