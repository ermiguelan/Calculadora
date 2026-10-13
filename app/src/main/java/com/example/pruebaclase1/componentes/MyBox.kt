package com.example.pruebaclase1.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun MyBox(modifier: Modifier = Modifier){
    Box(
        modifier=modifier
            .fillMaxSize()
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ){
        Text("Hola",
            color= Color.Black,
            fontSize = 24.sp)
    }

}