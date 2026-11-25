package com.example.pocketpoker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.pocketpoker.ui.navigation.AppNavGraph
import com.example.pocketpoker.ui.theme.PocketPokerTheme

// SIEMPRE
// Punto de entrada de la app.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // CAMBIA (solo el nombre del tema de tu proyecto nuevo)
            // Envuelve toda la app para aplicar colores y tipografía.
            PocketPokerTheme {
                // SIEMPRE
                // Crea el mando a distancia que controla a qué pantalla navegamos.
                val navController = rememberNavController()
                // El Scaffold va UNA SOLA VEZ aquí fuera (nunca dentro de cada pantalla).
                // "innerPadding" evita que el contenido se meta debajo de la barra de hora/batería.
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // SIEMPRE
                    // Carga el mapa de pantallas y le pasa el margen (innerPadding).
                    AppNavGraph(
                        navController = navController,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}