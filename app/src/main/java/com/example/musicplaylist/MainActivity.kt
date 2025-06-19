package com.example.musicplaylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
            Column {
                Text(text = "Music playlist App")
            }
            Row {
                Button(onClick = {}) {
                    Text(text = "Add to Playlist")
                }
            }
        }
    }
}
