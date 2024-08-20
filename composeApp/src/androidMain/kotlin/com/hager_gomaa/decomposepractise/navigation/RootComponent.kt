package com.hager_gomaa.decomposepractise.navigation

interface RootComponent {
//    val stack: Value<ChildStack<*, Child>>

    fun onBackClicked()
    fun onNextClicked(toIndex: Int)

    // Defines all possible child components
    sealed class Child {
        class ListOneChild(val component: ListOneComponent) : Child()
        class ListTwoChild(val component: ListTwoComponent) : Child()
    }
}