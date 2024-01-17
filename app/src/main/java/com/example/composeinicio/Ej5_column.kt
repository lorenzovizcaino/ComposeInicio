package com.example.composeinicio

import androidx.compose.animation.AnimatedContentScope.SlideDirection.Companion.End
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Ej5_column {
    private @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(text = "$name", modifier = modifier)
    }

    @Preview(
        showSystemUi = true,


    )

    @Composable
    fun ColumnPreview() {
        Box(modifier = Modifier.background(Color.Yellow).padding(40.dp)) {


        Column(
            modifier = Modifier.fillMaxSize().background(Color.Cyan),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Greeting(
                name = "Hola",
                modifier = Modifier


            )

            Greeting(
                name = "JetPack Compose",
                modifier = Modifier


            )

            Greeting(
                name = "otro texto hardcodeado",
                modifier = Modifier
                    .align(Alignment.End)


            )

        }
    }
    }
}