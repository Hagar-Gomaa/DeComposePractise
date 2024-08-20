package com.hager_gomaa.decomposepractise.viewmodel

import androidx.lifecycle.ViewModel
import com.hager_gomaa.decomposepractise.viewmodel.state.ImageUiState
import com.hager_gomaa.decomposepractise.viewmodel.state.RemoteDataUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class RemoteDataViewModel @Inject constructor() : ViewModel() {
    // state to save state Data
    private val _state = MutableStateFlow(RemoteDataUiState())
    val state = _state.asStateFlow()

    init {
        // call fun with viewModel object create
        getRemotePhotos()
    }

    fun getRemotePhotos() {
        // update state with list of remote images in jpeg  and svg
        _state.update {
            it.copy(
                list = listOf(
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrg27eYIqS05BROulGEfXLj2kWEmYj7Qg01shgZe6MmJjSN8wmOHcc6p3aZuX18HIqeqw&usqp=CAU"),
                    ImageUiState("https://photographylife.com/wp-content/uploads/2018/11/Moeraki-Boulders-New-Zealand.jpg"),
                    ImageUiState("https://fileinfo.com/img/ss/xl/jpg_44-2.jpg"),
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQT_famQ8sw5cQOIHCjNSS3wBtQLqMvglesuXZ6ONvzVGFeMpTR_kK-PJzshjgi30ZVEA&usqp=CAU"),
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSquLzM_rGaoRxh9LUtCtv43jR4TSa5j5uq0wWAwqgqp0892_3lUE3XzMRO1G59lL117Yg&usqp=CAU"),
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJn4_6x3ulCCc57xbsUMWurtAKdN6sukxvwA&s"),
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFPAU8rBkD5OxnL5Zmi-mbhJrvyvb09n4Wfw&s"),
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThg82X5FYawxzhUZBeFRy2xo4TQB_8FjR7Wg&s"),
                    ImageUiState("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0Wr3oWsq6KobkPqznhl09Wum9ujEihaUT4Q&s"),
                )
            )
        }
    }


}