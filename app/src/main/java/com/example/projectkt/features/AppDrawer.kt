package com.example.projectkt.features

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.DismissibleDrawerSheet
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.projectkt.AppRoutes
import com.example.projectkt.R

@Composable
fun AppDrawerContent(
    currentRoute: String?,
    onNavigate: (String) -> Unit,
) {
    DismissibleDrawerSheet {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = stringResource(id = R.string.app_name),
                Modifier
                    .padding(16.dp)
                    .weight(1f),
                style = MaterialTheme.typography.titleLarge
            )
        }

        HorizontalDivider()

        NavigationDrawerItem(
            label = { Text("Dashboard") },
            selected = currentRoute == AppRoutes.DASHBOARD,
            onClick = { onNavigate(AppRoutes.DASHBOARD) },
            icon = { Icon(Icons.Default.Home, contentDescription = null) },
            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
        )

        NavigationDrawerItem(
            label = { Text("Daily Log") },
            selected = currentRoute == AppRoutes.DAILY_LOG,
            onClick = { onNavigate(AppRoutes.DAILY_LOG) },
            icon = { Icon(Icons.Default.Edit, contentDescription = null) },
            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
        )

        NavigationDrawerItem(
            label = { Text("Project Tracker") },
            selected = currentRoute == AppRoutes.PROJECT_TRACKER,
            onClick = { onNavigate(AppRoutes.PROJECT_TRACKER) },
            icon = { Icon(Icons.Default.LocationOn, contentDescription = null) },
            modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
        )
    }
}
