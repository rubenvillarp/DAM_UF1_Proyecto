package com.example.uf1_proyecto_compose

import android.os.Bundle
import android.widget.ScrollView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
                    val navController= rememberNavController()
                    NavHost(navController = navController , startDestination = "home") {
                        composable("home") { Home(navController) }
                        composable("player") { Player(navController) }
                        /*...*/
                    }
                    //Home()
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
        Home(navController = rememberNavController())
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController) {

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
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            modifier = Modifier
                .background(Color.White)
                .weight(1f)
                .fillMaxSize()

        ) {

            Column (modifier = Modifier.verticalScroll(rememberScrollState())){
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
                    onClick = { navController.navigate("player") },
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Player(navController: NavController) {
    Text(text = "Player")
    Button(onClick = { navController.navigate("home")}) {
        Text(text = "Back")
    }
}

@Composable
fun News() {
    Text(text = "News")
}