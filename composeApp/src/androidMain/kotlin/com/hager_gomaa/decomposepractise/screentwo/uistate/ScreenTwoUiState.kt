package com.hager_gomaa.decomposepractise.screentwo.uistate

//class to handel save ids of image ids
data class ImageIdUiState(val id: Int)

// class to handel state of screen
data class ScreenTwoUiState(
    val loading: Boolean = false,
    val imageJpegList: List<ImageIdUiState> = emptyList(),
    val imageSvgList: List<ImageIdUiState> = emptyList(),
)


