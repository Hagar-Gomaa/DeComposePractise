package com.hager_gomaa.decomposepractise.navigation

import com.arkivanov.decompose.ComponentContext

class ListTwoComponent (componentContext: ComponentContext, val onBackPressed:() -> Unit
):RootComponent ,ComponentContext by componentContext{
    override fun onBackClicked() {
           onBackPressed()
    }

    override fun onNextClicked(toIndex: Int) {
        TODO("Not yet implemented")
    }

}