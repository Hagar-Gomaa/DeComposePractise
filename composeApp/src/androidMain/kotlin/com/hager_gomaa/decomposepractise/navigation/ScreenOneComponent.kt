package com.hager_gomaa.decomposepractise.navigation

import com.arkivanov.decompose.ComponentContext
 //  handel Screen One  Navigation
class ScreenOneComponent (
    componentContext: ComponentContext,
    private val onNavigateToScreenTwo: () -> Unit
): ComponentContext by componentContext {
    fun onEvent(event: ScreenOneEvent) {
        when(event) {
           is ScreenOneEvent.ClickButtonA -> onNavigateToScreenTwo()

        }
    }


}