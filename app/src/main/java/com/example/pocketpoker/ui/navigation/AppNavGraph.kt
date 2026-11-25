package com.example.pocketpoker.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.pocketpoker.ui.pages.PantallaDetallePartida
import com.example.pocketpoker.ui.pages.PantallaHistorial
import com.example.pocketpoker.ui.pages.PantallaLogin

// SIEMPRE
// Estructura base de navegación. Solo cambia "startDestination" y las pantallas de dentro.
@Composable
fun AppNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Rutas.LOGIN, // CAMBIA: Pantalla con la que arranca la app
        modifier = modifier
    ) {
        // 1. Pantalla de Login
        composable(route = Rutas.LOGIN) {
            PantallaLogin(
                onLoginSuccess = {
                    // Navega al historial y borra el Login del historial (popUpTo)
                    // para que al dar al botón Atrás del móvil no vuelva al formulario.
                    navController.navigate(Rutas.HISTORIAL) {
                        popUpTo(Rutas.LOGIN) { inclusive = true }
                    }
                }
            )
        }

        // 2. Pantalla de Listado (Historial)
        composable(route = Rutas.HISTORIAL) {
            PantallaHistorial(
                // CAMBIA
                // Al pulsar una tarjeta, viajamos al detalle pasándole su ID
                onPartidaClick = { partidaId ->
                    navController.navigate(Rutas.crearRutaDetalle(partidaId))
                },
                onVolverClick = {
                    navController.navigate(Rutas.LOGIN) {
                        popUpTo(Rutas.HISTORIAL) { inclusive = true }
                    }
                }
            )
        }

        // 3. Pantalla de Detalle (recibe el parámetro por la ruta)
        composable(
            route = Rutas.DETALLE,
            // SIEMPRE
            // (cuando pasas un parámetro): Declaras cómo se llama y de qué tipo es
            arguments = listOf(
                navArgument("partidaId") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            // SIEMPRE
            // Saca el dato que venía viajando en la ruta
            val partidaId = backStackEntry.arguments?.getString("partidaId")

            PantallaDetallePartida(
                partidaId = partidaId,
                onVolverClick = {
                    // SIEMPRE
                    // Cierra la pantalla actual y vuelve a la anterior
                    navController.popBackStack()
                }
            )
        }
    }
}