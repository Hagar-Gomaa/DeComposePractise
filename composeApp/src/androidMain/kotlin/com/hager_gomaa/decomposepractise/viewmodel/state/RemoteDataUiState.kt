package com.hager_gomaa.decomposepractise.viewmodel.state

//class to handel save url of image
data class ImageUiState(val url: String)

// class to handel save list of type ImageUiState
data class RemoteDataUiState(val list: List<ImageUiState> = emptyList())


