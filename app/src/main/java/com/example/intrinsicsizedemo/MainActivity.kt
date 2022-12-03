package com.example.intrinsicsizedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.intrinsicsizedemo.ui.theme.IntrinsicSizeDemoTheme

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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
    var textState by remember { mutableStateOf("") }
    val onTextChange = { text: String ->
        textState = text
    }

    Column {
        Text(
            text = textState,
            modifier = Modifier
                .padding(start = 4.dp)
        )
        Box(modifier = Modifier.height(10.dp).fillMaxWidth().background(Color.Blue))
    }
}


@Composable
fun MyTextField(text: String, onTextChange: (String) -> Unit) {

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