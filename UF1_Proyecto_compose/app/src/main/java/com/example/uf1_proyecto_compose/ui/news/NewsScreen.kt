package com.example.uf1_proyecto_compose.ui.news

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.uf1_proyecto_compose.playing
import com.example.uf1_proyecto_compose.ui.components.Article
import com.example.uf1_proyecto_compose.ui.components.PlayerMini

@Composable
fun NewsScreen(viewModel: NewsViewModel, navController: NavController) {
    val news by viewModel.articles.observeAsState()

    LaunchedEffect(Unit) {
        viewModel.fetchNews()
    }

    Column {
        if (news == null) {
            // Show loading indicator or placeholder
            Text(text = "Loading...")
        } else {
            // Display the list of credit cards
            val articles = news!!.items

            Column(
                modifier = Modifier
                    .fillMaxSize()

            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    LazyColumn {
                        item {
                            Divider(
                                thickness = 32.dp,
                                color = Color.Transparent
                            )
                        }
                        items(articles) { article ->

                            Article(navController, article)


                            Divider(
                                thickness = 32.dp,
                                color = Color.Transparent
                            )
                        }
                    }
                }
                if (playing) {
                    Row(
                    ) {
                        PlayerMini()
                    }
                }
            }
        }
    }
}