package com.example.pocketpoker.ui.navigation

object Rutas {
    const val LOGIN = "login"
    const val HISTORIAL = "historial"
    const val DETALLE = "detalle/{partidaId}"

    fun crearRutaDetalle(partidaId: String): String {
        return "detalle/$partidaId"
    }
}