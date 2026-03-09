package com.example.projectkt

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.projectkt.features.dailyLog.DailyLogScreen
import com.example.projectkt.features.dashboard.DashboardScreen
import com.example.projectkt.features.projectTracker.ProjectTrackerScreen
import kotlinx.serialization.Serializable

@Serializable
sealed interface AppRoute

@Serializable
data object Dashboard : AppRoute

@Serializable
data object DailyLog : AppRoute

@Serializable
data object ProjectTracker : AppRoute


@Composable
fun AppNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Dashboard,
        modifier = modifier
    ) {
        composable<Dashboard> { DashboardScreen() }
        composable<DailyLog> { DailyLogScreen() }
        composable<ProjectTracker> { ProjectTrackerScreen() }
    }
}
