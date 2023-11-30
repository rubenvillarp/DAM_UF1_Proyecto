package com.example.uf1_proyecto_compose.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.Newspaper
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Podcasts
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.uf1_proyecto_compose.ui.news.NewsScreen

sealed class BarDestination (
    val icon: ImageVector,
    val title :String,
    val route: String
) {
    object News : BarDestination (
        Icons.Filled.Newspaper,
        "Noticias",
        NavScreen.News.name
    )

    object Player : BarDestination (
        Icons.Filled.PlayArrow,
        "Reproductor",
        NavScreen.Player.name
    )

    object Requests : BarDestination (
        Icons.Filled.Message,
        "Peticiones",
        NavScreen.Requests.name
    )

    object Podcasts : BarDestination (
        Icons.Filled.Podcasts,
        "Podcasts",
        NavScreen.Podcasts.name
    )
}