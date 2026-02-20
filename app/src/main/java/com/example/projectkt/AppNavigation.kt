package com.example.projectkt

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projectkt.features.dailyLog.DailyLogScreen
import com.example.projectkt.features.dashboard.DashboardScreen
import com.example.projectkt.features.projectTracker.ProjectTrackerScreen

/**
 * Defines the routes for the application's navigation graph.
 */
object AppRoutes {
    const val DASHBOARD = "dashboard"
    const val DAILY_LOG = "daily_log"
    const val PROJECT_TRACKER = "project_tracker"
}

/**
 * The main navigation graph for the application.
 * This Composable hosts all the different screens and manages navigation between them.
 */
@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = AppRoutes.DASHBOARD
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(AppRoutes.DASHBOARD) {
            DashboardScreen()
        }
        composable(AppRoutes.PROJECT_TRACKER) {
            ProjectTrackerScreen()
        }
        composable(AppRoutes.DAILY_LOG) {
            DailyLogScreen()
        }
//        TODO: Make this a side drawer
//        composable(AppRoutes.PROFILE) {
//            ProfileScreen(
//                onNavigateBack = { navController.popBackStack() }
//            )
//        }

    }
}
