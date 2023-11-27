package com.example.uf1_proyecto_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uf1_proyecto_compose.ui.theme.UF1_Proyecto_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UF1_Proyecto_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UF1_Proyecto_composeTheme {
        Home()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {


    Column(
        verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.Start,
    ) {
        var rs: Unit
        //TopBar
        TopAppBar(title = { "Title" })
        Row(
            modifier = Modifier
                .background(Color.Gray)
                .height(70.dp)
                .fillMaxSize()
        ) {


        }
        Row(
            modifier = Modifier
                .background(Color.White)
                .weight(1f)
                .fillMaxSize()
        ) {
            Column {
                Row(
                    modifier = Modifier
                        .height(190.dp)
                        .padding(24.dp, 16.dp, 24.dp, 0.dp)
                        .fillMaxWidth()
                        .align(CenterHorizontally)
                ) {
                    Row (modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxSize()
                        .padding(10.dp)
                        , verticalAlignment = Alignment.Bottom
                    ) {
                        Text(text = "Title")


                    }
                }



                Row(
                    modifier = Modifier
                        .height(190.dp)
                        .padding(24.dp, 16.dp, 24.dp, 0.dp)
                        .fillMaxWidth()
                        .align(CenterHorizontally)
                ) {
                    Row (modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxSize()
                        .padding(10.dp)
                        , verticalAlignment = Alignment.Bottom
                    ) {
                        Text(text = "Title")


                    }
                }
            }

        }



        Row(
            modifier = Modifier
                .background(Color.Gray)
                .height(70.dp)
                .fillMaxSize()
        ) {
            BottomAppBar(containerColor = Color.Gray) {
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .weight(.5f)
                        .fillMaxSize(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    shape = RectangleShape
                ) {
                    Text(text = "Noticias")
                }

                Button(
                    onClick = { },
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .weight(.5f)
                        .fillMaxSize(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    shape = RectangleShape
                ) {
                    Text(text = "Player")
                }

                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .weight(.5f)
                        .fillMaxSize(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    shape = RectangleShape
                ) {
                    Text(text = "Chat")
                }

                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                        .weight(.5f)
                        .fillMaxSize(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    shape = RectangleShape
                ) {
                    Text(text = "Podcast")
                }
            }

        }
    }
}

@Composable
fun Player() {
    Text(text = "Player")
}

@Composable
fun News() {
    Text(text = "News")
}