package com.example.uf1_proyecto_compose.ui.navigation

sealed class Screen(val route: String) {
    object News : Screen("news")
    object Player : Screen("player")
    object Requests : Screen("requests")
    object Podcasts : Screen("podcasts")
    object Article : Screen("article/{title}/{image}/{datePublished}/{contentText}/{tags}")
}