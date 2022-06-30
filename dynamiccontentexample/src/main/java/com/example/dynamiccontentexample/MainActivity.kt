package com.example.dynamiccontentexample

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dynamiccontentexample.ui.theme.ComposeApplicationTheme

val nameList: ArrayList<String> = arrayListOf("Max", "Manuel", "Jairo", "Jone", "Samanta")

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(viewModel: MainViewModel = MainViewModel()) {

    // val greetingListState = remember{mutableStateListOf("John", "Amanda")}

    val newNameStateContent = viewModel.textFieldState.observeAsState("")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GreetingMessage(newNameStateContent.value) { newName -> viewModel.onTextChanged(newName) }
    }
}

@Composable
fun GreetingMessage(
    textViewValue: String,
    textFieldUpdate: (newName: String) -> Unit
) {

    TextField(value = textViewValue, onValueChange = textFieldUpdate)

    Button(onClick = {}) {
        Text(text = textViewValue)
    }
}

@Composable
fun GreetingList(
    textViewValue: String,
    textFieldUpdate: (newName: String) -> Unit
) {

    TextField(
        value = textViewValue, onValueChange = textFieldUpdate,
        singleLine = true, maxLines = 1
    )

    Button(onClick = {}) {
        Text(text = "Add new name")
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        style = MaterialTheme.typography.h4
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}