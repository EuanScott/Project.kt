package com.example.projectkt.core.ui.navigation

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


// TODO: Get the UI looking good here (make sidemenu an overlay rather than pushing out the page)
// TODO: Ensure that everything is done as per the ADR
// TODO: Add in tests for this
// TODO: Create the profile side-sheet

enum class TopLevelDestination(
    val route: Any,
    @param:StringRes val labelRes: Int,
    val icon: ImageVector
) {
    DASHBOARD(
        route = Dashboard,
        labelRes = R.string.nav_header_dashboard,
        icon = Icons.Default.Home
    ),
    DAILY_LOG(
        route = DailyLog,
        labelRes = R.string.nav_header_daily_log,
        icon = Icons.Default.Edit
    ),
    PROJECT_TRACKER(
        route = ProjectTracker,
        labelRes = R.string.nav_header_project_tracker,
        icon = Icons.Default.LocationOn
    );

    companion object {
        fun findByNavDestination(navDestination: NavDestination?): TopLevelDestination? {
            return entries.find { navDestination?.hasRoute(it.route::class) == true }
        }
    }
}