package com.example.projectkt.core.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projectkt.R
import com.example.projectkt.ui.theme.ProjectktTheme

@Composable
fun LoadingState(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CircularProgressIndicator(
                color = MaterialTheme.colorScheme.primary,
                strokeWidth = 4.dp
            )
            Text(
                text = stringResource(id = R.string.loading),
                modifier = modifier
            )
        }
    }
}

@Preview(showBackground = true, device = "id:pixel_tablet", showSystemUi = true)
@Composable
fun LoadingStatePreview() {
    ProjectktTheme {
        LoadingState()
    }
}