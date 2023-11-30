package com.example.uf1_proyecto_compose.ui.news

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uf1_proyecto_compose.playing
import com.example.uf1_proyecto_compose.ui.components.PlayerMini
import com.example.uf1_proyecto_compose.ui.theme.Theme


@Composable
fun NewsScreen() {
    Column (
        modifier= Modifier
            .fillMaxSize()

    ){
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card (
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ){

            }
            Column(
                modifier = Modifier
                    .background(Color.Gray)
                    .width(300.dp)
                    .height(150.dp)
            ) {

            }
            Spacer(Modifier.size(16.dp))
            Column(
                modifier = Modifier
                    .background(Color.Gray)
                    .width(300.dp)
                    .height(150.dp)
            ) {

            }
            Spacer(Modifier.size(16.dp))
            Column(
                modifier = Modifier
                    .background(Color.Gray)
                    .width(300.dp)
                    .height(150.dp)
            ) {

            }
            Spacer(Modifier.size(16.dp))
            Column(
                modifier = Modifier
                    .background(Color.Gray)
                    .width(300.dp)
                    .height(150.dp)
            ) {

            }
            Spacer(Modifier.size(16.dp))
            Column(
                modifier = Modifier
                    .background(Color.Gray)
                    .width(300.dp)
                    .height(150.dp)
            ) {

            }
            Text(text = "News")
        }
        if (playing) {
            Row (

            ){
                PlayerMini()
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun NewsScreenPreview() {
    Theme {
        NewsScreen()
    }
}
