package com.hager_gomaa.decomposepractise.screentwo.uistate

//class to handel save ids of image ids
data class ImageIdUiState(val id: Int)

// class to handel save list of type ImageIdUiState
data class ScreenTwoUiState(
    val loading: Boolean = false,
    val list: List<ImageIdUiState> = emptyList()
)


