package com.hager_gomaa.decomposepractise.navigation

// hande type of screen one events
sealed interface ScreenOneEvent {
    data object ClickButtonA : ScreenOneEvent
}