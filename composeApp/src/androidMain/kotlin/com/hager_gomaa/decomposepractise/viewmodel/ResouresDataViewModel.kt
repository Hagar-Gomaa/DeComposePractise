package com.hager_gomaa.decomposepractise.viewmodel

import androidx.lifecycle.ViewModel
import com.hager_gomaa.decomposepractise.R
import com.hager_gomaa.decomposepractise.viewmodel.state.ImageIdUiState
import com.hager_gomaa.decomposepractise.viewmodel.state.ResoursesDataUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class ResouresDataViewModel @Inject constructor() : ViewModel() {
    // state to save state Data
    private val _state = MutableStateFlow(ResoursesDataUiState())
    val state = _state.asStateFlow()

    init {
        // call fun with viewModel object create
        getPhotosResourse()
    }

    fun getPhotosResourse() {
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

                    )
            )
        }
    }


}