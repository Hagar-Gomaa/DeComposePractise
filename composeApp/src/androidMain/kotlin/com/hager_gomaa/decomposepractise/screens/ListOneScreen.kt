package com.hager_gomaa.decomposepractise.screens

import android.text.Layout
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.hager_gomaa.decomposepractise.navigation.ListOneComponent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import com.hager_gomaa.decomposepractise.navigation.ScreenEvent

@Composable
fun ListOneScreen(component: ListOneComponent) {
//    val text by component.text.subscribeAsState()
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Screen A")

        Button(onClick = {
            component.onEvent(ScreenEvent.ClickButtonA)
        }) {
            Text("Go to Screen B")
        }
    }
}