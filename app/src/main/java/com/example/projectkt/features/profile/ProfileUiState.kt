package com.example.projectkt.features.profile

sealed interface ProfileUiState {
    data object Loading : ProfileUiState
    data object Success : ProfileUiState
    data object Error : ProfileUiState
}
