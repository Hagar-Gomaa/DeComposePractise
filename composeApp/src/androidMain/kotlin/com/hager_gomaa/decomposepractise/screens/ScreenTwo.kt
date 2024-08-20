package com.hager_gomaa.decomposepractise.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hager_gomaa.decomposepractise.composable.LuzyColumItemResoursesData
import com.hager_gomaa.decomposepractise.navigation.ScreenTwoComponent
import com.hager_gomaa.decomposepractise.viewmodel.ResouresDataViewModel


@Composable
fun ScreenTwo(component: ScreenTwoComponent, viewModel: ResouresDataViewModel = viewModel()) {
    // state retrieve viewmodel state data
    val state by viewModel.state.collectAsState()
    // luzy colum item to show list of images as recycler
    LuzyColumItemResoursesData(list = state.list) {
        component.onBackPressed()
    }
}