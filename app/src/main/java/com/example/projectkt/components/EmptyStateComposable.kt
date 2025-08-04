package com.example.projectkt.components

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.projectkt.R
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
            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.error_message_header),
                )
                Text(
                    text = stringResource(id = R.string.error_message_body),
                )
                TextButton(onClick = {
                    Log.d("EmptyState", "Retry button pressed")
                }) {
                    Text(text = stringResource(id = R.string.btn_retry))
                }
            }
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