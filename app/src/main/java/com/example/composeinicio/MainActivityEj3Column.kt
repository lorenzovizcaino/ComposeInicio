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

class MainActivityEj3Column : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var ej3Column:Ej3_column= Ej3_column()
        setContent {
            ComposeInicioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ej3Column.ColumnPreview()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    ComposeInicioTheme {
        var ej3Column:Ej3_column= Ej3_column()
        ej3Column.ColumnPreview()
    }
}