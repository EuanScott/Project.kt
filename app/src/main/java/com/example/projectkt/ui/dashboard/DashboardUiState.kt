package com.example.projectkt.ui.dashboard

sealed interface DashboardUiState {
    data object Loading : DashboardUiState
    data object Success : DashboardUiState
    data object Error : DashboardUiState
}
