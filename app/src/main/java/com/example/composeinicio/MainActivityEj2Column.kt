package com.example.composeinicio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeinicio.ui.theme.ComposeInicioTheme

class MainActivityEj2Column : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var ej2Column:Ej2_column= Ej2_column()
            ComposeInicioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    ej2Column.ColumnPreview()

                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    ComposeInicioTheme {
        var ej2Column:Ej2_column=Ej2_column()
        ej2Column.ColumnPreview()
    }
}

