package com.hager_gomaa.decomposepractise.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hager_gomaa.decomposepractise.composable.LuzyColumItemResoursesData
import com.hager_gomaa.decomposepractise.navigation.ListTwoComponent
import com.hager_gomaa.decomposepractise.viewmodel.ResouresDataViewModel


@Composable
fun ListTwoScreen( component: ListTwoComponent,viewModel: ResouresDataViewModel = viewModel()) {
    val state by viewModel.state.collectAsState()
    LuzyColumItemResoursesData(list = state.list) {
        component.onBackPressed()
    }
}