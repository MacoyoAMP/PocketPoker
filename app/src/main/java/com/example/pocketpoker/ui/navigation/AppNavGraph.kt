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

@Composable
fun AppNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Rutas.LOGIN,
        modifier = modifier
    ) {
        // 1. Pantalla de Login
        composable(route = Rutas.LOGIN) {
            PantallaLogin(
                onLoginSuccess = {
                    navController.navigate(Rutas.HISTORIAL) {
                        popUpTo(Rutas.LOGIN) { inclusive = true }
                    }
                }
            )
        }

        // 2. Pantalla de Listado (Historial)
        composable(route = Rutas.HISTORIAL) {
            PantallaHistorial(
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

        // 3. Pantalla de Detalle (pasa partidaId al ViewModel de la pantalla)
        composable(
            route = Rutas.DETALLE,
            arguments = listOf(
                navArgument("partidaId") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val partidaId = backStackEntry.arguments?.getString("partidaId")

            PantallaDetallePartida(
                partidaId = partidaId,
                onVolverClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}