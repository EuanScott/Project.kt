package com.example.projectkt.features.dailyLog

sealed interface DailyLogUiState {
    data object Loading : DailyLogUiState
    data object Success : DailyLogUiState
    data object Error : DailyLogUiState
}
