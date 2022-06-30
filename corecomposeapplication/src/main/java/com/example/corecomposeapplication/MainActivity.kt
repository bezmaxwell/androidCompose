package com.example.corecomposeapplication

import android.os.Bundle
import android.widget.HorizontalScrollView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.corecomposeapplication.ui.theme.ComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApplicationTheme {
                //MainScreenHorizontal()
                //MainScreenVertical()
                MainScreenSquare()
            }
        }
    }

    @Composable
    fun MainScreenHorizontal() {
        Surface(
            color = Color.DarkGray,
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {

                HorizontalColoredBar(Color.Blue)
                HorizontalColoredBar(Color.Cyan)
                HorizontalColoredBar(Color.Black)
                HorizontalColoredBar(Color.Red)
                HorizontalColoredBar(Color.Blue)

            }
        }
    }

    @Composable
    fun HorizontalColoredBar(color: Color) {
        Surface(
            color = color,
            modifier = Modifier
                .height(600.dp)
                .width(60.dp)
        ) { }
    }

    @Composable
    fun MainScreenVertical() {
        Surface(
            color = Color.DarkGray,
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                VerticalColoredBar(Color.Blue)
                VerticalColoredBar(Color.Cyan)
                VerticalColoredBar(Color.Black)
                VerticalColoredBar(Color.Red)
                VerticalColoredBar(Color.Blue)

            }
        }
    }

    @Composable
    fun MainScreenSquare() {
        Surface(
            color = Color.DarkGray,
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {
                    ColoredSquared(Color.Red)
                    ColoredSquared(Color.Magenta)
                }
                ColoredSquared(Color.Cyan)
                ColoredSquared(Color.Yellow)
                ColoredSquared(Color.Blue)
            }
        }
    }

    @Composable
    fun VerticalColoredBar(color: Color) {
        Surface(
            color = color,
            modifier = Modifier
                .height(100.dp)
                .width(250.dp)
        ) { }
    }

    @Composable
    fun ColoredSquared(color: Color) {
        Surface(
            color = color,
            modifier = Modifier
                .height(100.dp)
                .width(100.dp)
        ) { }

    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        MainScreenSquare()
    }
}