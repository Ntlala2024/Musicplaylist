package com.example.musicplaylist

import android.content.Intent
import android.os.Bundle
import android.view.Display
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicplaylist.MainActivity
import com.example.musicplaylist.ui.theme.MusicPlaylistTheme

class Secondscreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Row {
                //Run when the button is clicked/
                val display = Intent(this@Secondscreen, Secondscreen::class.java)
                val addtodiplay = null
                startActivity(addtodiplay)
                Button(
                    onClick = {}
                )
                {
                    Text(text = "Display")
                }
                //Run when the button is clicked/

                Button(
                    onClick = {}
                )
                {
                    Text(text = "Calculator")
                    Row {



                        Button(

                            onClick = {

                                result = (songb.toDouble() + songb.toDouble()).toString()

                            },

                            Modifier.padding(10.dp)

                        ) {

                            Text(text = "+")

                        }





                        Button(

                            onClick = {

                                result = (artista.toDouble() - arctistb.toDouble()).toString()

                            },

                            Modifier.padding(10.dp)

                        ) {

                            Text(text = "-")

                        }



                        Button(

                            onClick = {

                                result = (number1.toDouble() * number2.toDouble()).toString()

                            },

                            Modifier.padding(10.dp)

                        ) {

                            Text(text = "x")

                        }



                        Button(

                            onClick = {

                                val artist = null
                                val song = null
                                var result = (song.toDouble() / artist.toDouble()).toString()

                            },

                            Modifier.padding(10.dp)

                        ) {

                            Text(text = "/")

                        }



                        Button(

                            onClick = {

                                song = ""

                                artist= ""

                                result = ""

                                comments = ""



                            },

                            Modifier.padding(10.dp)

                        ) {
                        }
            }
        }
    }
}
