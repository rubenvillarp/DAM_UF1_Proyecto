@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.uf1_proyecto_compose.ui.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navArgument
import com.example.uf1_proyecto_compose.data.Article
import com.example.uf1_proyecto_compose.ui.components.ArticleFullPage
import com.example.uf1_proyecto_compose.ui.news.NewsScreen
import com.example.uf1_proyecto_compose.ui.news.NewsViewModel
import com.example.uf1_proyecto_compose.ui.player.PlayerScreen
import com.example.uf1_proyecto_compose.ui.player.PlayerViewModel
import com.example.uf1_proyecto_compose.ui.podcasts.PodcastsScreen
import com.example.uf1_proyecto_compose.ui.requests.RequestsScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation(
    navController: NavHostController,
    newsViewModel: NewsViewModel
) {
    NavHost(navController = navController, startDestination = NavScreen.News.name) {
        composable(NavScreen.News.name) { NewsScreen(newsViewModel, navController) }
        composable(NavScreen.Player.name) { PlayerScreen() }
        composable(NavScreen.Requests.name) { RequestsScreen() }
        composable(NavScreen.Podcasts.name) { PodcastsScreen() }
        composable(
            Screen.Article.route,
            arguments = listOf(
                navArgument("title") {
                    type = NavType.StringType
                },
                navArgument("image") {
                    type = NavType.StringType
                },
                navArgument("datePublished") {
                    type = NavType.StringType
                },
                navArgument("contentText") {
                    type = NavType.StringType
                },
                navArgument("tags") {
                    type = NavType.StringArrayType
                }

            )
        ) { backStackEntry ->
            ArticleFullPage(
                navController = navController,
                title = backStackEntry.arguments?.getString("title") ?: "",
                image = backStackEntry.arguments?.getString("image") ?: "",
                datePublished = backStackEntry.arguments?.getString("datePublished") ?: "",
                contentText = backStackEntry.arguments?.getString("contentText") ?: "",
                tags = backStackEntry.arguments?.getStringArray("tags")?.toList() ?: listOf()
            )
        }
    }
}


@Composable
fun ArticleNavigation(
    navController: NavHostController,
    article: Article
) {
    NavHost(navController = navController, startDestination = NavScreen.Article.name) {

    }

}

@Composable
fun currentRoute(navController: NavHostController): String? =
    navController.currentBackStackEntryAsState().value?.destination?.route