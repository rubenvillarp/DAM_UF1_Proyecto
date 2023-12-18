@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.uf1_proyecto_compose.ui.player

import android.net.Uri
import android.widget.Toast
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.uf1_proyecto_compose.ui.components.PlayerBig
import com.example.uf1_proyecto_compose.ui.components.qualitySelector
import com.example.uf1_proyecto_compose.ui.utils.HIGH_QUALITY
import com.example.uf1_proyecto_compose.ui.utils.LOW_QUALITY
import com.example.uf1_proyecto_compose.ui.utils.MEDIUM_QUALITY
import com.example.uf1_proyecto_compose.ui.utils.RadioPlayer
import com.example.uf1_proyecto_compose.ui.utils.RadioPlayerHelper
import com.example.uf1_proyecto_compose.ui.utils.play
import com.example.uf1_proyecto_compose.ui.utils.quality

@Composable
fun PlayerScreen(viewModel: PlayerViewModel) {
    val player = RadioPlayer()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.size(16.dp))

        qualitySelector()

        Spacer(modifier = Modifier.size(16.dp))

        PlayerBig()

    }

}