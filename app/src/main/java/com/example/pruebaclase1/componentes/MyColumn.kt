package com.example.pruebaclase1.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp

@Composable
fun MyColumn(modifier: Modifier= Modifier){
    Column(modifier=modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Uno", modifier= Modifier.background(Color.Blue).weight(1f), fontSize = 24.sp)
        Text("dos", modifier= Modifier.background(Color.Blue).weight(2f).fillMaxWidth(), fontSize = 24.sp)
        Text("tres", modifier= Modifier.background(Color.Blue).weight(3f), fontSize = 24.sp)
        Text("cuatro", modifier= Modifier.background(Color.Blue).weight(4f), fontSize = 24.sp)
        Text("cinco", modifier= Modifier.background(Color.Blue).weight(0.6f), fontSize = 24.sp)
        Text("seis", modifier= Modifier.background(Color.Blue).weight(0.6f), fontSize = 24.sp)
    }


}