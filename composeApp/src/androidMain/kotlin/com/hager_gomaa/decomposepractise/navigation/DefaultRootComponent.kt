package com.hager_gomaa.decomposepractise.navigation
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.pushNew
import kotlinx.serialization.Serializable

class DefaultRootComponent( componentContext: ComponentContext,
) :  ComponentContext by componentContext {

    private val navigation = StackNavigation<Configuration>()
    val childStack = childStack(
        source = navigation,
        serializer = Configuration.serializer(),
        initialConfiguration = Configuration.ListOne,
        handleBackButton = true,
        childFactory = ::createChild
    )

    @OptIn(ExperimentalDecomposeApi::class)
    private fun createChild(
        config: Configuration,
        context: ComponentContext
    ): Child {
        return when(config) {
            Configuration.ListOne -> Child.ScreenOne(
                ListOneComponent(
                    componentContext = context,
                    onNavigateToScreenTwo = {
                        navigation.pushNew(Configuration.ListTwo)
                    }
                )
            )
            is Configuration.ListTwo -> Child.ScreenTwo(
                ListTwoComponent(
                    componentContext = context,
                    onBackPressed = {
                        navigation.pop()
                    }
                )
            )
        }
    }

    sealed class Child {
        data class ScreenOne(val component: ListOneComponent): Child()
        data class ScreenTwo(val component: ListTwoComponent): Child()
    }

    @Serializable // kotlinx-serialization plugin must be applied
  sealed interface Configuration {
        @Serializable
        data object ListOne : Configuration

        @Serializable
        data object ListTwo : Configuration
    }
}