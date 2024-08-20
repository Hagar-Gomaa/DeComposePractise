MyComposeApp
This Android application demonstrates a two-screen architecture using Jetpack Compose, Coil for image loading, Decompose for navigation, and the MVI architecture pattern with MVIKotlin.

Features
LazyColumn: Displays a scrollable list of images.
Coil: Loads PNG and SVG images from the internet and local resources.
Decompose: Manages screen navigation.
MVIKotlin: Implements the Model-View-Intent (MVI) architecture.
Technologies
Kotlin
Jetpack Compose
Coil
Decompose
MVIKotlin
Getting Started
Prerequisites
Android Studio Giraffe | 2022.3.1+
Kotlin 1.8+
Gradle 8.1+
Installation
Clone the Repository

bash

Copy code
git clone https://github.com/yourusername/MyComposeApp.git
cd MyComposeApp
Open the Project in Android Studio

Launch Android Studio and open the project directory.

Sync the Project

Allow the project to sync. Gradle will download necessary dependencies.

Build and Run
Connect a Device or Start an Emulator

Build and Run the App

In Android Studio, select your target device and click the "Run" button. Alternatively, use the command line:

bash
Copy code
./gradlew installDebug
