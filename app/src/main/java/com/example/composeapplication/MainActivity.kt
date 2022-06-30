package com.example.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GreetingText(name = "Max")
        }
    }
}

@Composable
fun GreetingText(name: String) {
    Text(
        text = "Hello $name!", modifier = Modifier
            .width(208.dp)
            .height(250.dp)
            .clickable(onClick = {})
            .padding(all = 24.dp),
        style = MaterialTheme.typography.button,
        fontWeight = FontWeight.SemiBold
//        style = TextStyle(
//            color = Color.Blue,
//            fontWeight = FontWeight.Bold,
//            fontSize = 24.sp
//        )

    )
}

@Composable
fun GreetingButton() {
    Button(onClick = { }) {
        GreetingText(name = "button")
        GreetingText(name = "remaining button")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewMainActivity() {
    GreetingText(name = "Max")
}