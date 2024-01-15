package com.example.composeinicio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Ej4_row {
    private @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(text = "$name", modifier = modifier)
    }

    @Preview(
        showSystemUi = true,
        name="MRN ExComposeApp_Column",

    )

    @Composable
    fun RowPreview(){
        Row(
            modifier=Modifier.fillMaxWidth().background(Color.Cyan).padding(20.dp),//lo que ocupa
            //Definición posición vertical
            //En vez de verticalAlignment se podrían aplicar pesos weight en este caso en los Greeting()
            verticalAlignment = Alignment.CenterVertically,

            // horizontalArrangement = Arrangement.SpaceAround,//cómo se colocan de forma vertical los eltos
            //con SpaceEvenly->en función del espacio que tienen(dejando encima y debajo)
            //SpaceBetween->mismo espacio entre cada uno los huecos(sin espacio encima 1erElto ni debajo últimoElto)
            //SpaceAround->como Evenly pero dejando mismo espacio encima primero y debajo último (siendo la mitad que el q existe entre eltos)
            //Definición posición horizontal
            //horizontalArrangement = Arrangement.SpaceAround
        )
        {

            Greeting(
                name = "Hola, Texto Hardcodeado",

            )
            Greeting(
                name = "JetPack Compose",
                modifier =Modifier
                    .background(Color.Magenta)
                    .align(Alignment.Top)

            )


        }



    }
}