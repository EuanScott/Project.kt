package com.example.projectkt.features.dailyLog

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DailyLogViewModel @Inject constructor() : ViewModel() {

    // Private mutable state that can be changed only within the ViewModel
    private val _uiState = MutableStateFlow<DailyLogUiState>(DailyLogUiState.Loading)

    // Public immutable state that the UI can observe
    val uiState = _uiState.asStateFlow()

    init {
        mockDataFetch()
    }

    private fun mockDataFetch() {
        viewModelScope.launch {
            delay(2000)
            _uiState.value = DailyLogUiState.Success
        }
    }
}
