# Affirmations App 

## Description
The Affirmations App is a simple Android application developed using Kotlin and Jetpack Compose. It displays a list of positive affirmation messages along with images in a vertically scrollable list. Each affirmation is shown inside a card with a rounded-corner design.

## Aim
To develop an Android application that displays positive affirmation messages with images using Kotlin and Jetpack Compose.

## Features
- Displays multiple affirmation messages.
- Shows an image for each affirmation.
- Uses a vertically scrollable list with `LazyColumn`.
- Displays each affirmation inside a Material Design card.
- Includes rounded corners and spacing for a clean UI.
- Uses reusable Jetpack Compose functions.

## Technologies Used
- **Language:** Kotlin
- **UI Framework:** Jetpack Compose
- **Design:** Material 3
- **IDE:** Android Studio

## Application Components
- `MainActivity.kt` – Main entry point of the application.
- `Affirmation` – Data class containing the image resource and affirmation text.
- `Affirmations()` – Creates and displays the list of affirmations.
- `AffirmationCard()` – Displays each affirmation inside a card.
- `AffirmationsPreview()` – Provides a preview of the application UI.

## Sample Affirmations
- I am Krishna.
- I am Chutki.
- I am a Krish.
- I am Sanaa.
- I am a boy and my name is Chutki.

## How to Run
1. Clone or download this repository.
2. Open the project in Android Studio.
3. Ensure the images `pic1`, `pic2`, and `pic3` are available in the `res/drawable` folder.
4. Sync the Gradle files.
5. Run the application on an Android emulator or physical device.

## Concepts Learned
- Kotlin data classes
- Jetpack Compose UI
- Composable functions
- `LazyColumn` and `items`
- Image resources using `painterResource`
- Material 3 cards and typography
- Layouts, modifiers, and padding

## Author
**Kondri Indumathi**
