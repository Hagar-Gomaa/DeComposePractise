package com.hager_gomaa.decomposepractise.root

// hande type of screen one events
sealed class ScreenOneEvent {
    data object ShowMoreClicked : ScreenOneEvent()
}