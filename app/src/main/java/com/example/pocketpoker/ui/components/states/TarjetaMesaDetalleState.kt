package com.example.pocketpoker.ui.components.states

// CAMBIA
// Caja con los datos de cabecera de la mesa en la pantalla de detalle.
data class TarjetaMesaDetalleState(
    val numeroMesa: String,
    val fecha: String,
    val duracion: String,
    val modo: String,
    val totalManos: Int
)