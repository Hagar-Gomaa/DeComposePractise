package com.hager_gomaa.decomposepractise.navigation

import com.arkivanov.decompose.ComponentContext

class ListOneComponent (
    componentContext: ComponentContext,
    private val onNavigateToScreenTwo: () -> Unit
): ComponentContext by componentContext {
//
//    private var _text = MutableValue("")
//    val text: Value<String> = _text

    fun onEvent(event: ScreenEvent) {
        when(event) {
           is ScreenEvent.ClickButtonA -> onNavigateToScreenTwo()

        }
    }


}