package com.example.projectkt.navigation

sealed class Screen(val route: String) {
    object Main : Screen(route = "main")
}