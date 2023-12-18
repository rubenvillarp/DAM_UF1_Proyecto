package com.example.uf1_proyecto_compose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Icon
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
import androidx.compose.ui.graphics.vector.ImageVector
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
fun PlayerBig() {
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

    Column(
        modifier = Modifier
            .height(300.dp)
            .fillMaxWidth()
            .padding(horizontal = 32.dp)
            .background(color = Color.Gray, shape = RoundedCornerShape(16.dp)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.size(16.dp))
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .background(color = Color.DarkGray, shape = RoundedCornerShape(16.dp)),

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
                        .clip(RoundedCornerShape(16.dp)),
                    contentScale = ContentScale.Crop
                )
                if (playing) {
                    PlayIcon(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .scale(2f), icon = Icons.Outlined.Pause
                    )
                } else {
                    PlayIcon(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .scale(2f), icon = Icons.Outlined.PlayArrow
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Spacer(Modifier.size(8.dp))
            //Not Yet Implemented
            Text(text = stringResource(id = R.string.song_title_big), fontSize = 12.sp)
            Spacer(Modifier.size(2.dp))
            //Not Yet Implemented
            Text(text = stringResource(id = R.string.song_artist_big), fontSize = 10.sp)
            Spacer(Modifier.size(2.dp))
        }
        //Progress Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Row(
                modifier = Modifier
                    .height(8.dp)
                    .width(220.dp)
                    .background(color = Color.DarkGray)
            ) {
            }
            Spacer(Modifier.size(8.dp))
            Text(text = "00:00 / 00:00", fontSize = 8.sp)
        }
        Spacer(Modifier.size(16.dp))
    }
}

@Composable
fun PlayIcon(modifier: Modifier, icon: ImageVector) {
    Icon(
        imageVector = icon,
        contentDescription = null,
        modifier = modifier.padding(horizontal = 10.dp, vertical = 12.dp),
        tint = Color.White
    )
}


