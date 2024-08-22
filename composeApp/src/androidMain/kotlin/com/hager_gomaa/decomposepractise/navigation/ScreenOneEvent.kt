package com.hager_gomaa.decomposepractise.navigation

// hande type of screen one events
sealed class ScreenOneEvent {
    data object ShowMoreClicked : ScreenOneEvent()
}