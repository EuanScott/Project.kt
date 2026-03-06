package com.example.projectkt.core.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Primary colors
val primary = Color(0xFF1BA6A6)
val secondary = Color(0xFFE76F51)
val disabledColor = Color(0xFF8A9A9A)

// Text colors
// off black as it's easier on the eye
val textBlack = Color(0xDD000000)
val textWhite = Color(0xFFFFFFFF)

// Feedback colors
val error = Color(0xFFD32F2F)
val success = Color(0xFF388E3C)
val warning = Color(0xFFFFA000)
val info = Color(0xFF1976D2)

// Background colors - light
val surfaceLight = Color(0xFFF4F6F7)
val surfaceVariantLight = Color(0xFFEFF2F3)

// Background colors - dark
val surfaceDark = Color(0xFF121212)
val surfaceVariantDark = Color(0xFF2C2C2C)

// Border colors
val outline = Color(0xFFBDBDBD)

val LightColorScheme = lightColorScheme(
    primary = primary,
    onPrimary = textWhite,
    secondary = secondary,
    onSecondary = textBlack,
    error = error,
    onError = textWhite,
    surface = surfaceLight,
    onSurface = textBlack,
    surfaceContainerHighest = surfaceVariantLight,
    outline = outline,
)

val DarkColorScheme = darkColorScheme(
    primary = primary,
    onPrimary = textWhite,
    secondary = secondary,
    onSecondary = textWhite,
    error = error,
    onError = textWhite,
    surface = surfaceVariantDark,
    onSurface = textWhite,
    surfaceContainerHighest = surfaceDark,
    outline = outline,
)