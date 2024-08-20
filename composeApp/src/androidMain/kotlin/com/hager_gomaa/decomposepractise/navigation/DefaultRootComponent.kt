package com.hager_gomaa.decomposepractise.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.pushNew
import kotlinx.serialization.Serializable

class DefaultRootComponent(
    componentContext: ComponentContext //ComponentContext - provides  for components to manage lifecycle, state saving.
) : ComponentContext by componentContext {

    private val navigation = StackNavigation<Configuration>()

    // stack navigation model.
    val childStack = childStack(
        source = navigation,
        serializer = Configuration.serializer(),
        initialConfiguration = Configuration.ListOne,// The initial child component is ListOne
        handleBackButton = true,
        childFactory = ::createChild
    )

    // make childFactory to manage object component uses with its Configuration
    @OptIn(ExperimentalDecomposeApi::class)
    private fun createChild(
        config: Configuration,
        context: ComponentContext
    ): Child {
        return when (config) {
            Configuration.ListOne -> Child.ScreenOne(
                ScreenOneComponent(
                    componentContext = context,
                    onNavigateToScreenTwo = {   //Supply callbacks
                        navigation.pushNew(Configuration.ListTwo)   // Push the ListTwo component

                    }
                )
            )

            is Configuration.ListTwo -> Child.ScreenTwo(
                ScreenTwoComponent(
                    componentContext = context,
                    onBackPressed = {   //  callbacks
                        navigation.pop()  // pop previous component
                    }
                )
            )
        }
    }

    //
    sealed class Child {
        data class ScreenOne(val component: ScreenOneComponent) : Child()
        data class ScreenTwo(val component: ScreenTwoComponent) : Child()
    }

    @Serializable // kotlinx-serialization plugin must be applied
    sealed interface Configuration {
        @Serializable
        data object ListOne : Configuration

        @Serializable
        data object ListTwo : Configuration
    }
}