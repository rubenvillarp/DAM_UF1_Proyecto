package com.example.uf1_proyecto_compose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Pause
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uf1_proyecto_compose.R
import com.example.uf1_proyecto_compose.playing
import com.example.uf1_proyecto_compose.ui.utils.RadioPlayerHelper

@Composable
fun PlayerMini() {
    val context = LocalContext.current
    var icon by remember {
        if (playing) {
            mutableStateOf(Icons.Outlined.Pause)
        } else {
            mutableStateOf(Icons.Outlined.PlayArrow)
        }
    }
    RadioPlayerHelper.context = context

    fun onClick() {
        when (playing) {
            true -> {
                playing = false
                icon = Icons.Outlined.PlayArrow
                RadioPlayerHelper.stop()
            }

            false -> {
                playing = true
                icon = Icons.Outlined.PlayArrow
                RadioPlayerHelper.play()
            }
        }
    }

    Row(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
            .background(Color.DarkGray)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            Column(
                modifier = Modifier
                    .size(68.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable {
                            onClick()
                        }
                ) {
                    Image(
                        painter = painterResource(R.drawable.novahit_radio_player_bg),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(8.dp)),
                        contentScale = ContentScale.Crop
                    )
                    if (playing) {
                        PlayIcon(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .scale(1.5f), icon = Icons.Outlined.Pause
                        )
                    } else {
                        PlayIcon(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .scale(1.5f), icon = Icons.Outlined.PlayArrow
                        )
                    }
                }
            }
            Spacer(Modifier.size(16.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = stringResource(id = R.string.song_title_mini), color = Color.White)
                Text(text = stringResource(id = R.string.song_artist_mini), color = Color.White)
                Spacer(Modifier.size(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Row(
                        modifier = Modifier
                            .height(8.dp)
                            .width(50.dp)
                            .weight(1f)
                            .background(Color.White)
                    ) {
                    }
                    Spacer(Modifier.size(16.dp))
                    Text(text = "00:00 / 00:00", fontSize = 7.sp, color = Color.White)
                }
            }
        }
    }
}
