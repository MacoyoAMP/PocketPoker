package com.example.pocketpoker.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

// CAMBIA
// Asigna los colores de Color.kt a los huecos de MaterialTheme.
// Así luego en las pantallas se usa "MaterialTheme.colorScheme.primary" en vez de poner el color fijo.
private val DarkColorScheme = darkColorScheme(
    background = FondoOscuro,        // Fondo general de las pantallas
    surface = SuperficieTarjeta,     // Fondo de las tarjetas
    primary = DoradoPrincipal,       // Color principal (botones, bordes destacados, títulos)
    secondary = VerdeGanador,        // Color secundario (detalles positivos)
    onBackground = TextoBlanco,      // Color del texto encima del fondo
    onSurface = TextoBlanco,         // Color del texto encima de las tarjetas
    onPrimary = FondoOscuro          // Color del texto encima de un botón primario
)

// SIEMPRE (solo cambia el nombre de la función por el de la app)
// Envuelve toda la app en MainActivity para que todos los componentes hereden estos colores.
@Composable
fun PocketPokerTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}