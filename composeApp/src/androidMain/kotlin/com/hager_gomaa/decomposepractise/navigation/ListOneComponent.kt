package com.hager_gomaa.decomposepractise.navigation

import com.arkivanov.decompose.ComponentContext

class ListOneComponent (
    componentContext: ComponentContext,
    private val onNavigateToScreenTwo: () -> Unit
): ComponentContext by componentContext {
    fun onEvent(event: ScreenEvent) {
        when(event) {
           is ScreenEvent.ClickButtonA -> onNavigateToScreenTwo()

        }
    }


}