package com.example.intrinsicsizedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.intrinsicsizedemo.ui.theme.IntrinsicSizeDemoTheme

import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntrinsicSizeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {

}


@Composable
fun MyTextField(text: String, onTextChange: (String) -> Unit) {
    var textState by remember { mutableStateOf("") }
    val onTextChange = { text: String ->
        textState = text
    }

    TextField(
        value = text,
        onValueChange = onTextChange
    )

}

@Preview
@Composable
fun MainScreenPreview() {
    IntrinsicSizeDemoTheme {
        MainScreen()
    }
}