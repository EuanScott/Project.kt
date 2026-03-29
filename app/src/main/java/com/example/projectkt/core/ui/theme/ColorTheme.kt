package com.example.projectkt.core.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Primary colors
//val primary = Color(0xFF1BA6A6)
//val secondary = Color(0xFFE76F51)
//val disabledColor = Color(0xFF8A9A9A)
//
//// Text colors
//// off black as it's easier on the eye
//val textBlack = Color(0xDD000000)
//val textWhite = Color(0xFFFFFFFF)
//
//// Feedback colors
//val error = Color(0xFFD32F2F)
//val success = Color(0xFF388E3C)
//val warning = Color(0xFFFFA000)
//val info = Color(0xFF1976D2)

// Background colors - light
//val surfaceLight = Color(0xFFF4FBFA)
//val onSurfaceLight = Color(0xFF161D1D)
//val surfaceVariantLight = Color(0xFFDAE5E4)
//val onSurfaceVariantLight = Color(0xFF3F4948)
//
//// Background colors - dark
//val surfaceDark = Color(0xFF0E1514)
//val onSurfaceDark = Color(0xFFDDE4E3)
//val surfaceVariantDark = Color(0xFF3F4948)
//val onSurfaceVariantDark = Color(0xFFBEC9C8)
//
//// Border colors
//val outline = Color(0xFFBDBDBD)

// Brand / key colors
val primary = Color(0xFF006A6A)
val onPrimary = Color(0xFFFFFFFF)
val primaryContainerLight = Color(0xFFBFE9E8)
val onPrimaryContainerLight = Color(0xFF003738)
val primaryContainerDark = Color(0xFF1C4F4F)
val onPrimaryContainerDark = Color(0xFFBFE9E8)
val secondary = Color(0xFF4A6363)
val onSecondaryLight = Color(0xFFFFFFFF)
val onSecondaryDark = Color(0xFF1B3534)
val secondaryContainerLight = Color(0xFFC5E0DF)
val onSecondaryContainerLight = Color(0xFF324B4B)
val secondaryContainerDark = Color(0xFF324B4B)
val onSecondaryContainerDark = Color(0xFFCCE8E7)

val tertiaryLight = Color(0xFF4B607C)
val onTertiaryLight = Color(0xFFFFFFFF)
val tertiaryContainerLight = Color(0xFFD3E4FF)
val onTertiaryContainerLight = Color(0xFF334863)
val tertiaryDark = Color(0xFFB3C8E8)
val onTertiaryDark = Color(0xFF1C314B)
val tertiaryContainerDark = Color(0xFF334863)
val onTertiaryContainerDark = Color(0xFFD3E4FF)

val errorLight = Color(0xFFBA1A1A)
val onErrorLight = Color(0xFFFFFFFF)
val errorContainerLight = Color(0xFFFFDAD6)
val onErrorContainerLight = Color(0xFF93000A)
val errorDark = Color(0xFFFFB4AB)
val onErrorDark = Color(0xFF690005)
val errorContainerDark = Color(0xFF93000A)
val onErrorContainerDark = Color(0xFFFFDAD6)

val success = Color(0xFF388E3C)
val warning = Color(0xFFFFA000)
val info = Color(0xFF1976D2)
val disabledColor = Color(0xFF8A9A9A)

// Background / surface roles
val backgroundLight = Color(0xFFF5FAFA)
val onBackgroundLight = Color(0xFF161D1D)
val surfaceLight = Color(0xFFF0F7F6)
val onSurfaceLight = Color(0xFF142020)
val surfaceVariantLight = Color(0xFFCFE0DF)
val onSurfaceVariantLight = Color(0xFF334544)
val outlineLight = Color(0xFF667877)
val outlineVariantLight = Color(0xFFB2C8C7)
val scrimLight = Color(0xFF000000)
val inverseSurfaceLight = Color(0xFF243130)
val inverseOnSurfaceLight = Color(0xFFEAF3F2)
val inversePrimaryLight = Color(0xFF80D5D4)
val surfaceContainerLowestLight = Color(0xFFFFFFFF)
val surfaceContainerLowLight = Color(0xFFE7F2F1)
val surfaceContainerLight = Color(0xFFDEECEB)
val surfaceContainerHighLight = Color(0xFFD4E6E5)
val surfaceContainerHighestLight = Color(0xFFC7DEDD)
val backgroundDark = Color(0xFF0E1514)
val onBackgroundDark = Color(0xFFDDE4E3)
val surfaceDark = Color(0xFF101919)
val onSurfaceDark = Color(0xFFDDE6E5)
val surfaceVariantDark = Color(0xFF3A4B4A)
val onSurfaceVariantDark = Color(0xFFBAC9C8)
val outlineDark = Color(0xFF839594)
val outlineVariantDark = Color(0xFF3A4B4A)
val scrimDark = Color(0xFF000000)
val inverseSurfaceDark = Color(0xFFDDE4E3)
val inverseOnSurfaceDark = Color(0xFF233130)
val inversePrimaryDark = Color(0xFF006A6A)
val surfaceContainerLowestDark = Color(0xFF081010)
val surfaceContainerLowDark = Color(0xFF131E1D)
val surfaceContainerDark = Color(0xFF172322)
val surfaceContainerHighDark = Color(0xFF21302F)
val surfaceContainerHighestDark = Color(0xFF2B3C3B)

// Backwards-compatible aliases for existing call sites.
val textBlack = onSurfaceLight
val textWhite = onPrimary
val outline = outlineLight
val LightColorScheme = lightColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondary,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF80D5D4),
    onPrimary = Color(0xFF003737),
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = Color(0xFFB0CCCB),
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)