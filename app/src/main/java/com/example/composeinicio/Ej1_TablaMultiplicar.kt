package com.example.composeinicio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class Ej1_TablaMultiplicar {
    @Preview
    @Composable
    fun TablaPreview(){
        TablaMultiplicar()
    }

    @Composable
    fun TablaMultiplicar() {

        Column(
            modifier = Modifier.fillMaxSize().background(Color.Gray),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var texto:String=CalcularTabla(7)
            Text(text = texto, color = Color.White, fontSize = 20.sp)
        }

    }

    private fun CalcularTabla(num: Int): String {
        var texto=""
        for (i in 0..10){
            texto+="$num x $i = ${num*i}\n"
        }


        return texto

    }

}

