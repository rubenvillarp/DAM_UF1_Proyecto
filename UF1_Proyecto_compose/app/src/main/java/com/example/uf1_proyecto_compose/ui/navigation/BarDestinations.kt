package com.example.uf1_proyecto_compose.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.Newspaper
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Podcasts
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BarDestination(
    val icon: ImageVector,
    val title: String,
    val route: String
) {
    data object News : BarDestination(
        Icons.Filled.Newspaper,
        "Noticias",
        NavScreen.News.name
    )

    data object Player : BarDestination(
        Icons.Filled.PlayArrow,
        "Reproductor",
        NavScreen.Player.name
    )

    data object Requests : BarDestination(
        Icons.Filled.Message,
        "Peticiones",
        NavScreen.Requests.name
    )

    data object Podcasts : BarDestination(
        Icons.Filled.Podcasts,
        "Podcasts",
        NavScreen.Podcasts.name
    )
}