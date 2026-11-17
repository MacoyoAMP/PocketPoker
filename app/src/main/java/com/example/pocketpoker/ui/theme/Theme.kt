package com.example.pocketpoker.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    background = FondoOscuro,
    surface = SuperficieTarjeta,
    primary = DoradoPrincipal,
    secondary = VerdeGanador,
    onBackground = TextoBlanco,
    onSurface = TextoBlanco,
    onPrimary = FondoOscuro
)

@Composable
fun PocketPokerTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}