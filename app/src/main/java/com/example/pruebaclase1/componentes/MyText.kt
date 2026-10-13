package com.example.pruebaclase1.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun MyText(texto: String="Texto", modifier: Modifier = Modifier){

     Column(modifier = modifier) {
         Text(texto)
         Text(texto, color = Color.Red)
         Text(texto, fontSize = 40.sp)
         Text(texto, fontStyle = FontStyle.Italic)
         Text(texto, fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
         Text(texto, fontSize = 40.sp, letterSpacing = 20.sp)
         Text(texto, fontSize = 40.sp, textDecoration = TextDecoration.Underline)
         Text(texto, fontSize = 40.sp, textDecoration = TextDecoration.combine(
             decorations = listOf(
                 TextDecoration.Underline,
                 TextDecoration.LineThrough
             )
         ))
         Text(texto, fontSize = 40.sp, modifier = Modifier.fillMaxSize()
             .background(Color.Green), textAlign = TextAlign.Center)
         Text("\n", fontSize = 40.sp, modifier = Modifier.fillMaxWidth().background(Color.Red),
             textAlign = TextAlign.Center,
             maxLines = 1,
             overflow = TextOverflow.Clip
             )

     }






}