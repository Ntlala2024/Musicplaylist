package com.example.musicplaylist

import android.content.Intent
import android.os.Bundle
import android.view.Display
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.benchmark.perfetto.Row
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicplaylist.Secondscreen
import com.example.musicplaylist.ui.theme.MusicPlaylistTheme

private fun Nothing?.setOnClickListener(function: () -> Unit) {


}

annotation class AddcardActivity

private fun Nothing?.launch(intent: Intent) {


}

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
            ) {}

            Text(
                text = "Music playlist App",
                fontSize = 40.sp,
                fontWeight = FontWeight.Black


            )
            Row {
                Button(
                    onClick = {}
                ) { }
            }
            OutlinedTextField(

                value = song,

                onValueChange = { text ->

                    song = text


                }

            )

            OutlinedTextField(

                value = artists,

                onValueChange = { text ->

                    artists = text

                }

            )

            OutlinedTextField(

                value = ratings,

                onValueChange = { text ->

                    ratings = text

                })





            Row {

                Button(onClick = {

                    //Run when the button is clicked/

                }) {

                    Text(text = "Add to playlist")

                }


            }


            //---"Add item" Dialog UI---

            //This dialog is shown when 'song Add itemDialog' is true
            val add_question_button = null
            add_question_button.setOnClickListener {
                val intent = Intent(this@MainActivity, Secondscreen::class.java)
                val resultLauncher = null
                resultLauncher.launch(intent)



            }

        }

    }
}









