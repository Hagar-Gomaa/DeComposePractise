package com.hager_gomaa.decomposepractise.viewmodel.state

data class ImageUiState(val url:String)
data class RemoteDataUiState(val list: List<ImageUiState> = emptyList())


