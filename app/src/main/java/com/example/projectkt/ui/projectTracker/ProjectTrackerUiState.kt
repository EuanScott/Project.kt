package com.example.projectkt.ui.projectTracker

sealed interface ProjectTrackerUiState {
    data object Loading : ProjectTrackerUiState
    data object Success : ProjectTrackerUiState
    data object Error : ProjectTrackerUiState
}
