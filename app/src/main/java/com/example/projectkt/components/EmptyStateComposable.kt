package com.example.projectkt.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.tooling.preview.Preview
import com.example.projectkt.ui.theme.ProjectktTheme

@Composable
fun EmptyState(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (LocalInspectionMode.current) {
            Text(
                text = "Preview Window",
                modifier = modifier
            )
        } else {
            Text(
                text = "Oops, there is nothing to display here!",
                modifier = modifier
            )
        }
    }
}


@Preview(showBackground = true, device = "id:pixel_tablet", showSystemUi = true)
@Composable
fun EmptyStatePreview() {
    ProjectktTheme {
        EmptyState()
    }
}