package com.example.projectkt.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DismissibleDrawerSheet
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
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute
import com.example.projectkt.R
import com.example.projectkt.core.ui.navigation.TopLevelDestination

@Composable
fun AppDrawerContent(
    currentDestination: NavDestination?,
    onNavigate: (Any) -> Unit,
) {
    DismissibleDrawerSheet {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 20.dp)
        ) {
            Text(
                text = stringResource(id = R.string.app_name),
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.weight(1f)
            )
        }

        TopLevelDestination.entries.forEach { destination ->
            NavigationDrawerItem(
                label = {
                    Text(text = stringResource(id = destination.labelRes))
                },
                selected = currentDestination?.hasRoute(destination.route::class) == true,
                onClick = { onNavigate(destination.route) },
                icon = {
                    Icon(imageVector = destination.icon, contentDescription = null)
                },
                modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
            )
        }
    }
}
