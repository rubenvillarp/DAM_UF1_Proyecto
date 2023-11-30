package com.example.uf1_proyecto_compose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uf1_proyecto_compose.ui.theme.Theme

@Composable
fun PlayerBig() {
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
            Image(
                imageVector = Icons.Outlined.PlayArrow, contentDescription = "",
                modifier = Modifier
                    .padding(top = 16.dp, start = 8.dp)
                    .scale(2f)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Spacer(Modifier.size(8.dp))
            Text(text = "SONG’S TITLE / PROGRAM NAME GOES HERE", fontSize = 12.sp)
            Spacer(Modifier.size(2.dp))
            Text(text = "Song’s artists / Radio DJ goes here", fontSize = 10.sp)
            Spacer(Modifier.size(2.dp))
        }
        //Progress Bar
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal=16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start) {
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
@Preview(showBackground = true)
fun PlayerBigPreview() {
    Theme {
        PlayerBig()
    }
}