package com.hager_gomaa.decomposepractise

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import com.hager_gomaa.decomposepractise.root.DefaultRootComponent
import com.hager_gomaa.decomposepractise.screenone.screen.ScreenOne
import com.hager_gomaa.decomposepractise.screentwo.screen.ScreenTwo
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(root:DefaultRootComponent) {
    MaterialTheme {
        // get child state from DefaultRootComponent and subscribeAsState to handel navigation
        val childStack by root.childStack.subscribeAsState()
        Children(
            stack = childStack,
            animation = stackAnimation(slide())//navigation animation silde
        ) { child ->
            // when child type ScreenOne show Screen One passing its component and also other case
            when(val instance = child.instance) {
                is DefaultRootComponent.Child.ScreenOne -> ScreenOne(instance.component)
                is DefaultRootComponent.Child.ScreenTwo -> ScreenTwo( instance.component)
            }
        }
    }
}