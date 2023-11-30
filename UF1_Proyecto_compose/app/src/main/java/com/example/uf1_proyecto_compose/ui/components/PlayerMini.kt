package com.example.uf1_proyecto_compose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uf1_proyecto_compose.ui.theme.Theme

@Composable
fun PlayerMini() {
    Row(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth()
            .background(Color.Gray)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            Column(
                modifier = Modifier
                    .size(68.dp)
                    .background(color=Color.DarkGray,shape= RoundedCornerShape(8.dp))


            ) {
                Image(imageVector = Icons.Outlined.PlayArrow, contentDescription = "")
            }
            Spacer(Modifier.size(16.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ){
                Text(text = "Song Name")
                Text(text = "Song Artist")
                Spacer(Modifier.size(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically){
                    Row(modifier= Modifier
                        .height(8.dp)
                        .width(50.dp)
                        .weight(1f)
                        .background(Color.DarkGray)
                    ) {
                    }
                    Spacer(Modifier.size(16.dp))
                    Text(text = "00:00 / 00:00", fontSize = 7.sp)
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PlayerMiniPreview() {
    Theme {
        PlayerMini()
    }
}