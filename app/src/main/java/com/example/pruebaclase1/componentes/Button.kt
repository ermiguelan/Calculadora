package com.example.pruebaclase1.componentes

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(
    showSystemUi = true
)

@Composable
fun MyButton(modifier: Modifier = Modifier){
    Column(modifier=modifier) {
        MyButton1()
    }



}

@Composable
fun MyButton1() {

    Button(

        onClick = {Log.d("MyButton", "pulsado")},
        enabled = true,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
            contentColor = Color.Blue,
            disabledContentColor = Color.Cyan,
            disabledContainerColor = Color.Green

        ),
        border = BorderStroke(3.dp, Color.Yellow),
        shape = RoundedCornerShape(34.dp)

    ) {
        Text("Pulsar")
    }
}