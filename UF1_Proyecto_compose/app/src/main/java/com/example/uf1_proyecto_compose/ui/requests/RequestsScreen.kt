@file:OptIn(
    ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class
)

package com.example.uf1_proyecto_compose.ui.requests

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uf1_proyecto_compose.playing
import com.example.uf1_proyecto_compose.ui.components.PlayerMini
import com.example.uf1_proyecto_compose.ui.theme.Theme


var messages = mutableListOf<String>()


@ExperimentalMaterial3Api
@Composable
fun RequestsScreen() {


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

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            var text by remember { mutableStateOf("") }

            OutlinedTextField(
                value = text,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                maxLines = 1,
                onValueChange = { text = it },
                shape = RoundedCornerShape(32.dp),
                trailingIcon = {
                    IconButton(onClick = {
                        text = ""
                    }) {
                        Icon(imageVector = Icons.Filled.Send, contentDescription = "Send")
                    }
                },
                label = { Text("Introduce tu mensaje") })
        }
        if (playing) {
            Row(

            ) {
                PlayerMini()
            }

        }
    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun RequestScreenPreview() {
    Theme {
        RequestsScreen()
    }
}