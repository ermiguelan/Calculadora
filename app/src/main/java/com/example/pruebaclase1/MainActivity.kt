package com.example.pruebaclase1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.pruebaclase1.Ejercicios.Calculadora
import com.example.pruebaclase1.ui.theme.PruebaClase1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PruebaClase1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //MyBox(modifier)
    //MyColumn(modifier)
    //Ejercicio1(modifier)
    //Ejercicio2(modifier)
    //Ejercicio3(modifier)
    //yConstraintLayout(modifier)
    //MyText();
    //MyButton(modifier)
    //MyTextField1(modifier)
    //Suma(modifier)
    Calculadora(modifier)
}


@Composable
fun GreetingPreview() {
    PruebaClase1Theme {
        Greeting("Android")
    }
}