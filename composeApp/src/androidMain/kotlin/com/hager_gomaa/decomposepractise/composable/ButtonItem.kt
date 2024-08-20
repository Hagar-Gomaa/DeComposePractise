package com.hager_gomaa.decomposepractise.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonItem (text:String,onClicke :()->Unit){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
    ) {
        Button(
            modifier = Modifier.width(200.dp).height(70.dp).align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue, contentColor = Color.White),
            onClick = {
              onClicke()
            }) {
            Text(text)
        }
    }
}