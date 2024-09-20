package com.mrh.introduccionandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.mrh.introduccionandroid.ui.theme.IntroduccionAndroidTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IntroduccionAndroidTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            title = {
                                Text("Introducción Android")
                            },
                            colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primary, titleContentColor = MaterialTheme.colorScheme.onPrimary)

                        )
                    }
                ) { innerPadding ->
                    FirstView(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun FirstView(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(12.dp)) {
        Row(modifier = Modifier
                        .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text("Hola 2ºDAM A", fontSize = 24.sp, color = MaterialTheme.colorScheme.primary)
            Text("Hola 2ºDAM A", color = Color.Green)
        }
        Box(contentAlignment = Alignment.Center){
            Text("Hola 2ºDAM A", fontSize = 24.sp, color = MaterialTheme.colorScheme.primary)
            Text("Hola 2ºDAM A", color = Color.Green)
        }

        Card(modifier = Modifier.fillMaxWidth().height(200.dp), colors = CardDefaults.cardColors( contentColor = MaterialTheme.colorScheme.secondary)) {
            Text("Hola 2ºDAM A",color = Color.Green)
            AsyncImage(
                modifier = Modifier.fillMaxWidth(),
                model = "https://imagenes.20minutos.es/files/image_1920_1080/uploads/imagenes/2023/09/07/nuevo-logotipo-de-android.jpeg",
                contentDescription = "",
                contentScale = ContentScale.FillWidth
            )
        }

    }
}
