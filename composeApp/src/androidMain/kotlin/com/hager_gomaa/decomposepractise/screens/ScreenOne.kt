package com.hager_gomaa.decomposepractise.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hager_gomaa.decomposepractise.composable.LuzyColumItemRemoteData
import com.hager_gomaa.decomposepractise.navigation.ScreenOneComponent
import com.hager_gomaa.decomposepractise.navigation.ScreenOneEvent
import com.hager_gomaa.decomposepractise.viewmodel.RemoteDataViewModel

@Composable
fun ScreenOne(
    component: ScreenOneComponent, viewModel: RemoteDataViewModel = viewModel()
) {
    // state retrieve viewmodel state data
    val state by viewModel.state.collectAsState()
    // luzy colum item to show list of images as recycler
    LuzyColumItemRemoteData(list = state.list) {
        component.onEvent(ScreenOneEvent.ClickButtonA)
    }}


