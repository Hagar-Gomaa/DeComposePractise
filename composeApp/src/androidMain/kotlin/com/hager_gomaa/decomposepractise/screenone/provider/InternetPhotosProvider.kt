package com.hager_gomaa.decomposepractise.screenone.provider

import androidx.lifecycle.viewModelScope
import com.hager_gomaa.decomposepractise.base.BaseViewModel
import com.hager_gomaa.decomposepractise.screenone.intent.ScreenOneIntent
import com.hager_gomaa.decomposepractise.screenone.uistate.ImageUiState
import com.hager_gomaa.decomposepractise.screenone.uistate.ScreenOneUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class InternetPhotosProvider @Inject constructor() :
    BaseViewModel<ScreenOneUiState, ScreenOneIntent>(
        ScreenOneUiState()
    ) {
    init {
        // call fun with viewModel object create
        processIntent()
    }

    private fun processIntent() {
        viewModelScope.launch {
            //  emit intent actions then handel type of action with its needed fun
            intent.collect { screenOneIntent ->
                when (screenOneIntent) {
                    ScreenOneIntent.onScreenOneOpen -> getInternetPhotos()
                }
            }
        }
    }


    fun getInternetPhotos() {
        // make loading true first
        _state.update { it.copy(loading = true) }
        // update state with list of remote images in jpeg  and svg
        _state.update {
            it.copy(
                imageJpegList = listOf(
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrg27eYIqS05BROulGEfXLj2kWEmYj7Qg01shgZe6MmJjSN8wmOHcc6p3aZuX18HIqeqw&usqp=CAU"),
                    ImageUiState("https://photographylife.com/wp-content/uploads/2018/11/Moeraki-Boulders-New-Zealand.jpg"),
                    ImageUiState("https://fileinfo.com/img/ss/xl/jpg_44-2.jpg"),
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQT_famQ8sw5cQOIHCjNSS3wBtQLqMvglesuXZ6ONvzVGFeMpTR_kK-PJzshjgi30ZVEA&usqp=CAU"),
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSquLzM_rGaoRxh9LUtCtv43jR4TSa5j5uq0wWAwqgqp0892_3lUE3XzMRO1G59lL117Yg&usqp=CAU"),
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJn4_6x3ulCCc57xbsUMWurtAKdN6sukxvwA&s"),
                ), imageSvgList = listOf(
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFPAU8rBkD5OxnL5Zmi-mbhJrvyvb09n4Wfw&s"),
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThg82X5FYawxzhUZBeFRy2xo4TQB_8FjR7Wg&s"),
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0Wr3oWsq6KobkPqznhl09Wum9ujEihaUT4Q&s"),
                ), loading = false // after data loaded make it false
            )
        }

    }


}