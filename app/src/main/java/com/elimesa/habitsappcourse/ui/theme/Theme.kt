package com.elimesa.habitsappcourse.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


private val lightColorScheme = lightColorScheme(
    primary = Primary,
    secondary = Background,
    tertiary = Accent,
    background = Background,
    onPrimary = Accent,
    onSecondary = Primary,
    onBackground = Primary,
    onTertiary = Primary
)

@Composable
fun HabitsAppCourseTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = lightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}