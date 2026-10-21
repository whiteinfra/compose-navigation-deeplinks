# Compose Navigation & Deep Links

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white)

A multi-screen Compose app (Home, Profile, Settings) with **Navigation Compose**, shared state in a **ViewModel + StateFlow**, **state hoisting** for inputs and **deep links** straight into a profile screen.

> Lab #3 · Mobile Application Development course. Ukrainian version: [README.uk.md](README.uk.md)

## Try the deep link

With an emulator running:

```bash
adb shell am start -a android.intent.action.VIEW -d "myapp://profile/777" com.example.multiscreenapp
```

The app opens the profile screen for ID `777`.

## Tech stack

Kotlin · Jetpack Compose · Navigation Compose · ViewModel · StateFlow · Material 3

## Run locally

Open in Android Studio, let Gradle sync, run on API 26+.
