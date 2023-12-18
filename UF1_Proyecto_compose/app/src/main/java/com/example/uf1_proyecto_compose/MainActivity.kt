@file:OptIn(
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
)

package com.example.uf1_proyecto_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.uf1_proyecto_compose.ui.components.BottomNavigation
import com.example.uf1_proyecto_compose.ui.navigation.AppNavigation
import com.example.uf1_proyecto_compose.ui.news.NewsViewModel
import com.example.uf1_proyecto_compose.ui.theme.Theme


class MainActivity : ComponentActivity() {
    private val newsViewModel: NewsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(newsViewModel)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    newsViewModel: NewsViewModel
) {
    val navController = rememberNavController()


    Scaffold(bottomBar = {
        BottomNavigation(navController)
    }) { padding ->
        Box(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()

        ) {
            AppNavigation(navController = navController, newsViewModel = newsViewModel)
        }
    }
}

var playing by mutableStateOf(false)