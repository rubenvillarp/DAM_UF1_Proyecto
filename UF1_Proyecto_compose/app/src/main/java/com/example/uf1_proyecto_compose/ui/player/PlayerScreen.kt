@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.uf1_proyecto_compose.ui.player

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.uf1_proyecto_compose.ui.components.PlayerBig
import com.example.uf1_proyecto_compose.ui.components.qualitySelector

@Composable
fun PlayerScreen(viewModel: PlayerViewModel) {
    //val player = RadioPlayer()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Player")
        Button(onClick = {
            /*when (quality) {
                LOW_QUALITY -> player.playLQ()
                MEDIUM_QUALITY -> player.playMQ()
                HIGH_QUALITY -> player.playHQ()
            }*/
        }) {
            Text(text = "play")
        }

        Spacer(modifier = Modifier.size(16.dp))

        qualitySelector()

        Spacer(modifier = Modifier.size(16.dp))

        PlayerBig()

        /*if (player.isPlaying) {
            Toast.makeText(LocalContext.current, "Reproduciendo...", Toast.LENGTH_SHORT).show()

        }*/
    }

}