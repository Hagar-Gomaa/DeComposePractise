package com.hager_gomaa.decomposepractise.screenone.ui.uistate

//class to handel save url of image
data class ImageUiState(val url: String)

// class to handel state of screen
data class ScreenOneUiState(
    val loading: Boolean = false,
    val imageJpegList: List<ImageUiState> = emptyList(),
    val imageSvgList: List<ImageUiState> = emptyList(),
)


