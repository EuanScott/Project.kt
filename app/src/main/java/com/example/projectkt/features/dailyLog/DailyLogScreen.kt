package com.example.projectkt.features.dailyLog

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.projectkt.R
import com.example.projectkt.core.components.EmptyState
import com.example.projectkt.core.components.LoadingState
import com.example.projectkt.ui.theme.ProjectktTheme

@Composable
fun DailyLogScreen(
    modifier: Modifier = Modifier,
    viewModel: DailyLogViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    when (uiState) {
        DailyLogUiState.Loading -> LoadingState(modifier = modifier)
        DailyLogUiState.Error -> EmptyState(modifier = modifier)
        DailyLogUiState.Success -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(stringResource(R.string.btn_daily_log))
            }
        }
    }
}

@Preview(showBackground = true, device = "id:pixel_tablet", showSystemUi = true)
@Composable
fun DailyLogScreenPreview() {
    ProjectktTheme {
        DailyLogScreen()
    }
}
