@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.uf1_proyecto_compose.ui.player

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uf1_proyecto_compose.R
import com.example.uf1_proyecto_compose.ui.components.PlayerBig
import com.example.uf1_proyecto_compose.ui.components.qualitySelector
import com.example.uf1_proyecto_compose.ui.utils.RadioPlayer

@Composable
fun PlayerScreen(viewModel: PlayerViewModel) {
    val player = RadioPlayer()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.size(32.dp))

        Image(
            painter = painterResource(id = R.drawable.novahit_logo_full),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .scale(2f)
        )
        Spacer(modifier = Modifier.size(64.dp))

        qualitySelector()

        Spacer(modifier = Modifier.weight(1f))

        PlayerBig()

        Spacer(modifier = Modifier.weight(1f))

    }

}