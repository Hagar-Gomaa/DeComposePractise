package com.hager_gomaa.decomposepractise.screenone.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hager_gomaa.decomposepractise.composable.Loading
import com.hager_gomaa.decomposepractise.root.ScreenOneComponent
import com.hager_gomaa.decomposepractise.root.ScreenOneEvent
import com.hager_gomaa.decomposepractise.screenone.component.LuzyColumItemRemoteData
import com.hager_gomaa.decomposepractise.screenone.intent.ScreenOneIntent
import com.hager_gomaa.decomposepractise.screenone.provider.InternetPhotosProvider

@Composable
fun ScreenOne(
    component: ScreenOneComponent, viewModel: InternetPhotosProvider = viewModel()
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
            Loading()
        }

        else -> {
            // luzy colum item to show list of images as recycler
            LuzyColumItemRemoteData(state) {
                component.onEvent(ScreenOneEvent.ShowMoreClicked)
            }
        }
    }
}



