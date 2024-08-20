package com.hager_gomaa.decomposepractise.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hager_gomaa.decomposepractise.composable.LuzyColumItemRemoteData
import com.hager_gomaa.decomposepractise.navigation.ListOneComponent
import com.hager_gomaa.decomposepractise.navigation.ScreenEvent
import com.hager_gomaa.decomposepractise.viewmodel.RemoteDataViewModel

@Composable
fun ListOneScreen(
    component: ListOneComponent, viewModel: RemoteDataViewModel = viewModel()
) {
    val state by viewModel.state.collectAsState()
    LuzyColumItemRemoteData(list = state.list) {
        component.onEvent(ScreenEvent.ClickButtonA)
    }}


