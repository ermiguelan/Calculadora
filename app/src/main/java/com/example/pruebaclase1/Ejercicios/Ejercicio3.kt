package com.example.pruebaclase1.Ejercicios

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable

fun Ejercicio3(modifier: Modifier= Modifier){
    Row(modifier= modifier.fillMaxWidth()) {
        Column(modifier= modifier.weight(1f).fillMaxWidth()) {
            Text("Indigo", modifier = modifier.background(Color.Blue).weight(1f).fillMaxWidth())
            Text("Naranja",modifier = modifier.background(Color.Red).weight(1f).fillMaxWidth())
            Text("Gris",modifier = modifier.background(Color.Gray).weight(1f).fillMaxWidth())
            Text("Amber",modifier = modifier.background(Color.Yellow).weight(1f).fillMaxWidth())

        }
        Column(modifier = modifier.weight(1f).fillMaxWidth()) {
            Text("Rosa",modifier = modifier.background(Color.Magenta).weight(1f).fillMaxWidth())
            Text("Verde", modifier = modifier.background(Color.Green).weight(1f).fillMaxWidth())
            Text("Cyan", modifier = modifier.background(Color.Cyan).weight(1f).fillMaxWidth())
            Text("Marron", modifier = modifier.background(Color.DarkGray).weight(1f).fillMaxWidth())

        }


    }



}