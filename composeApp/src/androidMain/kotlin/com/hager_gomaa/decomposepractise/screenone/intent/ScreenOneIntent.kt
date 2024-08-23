package com.hager_gomaa.decomposepractise.screenone.intent

// represent action do in screen
sealed class ScreenOneIntent {
    data object onScreenOneOpen : ScreenOneIntent()
}