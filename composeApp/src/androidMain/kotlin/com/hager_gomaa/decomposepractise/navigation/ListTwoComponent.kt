package com.hager_gomaa.decomposepractise.navigation

import com.arkivanov.decompose.ComponentContext

class ListTwoComponent(
    componentContext: ComponentContext, val onBackPressed: () -> Unit
) : ComponentContext by componentContext {

    fun goBack() {
        onBackPressed()
    }
}