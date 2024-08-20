package com.hager_gomaa.decomposepractise.viewmodel.state

//class to handel save ids of image ids
data class ImageIdUiState(val id:Int)

// class to handel save list of type ImageIdUiState
data class ResoursesDataUiState(val list: List<ImageIdUiState> = emptyList())


