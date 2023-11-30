@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.uf1_proyecto_compose.ui.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.uf1_proyecto_compose.ui.news.NewsScreen
import com.example.uf1_proyecto_compose.ui.player.PlayerScreen
import com.example.uf1_proyecto_compose.ui.podcasts.PodcastsScreen
import com.example.uf1_proyecto_compose.ui.requests.RequestsScreen

@Composable
fun AppNavigation(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = NavScreen.News.name) {
        composable(NavScreen.News.name) { NewsScreen() }
        composable(NavScreen.Player.name) { PlayerScreen() }
        composable(NavScreen.Requests.name) { RequestsScreen() }
        composable(NavScreen.Podcasts.name) { PodcastsScreen() }
    }
}

@Composable
fun currentRoute(navController: NavHostController): String? =
    navController.currentBackStackEntryAsState().value?.destination?.route