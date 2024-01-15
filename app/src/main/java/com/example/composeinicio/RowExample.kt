package com.example.composeinicio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class RowExample {
    private @Composable
    fun Greeting(name:String,modifier: Modifier = Modifier) {
        Text(text = "Hi $name!", modifier=modifier)
    }

    @Preview(
        showBackground=true,
        name="MRN ExComposeApp_Row",
        widthDp= 400,
        heightDp = 200
    )
    @Composable
    fun RowPreview(){
        Row(
            modifier= Modifier.fillMaxSize(),//lo que ocupa
            //Definición posición vertical
            //En vez de verticalAlignment se podrían aplicar pesos weight en este caso en los Greeting()
            verticalAlignment = Alignment.CenterVertically,

            // horizontalArrangement = Arrangement.SpaceAround,//cómo se colocan de forma vertical los eltos
            //con SpaceEvenly->en función del espacio que tienen(dejando encima y debajo)
            //SpaceBetween->mismo espacio entre cada uno los huecos(sin espacio encima 1erElto ni debajo últimoElto)
            //SpaceAround->como Evenly pero dejando mismo espacio encima primero y debajo último (siendo la mitad que el q existe entre eltos)
            //Definición posición horizontal
            horizontalArrangement = Arrangement.SpaceEvenly
        )
        {
            Greeting(
                name = "MRN",
                modifier = Modifier
                    .background(Color.LightGray)
                    //.weight(2f)
            )
            Greeting(
                name = "mrnovoa",
                modifier = Modifier
                    .background(Color.Yellow)
                    .align(Alignment.Top)
                    //.weight(1f)
            )
        }
    }
}