package com.hager_gomaa.decomposepractise.screentwo.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hager_gomaa.decomposepractise.composable.Loading
import com.hager_gomaa.decomposepractise.root.ScreenTwoComponent
import com.hager_gomaa.decomposepractise.screentwo.component.LuzyColumItemResoursesData
import com.hager_gomaa.decomposepractise.screentwo.intent.ScreenTwoIntent
import com.hager_gomaa.decomposepractise.screentwo.provider.ResouresDataProvider


@Composable
fun ScreenTwo(component: ScreenTwoComponent, viewModel: ResouresDataProvider = viewModel()) {
    // state retrieve viewmodel state data
    val state by viewModel.state.collectAsState()

    // make ScreenTwoIntent intent published as shared flow  so viewmodel depend one it to get internet photos
    LaunchedEffect(Unit) {
        viewModel.intentActionExecutor(ScreenTwoIntent.onScreenOneOpen)
    }
    // show loading in loading state is true
    when {
        state.loading -> {
            Loading()
        }

        else -> {
            // luzy colum item to show list of images as recycler
            LuzyColumItemResoursesData(state) {
                component.onBackPressed()
            }
        }
    }
}