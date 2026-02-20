package com.example.projectkt.features.projectTracker

sealed interface ProjectTrackerUiState {
    data object Loading : ProjectTrackerUiState
    data object Success : ProjectTrackerUiState
    data object Error : ProjectTrackerUiState
}
