package com.example.projectkt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.projectkt.core.components.ProjectAppBar
import com.example.projectkt.features.AppDrawerContent
import com.example.projectkt.ui.theme.ProjectktTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectktTheme {
                val navController = rememberNavController()
                val drawerState = rememberDrawerState(DrawerValue.Closed)
                val scope = rememberCoroutineScope()

                val currentBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = currentBackStackEntry?.destination?.route


                val navigateTopLevel: (String) -> Unit = { route ->
                    navController.navigate(route) {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        // Avoid multiple copies of the same destination when
                        // re-selecting the same item
                        launchSingleTop = true
                        // Restore state when re-selecting a previously selected item
                        restoreState = true
                    }
                }


                Row(Modifier.fillMaxSize()) {
                    ModalNavigationDrawer(
                        drawerState = drawerState,
                        drawerContent = {
                            AppDrawerContent(
                                currentRoute = currentRoute,
                                onNavigate = { route ->
                                    scope.launch {
                                        if (drawerState.isOpen) drawerState.close()

                                        navController.navigate(route) {
                                            // Keep a single instance of each top-level destination
                                            popUpTo(navController.graph.startDestinationId) { saveState = true }
                                            launchSingleTop = true
                                            restoreState = true
                                        }
                                    }
                                },
                            )
                        }
                    ) {
                        Scaffold(
                            topBar = {
                                ProjectAppBar(
                                    title = getTitle(currentRoute),
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
                                modifier = Modifier.padding(innerPadding),
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}

private fun getTitle(route: String?): Int {
    val baseRoute = route
        ?.substringBefore("?")
        ?.substringBefore("/")

    return when (baseRoute) {
        AppRoutes.DASHBOARD -> R.string.btn_dashboard
        AppRoutes.PROJECT_TRACKER -> R.string.btn_project_tracker
        AppRoutes.DAILY_LOG -> R.string.btn_daily_log
        else -> R.string.app_name
    }
}
