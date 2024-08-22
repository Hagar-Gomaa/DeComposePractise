package com.hager_gomaa.decomposepractise.screentwo.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hager_gomaa.decomposepractise.R
import com.hager_gomaa.decomposepractise.base.BaseViewModel
import com.hager_gomaa.decomposepractise.screenone.ui.uistate.ScreenOneUiState
import com.hager_gomaa.decomposepractise.screentwo.intent.ScreenTwoIntent
import com.hager_gomaa.decomposepractise.screentwo.uistate.ImageIdUiState
import com.hager_gomaa.decomposepractise.screentwo.uistate.ScreenTwoUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ResouresDataViewModel @Inject constructor(): BaseViewModel<ScreenTwoUiState, ScreenTwoIntent>(
    ScreenTwoUiState()
) {
    init {
        // call fun with viewModel object create
        processIntent()
    }

    private fun processIntent() {
        viewModelScope.launch {
            intent.collect{screenOneIntent->
                when(screenOneIntent){
                    ScreenTwoIntent.onScreenOneOpen->getPhotosResourse()
                }
            }
        }
    }


    fun getPhotosResourse() {
        // make loading true first
        _state.update { it.copy(loading = true) }
        // update state with list of ids images in jpeg  and svg
        _state.update {
            it.copy(
                list = listOf(
                    ImageIdUiState(R.drawable.ic_android),
                    ImageIdUiState(R.drawable.ic_flower_three),
                    ImageIdUiState(R.drawable.ic_home),
                    ImageIdUiState(R.drawable.ic_flower_two),
                    ImageIdUiState(R.drawable.ic_flower_shape),
                    ImageIdUiState(R.drawable.ic_view_image),
                    ImageIdUiState(R.drawable.ic_question_mark),
                    ), loading = false
            )
        }
    }


}