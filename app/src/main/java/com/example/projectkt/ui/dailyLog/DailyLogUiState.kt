package com.example.projectkt.ui.dailyLog

// TODO: Can I do a shared state?

sealed interface DailyLogUiState {
    data object Loading : DailyLogUiState
    data object Success : DailyLogUiState
    data object Error : DailyLogUiState
}
