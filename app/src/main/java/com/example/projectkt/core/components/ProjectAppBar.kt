package com.example.projectkt.core.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.projectkt.R
import com.example.projectkt.ui.theme.ProjectktTheme

/**
 * Reusable TopAppBar component for the application.
 *
 * @param title The string resource id to display in the app bar.
 * @param modifier Modifier to be applied to the TopAppBar.
 * @param navigationIcon The icon to display on the left side (e.g., Menu, Back arrow).
 * @param onNavigationIconClick Lambda to be invoked when the navigation icon is clicked.
 * @param actions A Composable lambda for displaying additional actions on the right side.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProjectAppBar(
    title: Int,
    modifier: Modifier = Modifier,
    navigationIcon: ImageVector,
    onNavigationIconClick: (() -> Unit),
    actions: @Composable RowScope.() -> Unit = {}
) {
    TopAppBar(
        title = { Text(text = stringResource(id = title)) },
        modifier = modifier,
        navigationIcon = {
            if (navigationIcon != null && onNavigationIconClick != null) {
                IconButton(onClick = onNavigationIconClick) {
                    Icon(
                        imageVector = navigationIcon,
                        contentDescription = "Navigation icon"
                    )
                }
            }
        },
        actions = actions,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onSecondary,
            navigationIconContentColor = MaterialTheme.colorScheme.onSecondary,
            actionIconContentColor = MaterialTheme.colorScheme.onSecondary
        )
    )
}

@Preview(showBackground = true)
@Composable
fun ProjectAppBarPreview_Menu() {
    ProjectktTheme {
        ProjectAppBar(
            title = R.string.btn_dashboard,
            navigationIcon = Icons.Default.Menu,
            onNavigationIconClick = { /* no-op for preview */ }
        )
    }
}