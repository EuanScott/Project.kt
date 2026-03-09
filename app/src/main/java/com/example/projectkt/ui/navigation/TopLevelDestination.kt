package com.example.projectkt.ui.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute
import com.example.projectkt.DailyLog
import com.example.projectkt.Dashboard
import com.example.projectkt.ProjectTracker
import com.example.projectkt.R
enum class TopLevelDestination(
    val route: Any,
    @StringRes val labelRes: Int,
    val icon: ImageVector
) {
    DASHBOARD(
        route = Dashboard,
        labelRes = R.string.btn_dashboard,
        icon = Icons.Default.Home
    ),
    DAILY_LOG(
        route = DailyLog,
        labelRes = R.string.btn_daily_log,
        icon = Icons.Default.Edit
    ),
    PROJECT_TRACKER(
        route = ProjectTracker,
        labelRes = R.string.btn_project_tracker,
        icon = Icons.Default.LocationOn
    );

    companion object {
        fun findByNavDestination(navDestination: NavDestination?): TopLevelDestination? {
            return entries.find { navDestination?.hasRoute(it.route::class) == true }
        }
    }

}