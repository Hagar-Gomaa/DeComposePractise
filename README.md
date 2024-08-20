Application Overview
This is a simple Android application built with Jetpack Compose, demonstrating two screens that display a list of images. The app leverages the following key technologies and architectures:

Jetpack Compose for building the UI.

LazyColumn to display a scrollable list of items.

Coil for loading images, both PNG and SVG, from the internet and local resources.

Decompose for navigation between screens.

MVIKotlin to implement the MVI (Model-View-Intent) architecture.

Features

First Screen: Displays a list of images loaded from the internet using Coil.

Second Screen: Displays a list of images loaded from local resource files (PNG and SVG).

Navigation: Handled using Decompose.

MVI Architecture: The application follows the MVI architecture pattern, implemented using the MVIKotlin library.


Libraries Used

Jetpack Compose - Modern Android UI toolkit.

Coil - Image loading library for Kotlin.

Decompose - Kotlin Multiplatform lifecycle-aware component and state management.

MVIKotlin - Kotlin Multiplatform MVI architecture library.




The first screen fetches and displays images from the internet using Coil.
The second screen loads images from the app's drawable resources.

MVI Implementation The app follows the MVI architecture.


