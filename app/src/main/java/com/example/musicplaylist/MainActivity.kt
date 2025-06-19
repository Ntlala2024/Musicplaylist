package com.example.musicplaylist

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicplaylist.ui.theme.MusicPlaylistTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var song by remember { mutableStateOf("") }

            var artists by remember { mutableStateOf("") }

            var ratings by remember { mutableStateOf("") }

            var comments by remember { mutableStateOf("") }

            Column(

                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {

            }

                Text(text = "Music playlist App",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Black

                )
            Divider()
            OutlinedTextField(
                value =song,
                onValueChange = {text ->
                    song = text

                },
                
            )
            Spacer(Modifier.height(50.dp))//Vertical spacing.

            Row {
                Button(onClick = {
                    //Run when the button is clicked/
                }) {
                    Text(text = "Add to Playlist")
                    var song by remember {mutableStateOf("")}
                    var artists by remember {mutableStateOf("")}
                    var rating by remember {mutableStateOf("")}
                    var comments by remember {mutableStateOf("")}
                }
            }
            OutlinedTextField(
                value =song,
                onValueChange = {text ->
                    song = text

                }
            )
            OutlinedTextField(
                value =artists,
                onValueChange={text ->
                    artists = text
                }
            )
            OutlinedTextField(
                value =ratings,
                onValueChange={text ->
                    ratings = text
                })

            Spacer(Modifier.height(50.dp))//Vertical spacing.

            Row {
                Button(onClick = {
                    //Run when the button is clicked/
                }) {
                    Text(text = "Next")
                }
            }


            //---"Add item" Dialog UI---
            //This dialog is shown when 'song Add itemDialog' is true


        }
    }
}
