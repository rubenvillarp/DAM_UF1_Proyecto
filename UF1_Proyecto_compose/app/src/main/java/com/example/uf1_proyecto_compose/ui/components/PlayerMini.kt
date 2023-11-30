package com.example.uf1_proyecto_compose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uf1_proyecto_compose.ui.theme.Theme

@Composable
fun PlayerMini() {
    Row(
        modifier = Modifier
            .height(40.dp)
            .fillMaxWidth()
            .background(Color.Gray)
    ) {
        Column {
            Image(imageVector = Icons.Outlined.PlayArrow, contentDescription = "")
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