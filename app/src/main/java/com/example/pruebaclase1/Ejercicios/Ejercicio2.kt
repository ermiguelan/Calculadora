package com.example.pruebaclase1.Ejercicios

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Ejercicio2(modifier: Modifier = Modifier){
    Column(modifier= modifier.fillMaxSize()) {
        Text("Indigio", modifier = modifier.background(Color.Blue).fillMaxWidth().weight(1f))
        Text("Rosa", modifier= modifier.background(Color.Magenta).fillMaxWidth().weight(1f))
        Text("naranja", modifier= modifier.background(Color.Red).fillMaxWidth().weight(1f))
        Text("Verde", modifier= modifier.background(Color.Green).fillMaxWidth().weight(1f))
    }











}