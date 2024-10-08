package com.hager_gomaa.decomposepractise.root

import com.arkivanov.decompose.ComponentContext
 //  handel Screen One  Navigation
class ScreenOneComponent (
    componentContext: ComponentContext,
    private val onNavigateToScreenTwo: () -> Unit
): ComponentContext by componentContext {
    fun onEvent(event: ScreenOneEvent) {
        when(event) {
           is ScreenOneEvent.ShowMoreClicked -> onNavigateToScreenTwo()

        }
    }


}