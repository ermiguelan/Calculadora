package com.example.pruebaclase1.Ejercicios

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@Composable
fun Calculadora(modifier: Modifier = Modifier){
var pantalla by remember { mutableStateOf("0") }
var solucion by remember { mutableStateOf("0") }
    var anterior by remember { mutableStateOf("0") }
    Column(modifier = Modifier.fillMaxSize()){
        Box(modifier= Modifier.weight(1f)
            .fillMaxWidth().background(Color.Gray),
            contentAlignment = Alignment.BottomEnd) {

            Column(horizontalAlignment = Alignment.End) {
                Text(anterior, fontSize = 30.sp)
                Spacer(modifier = Modifier.height(70.dp),)

                if(pantalla.length<30){
                    Text(pantalla, fontSize = 50.sp)
                }
                else{
                    pantalla="muy largo"
                }
                Spacer(modifier = Modifier.height(60.dp))
                Text(solucion, fontSize = 40.sp)
                Spacer(modifier = Modifier.height(50.dp))

            }



        }

        Row(modifier=Modifier.weight(0.15f).fillMaxWidth()) {
            Button(onClick = {pantalla += "1"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)
            ) {
                Text("1")
            }
            Button(onClick = {pantalla += "2"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("2")
            }
            Button(onClick = {pantalla += "3"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("3")
            }
            Button(onClick = {
                if (pantalla.isNotEmpty()){
                    pantalla=pantalla.dropLast(1)
                }
            },modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("<-")
            }
        }
        Row(modifier=Modifier.weight(0.15f).fillMaxWidth()) {
            Button(onClick = {pantalla += "4"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("4")
            }
            Button(onClick = {pantalla += "5"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("5")
            }
            Button(onClick = {pantalla += "6"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("6")
            }
            Button(onClick = {pantalla += "+"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("+")
            }
        }
        Row(modifier=Modifier.weight(0.15f).fillMaxWidth()) {
            Button(onClick = {pantalla += "7"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("7")
            }
            Button(onClick = {pantalla += "8"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("8")
            }
            Button(onClick = {pantalla += "9"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("9")
            }
            Button(onClick = {pantalla += "-"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("-")
            }
        }
        Row(modifier=Modifier.weight(0.15f).fillMaxWidth()) {
            Button(onClick = {pantalla += "/"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("/")
            }
            Button(onClick = {pantalla += "0"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("0")
            }
            Button(onClick = {pantalla += "*"},modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("x")
            }
            Button(onClick = {
                anterior= pantalla
                if(pantalla.contains("muy largo")){
                    pantalla="0"
                    anterior="0"
                }
                solucion= calcular(pantalla)
                if (solucion!="Error") {
                    pantalla = solucion
                }

            },modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black)) {
                Text("=")
            }
        }
    }


}
fun calcular(operacion: String): String{
    return try {
        if (operacion.contains("+")){
            val partes = operacion.split("+")
            val numero1 = partes[0].toDouble()
            val numero2 = partes[1].toDouble()
            (numero1 + numero2).toString()
        } else if (operacion.contains("-")){
            val partes = operacion.split("-")
            val numero1 = partes[0].toDouble()
            val numero2 = partes[1].toDouble()
            (numero1 - numero2).toString()
        } else if (operacion.contains("*")){
            val partes = operacion.split("*")
            val numero1 = partes[0].toDouble()
            val numero2 = partes[1].toDouble()
            (numero1 * numero2).toString()
        } else if (operacion.contains("/")){
            val partes = operacion.split("/")
            val numero1 = partes[0].toDouble()
            val numero2 = partes[1].toDouble()
            if(numero2==0.0){
                return "Error"
            }
            (numero1 / numero2).toString()
        }else{
            return "Error"
        }


    } catch (e: Exception) {
        "Error"
    }

}

