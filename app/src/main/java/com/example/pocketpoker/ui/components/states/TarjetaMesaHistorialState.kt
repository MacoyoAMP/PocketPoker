package com.example.pocketpoker.ui.components.states

// CAMBIA
// Caja con los datos resumidos que pinta cada tarjeta en la lista (LazyColumn) del historial.
data class TarjetaMesaHistorialState(
    val numeroMesa: String,
    val fecha: String,
    val boteTotal: String,
    val modo: String,
    val ganadorNombre: String
)