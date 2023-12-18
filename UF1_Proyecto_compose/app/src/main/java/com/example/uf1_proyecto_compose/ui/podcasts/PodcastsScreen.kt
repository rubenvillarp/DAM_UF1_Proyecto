package com.example.uf1_proyecto_compose.ui.podcasts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.uf1_proyecto_compose.playing
import com.example.uf1_proyecto_compose.ui.components.PlayerMini

@Composable
fun PodcastsScreen() {
    //Not yet implemented
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Podcasts")
        }
        if (playing) {
            Row(

            ) {
                PlayerMini()
            }

        }
    }

}