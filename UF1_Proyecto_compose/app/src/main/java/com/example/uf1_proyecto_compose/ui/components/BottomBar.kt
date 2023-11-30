package com.example.uf1_proyecto_compose.ui.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.uf1_proyecto_compose.ui.navigation.BarDestination.News
import com.example.uf1_proyecto_compose.ui.navigation.BarDestination.Player
import com.example.uf1_proyecto_compose.ui.navigation.BarDestination.Podcasts
import com.example.uf1_proyecto_compose.ui.navigation.BarDestination.Requests
import com.example.uf1_proyecto_compose.ui.navigation.currentRoute

@Composable
fun BottomNavigation(
    navController: NavHostController
) {
    val menuItems = listOf(News, Player, Requests, Podcasts)
    BottomAppBar {
        NavigationBar {
            menuItems.forEach { item ->
                val selected = currentRoute(navController) == item.route
                NavigationBarItem(selected = selected,
                    onClick = { navController.navigate(item.route) },
                    icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                    label = { Text(text = item.title) })
            }
        }
    }
}