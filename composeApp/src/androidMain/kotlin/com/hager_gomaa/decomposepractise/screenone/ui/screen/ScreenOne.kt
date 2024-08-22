package com.hager_gomaa.decomposepractise.screenone.ui.screen

import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hager_gomaa.decomposepractise.screenone.ui.component.LuzyColumItemRemoteData
import com.hager_gomaa.decomposepractise.navigation.ScreenOneComponent
import com.hager_gomaa.decomposepractise.navigation.ScreenOneEvent
import com.hager_gomaa.decomposepractise.screenone.ui.intent.ScreenOneIntent
import com.hager_gomaa.decomposepractise.screenone.ui.viewmodel.InternetPhotosViewModel
import com.hager_gomaa.decomposepractise.screentwo.intent.ScreenTwoIntent

@Composable
fun ScreenOne(
    component: ScreenOneComponent, viewModel: InternetPhotosViewModel = viewModel()
) {
    // state retrieve viewmodel state data
    val state by viewModel.state.collectAsState()

    // make onScreenOneOpen intent published as shared flow  so viewmodel depend one it to get internet photos
    LaunchedEffect(Unit) {
        viewModel.intentActionExecutor(ScreenOneIntent.onScreenOneOpen)
    }
     // show loading in loading state is true
    when {
        state.loading -> {
            CircularProgressIndicator()
        }
        else -> {
            // luzy colum item to show list of images as recycler
            LuzyColumItemRemoteData(list = state.list) {
                component.onEvent(ScreenOneEvent.ClickButtonA)
            }
        }
    }
}



