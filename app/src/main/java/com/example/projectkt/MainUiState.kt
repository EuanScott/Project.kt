package com.example.projectkt

sealed interface MainUiState {
    data object Loading : MainUiState
    data object Success : MainUiState
    data object Error : MainUiState
}
