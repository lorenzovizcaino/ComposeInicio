package com.example.composeinicio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeinicio.ui.theme.ComposeInicioTheme

class MainActivityEj3Row : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var ej4Row:Ej4_row= Ej4_row()
            ComposeInicioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ej4Row.RowPreview()
                }
            }
        }
    }
}



@Preview(showBackground = true,showSystemUi = true)
@Composable
fun GreetingPreview4() {
    ComposeInicioTheme {
        var ej4Row:Ej4_row= Ej4_row()
        ej4Row.RowPreview()
    }
}