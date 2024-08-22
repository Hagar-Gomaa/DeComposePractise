package com.hager_gomaa.decomposepractise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.arkivanov.decompose.retainedComponent
import com.hager_gomaa.decomposepractise.navigation.DefaultRootComponent
@OptIn(com.arkivanov.decompose.ExperimentalDecomposeApi::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = retainedComponent {
            DefaultRootComponent(it)
        }
        setContent {
            App(root)
        }
    }
}

