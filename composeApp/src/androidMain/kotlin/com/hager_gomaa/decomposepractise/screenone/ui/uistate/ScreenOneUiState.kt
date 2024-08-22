package com.hager_gomaa.decomposepractise.screenone.ui.uistate

//class to handel save url of image
data class ImageUiState(val url: String)

// class to handel save list of type ImageUiState
data class ScreenOneUiState(
    val loading:Boolean=false,
    val list: List<ImageUiState> = emptyList(),
   )


