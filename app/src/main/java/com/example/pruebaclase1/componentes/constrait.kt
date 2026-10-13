package com.example.pruebaclase1.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp

@Composable
fun  MyConstraintLayout(modifier: Modifier= Modifier){

    ConstraintLayout(modifier=modifier.fillMaxSize()) {
        //creo valores o referencias
        val (boxRed, boxYellow, boxGreen) = createRefs()
        Box(modifier = Modifier.size(200.dp)
            .background(Color.Red)
            .constrainAs(boxRed){
                end.linkTo(parent.end)
                start.linkTo(parent.start)
                top.linkTo(parent.baseline)
            }
        ){}
        Box(modifier = Modifier.size(150.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow){
                top.linkTo(boxRed.bottom)
                end.linkTo(parent.end)

            })
        Box(modifier = Modifier.size(100.dp)
            .background(Color.Green)
            .constrainAs(boxGreen){
                bottom.linkTo(boxRed.top)


        })

    }





}