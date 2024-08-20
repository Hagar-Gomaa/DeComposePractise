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
fun ButtonItem(text: String, onClick: () -> Unit) {
    Column(
        // make it with fill max screen width and with constant height with set it centerHorizontally
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
    ) {

        Button(
            // make it with constant width and height with set it centerHorizontally
            modifier = Modifier
                .width(200.dp)
                .height(70.dp)
                .align(Alignment.CenterHorizontally),
            // set button background color and its text color
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Blue,
                contentColor = Color.White
            ),
            onClick = {
                onClick()
            }) {
            // set button text
            Text(text)
        }
    }
}