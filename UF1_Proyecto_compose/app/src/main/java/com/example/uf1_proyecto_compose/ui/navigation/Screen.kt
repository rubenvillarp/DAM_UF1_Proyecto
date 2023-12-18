package com.example.uf1_proyecto_compose.ui.navigation

sealed class Screen(val route: String) {
    data object News : Screen("news")
    data object Player : Screen("player")
    data object Requests : Screen("requests")
    data object Podcasts : Screen("podcasts")
    data object Article : Screen("article/{title}/{image}/{datePublished}/{contentText}/{tags}")
}