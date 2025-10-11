package com.example.projectkt.features.dashboard

sealed interface DashboardUiState {
    data object Loading : DashboardUiState
    data object Success : DashboardUiState
    data object Error : DashboardUiState
}
