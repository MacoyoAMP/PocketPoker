package com.example.pocketpoker.ui.navigation

// CAMBIA
// Aquí van los nombres de todas las pantallas (como direcciones web).
object Rutas {
    const val LOGIN = "login"
    const val HISTORIAL = "historial"

    // PASO DE PARÁMETROS
    // Lo que va entre llaves {partidaId} es el hueco para pasar el ID de una pantalla a otra.
    const val DETALLE = "detalle/{partidaId}"

    // Función cómoda para rellenar ese hueco sin equivocarnos escribiendo barras "/"
    fun crearRutaDetalle(partidaId: String): String {
        return "detalle/$partidaId"
    }
}