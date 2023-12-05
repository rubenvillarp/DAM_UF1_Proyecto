@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.uf1_proyecto_compose.ui.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.uf1_proyecto_compose.ui.news.NewsScreenTest
import com.example.uf1_proyecto_compose.ui.news.NewsViewModel
import com.example.uf1_proyecto_compose.ui.player.PlayerScreen
import com.example.uf1_proyecto_compose.ui.player.PlayerViewModel
import com.example.uf1_proyecto_compose.ui.podcasts.PodcastsScreen
import com.example.uf1_proyecto_compose.ui.requests.RequestsScreen

@Composable
fun AppNavigation(
    navController: NavHostController,
    viewModel: ViewModel
) {
    NavHost(navController = navController, startDestination = NavScreen.News.name) {
        composable(NavScreen.News.name) { NewsScreenTest(viewModel as NewsViewModel) }
        composable(NavScreen.Player.name) { PlayerScreen(viewModel as PlayerViewModel) }
        composable(NavScreen.Requests.name) { RequestsScreen() }
        composable(NavScreen.Podcasts.name) { PodcastsScreen() }
    }
}

@Composable
fun currentRoute(navController: NavHostController): String? =
    navController.currentBackStackEntryAsState().value?.destination?.route