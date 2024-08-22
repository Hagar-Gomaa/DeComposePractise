package com.hager_gomaa.decomposepractise.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel <S,I>(initialState:S):ViewModel() {
    // state to save state Data
    protected val _state= MutableStateFlow(initialState)
    // make another one public so can access it from sub classes of base class
    val state=_state.asStateFlow()

    private val _intent = MutableSharedFlow<I>()
    val intent=_intent.asSharedFlow()

     fun intentActionExecutor(intent:I){
         // emit flow of intent to be able to listen
     viewModelScope.launch {
         _intent.emit(intent)
     }
    }
}