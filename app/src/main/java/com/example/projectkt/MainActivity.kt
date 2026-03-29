package com.example.projectkt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DismissibleNavigationDrawer
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.projectkt.core.components.AppBar
import com.example.projectkt.core.ui.theme.AppTheme
import com.example.projectkt.ui.AppDrawerContent
import com.example.projectkt.core.ui.navigation.TopLevelDestination
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme() {
                val navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()

                // 1. Get the NavDestination object instead of the String route
                val currentDestination = navBackStackEntry?.destination

                val drawerState = rememberDrawerState(DrawerValue.Closed)
                val scope = rememberCoroutineScope()

                val currentTopLevel = TopLevelDestination.findByNavDestination(currentDestination)
                val titleRes = currentTopLevel?.labelRes ?: R.string.common_app_name

                DismissibleNavigationDrawer(
                    drawerState = drawerState,
                    drawerContent = {
                        AppDrawerContent(
                            // 2. Pass the destination object
                            currentDestination = currentDestination,
                            onNavigate = { route ->
                                navController.navigate(route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                                scope.launch { drawerState.close() }
                            }
                        )
                    }
                ) {
                    Scaffold(
                        topBar = {
                            AppBar(
                                title = stringResource(titleRes),
                                navigationIcon = Icons.Default.Menu,
                                onNavigationIconClick = {
                                    scope.launch {
                                        if (drawerState.isOpen) drawerState.close()
                                        else drawerState.open()
                                    }
                                }
                            )
                        }
                    ) { innerPadding ->
                        AppNavigation(
                            navController = navController,
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }
}

