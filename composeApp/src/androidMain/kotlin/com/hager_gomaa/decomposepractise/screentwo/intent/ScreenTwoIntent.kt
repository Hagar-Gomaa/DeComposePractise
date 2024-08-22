package com.hager_gomaa.decomposepractise.screentwo.intent

// represent action do in screen
sealed class ScreenTwoIntent {
    data object onScreenOneOpen : ScreenTwoIntent()
}