package com.hager_gomaa.decomposepractise

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import com.hager_gomaa.decomposepractise.navigation.DefaultRootComponent
import com.hager_gomaa.decomposepractise.screens.ListOneScreen
import com.hager_gomaa.decomposepractise.screens.ListTwoScreen
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import decomposepractise.composeapp.generated.resources.Res
import decomposepractise.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App(root:DefaultRootComponent) {
    MaterialTheme {
        val childStack by root.childStack.subscribeAsState()
        Children(
            stack = childStack,
            animation = stackAnimation(slide())
        ) { child ->
            when(val instance = child.instance) {
                is DefaultRootComponent.Child.ScreenOne -> ListOneScreen(instance.component)
                is DefaultRootComponent.Child.ScreenTwo -> ListTwoScreen( instance.component)
            }
        }
    }
}