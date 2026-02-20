package com.example.projectkt.features.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
fun ProfileScreen(
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: ProfileViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    when (uiState) {
        ProfileUiState.Loading -> LoadingState(modifier = modifier)
        ProfileUiState.Error -> EmptyState(modifier = modifier)
        ProfileUiState.Success -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                TextButton(onClick = {
                    onNavigateBack()
                }) {
                    Text(text = stringResource(id = R.string.btn_dashboard))
                }
            }
        }
    }
}

@Preview(showBackground = true, device = "id:pixel_tablet", showSystemUi = true)
@Composable
fun ProfileScreenPreview() {
    ProjectktTheme {
        ProfileScreen(onNavigateBack = {})
    }
}
