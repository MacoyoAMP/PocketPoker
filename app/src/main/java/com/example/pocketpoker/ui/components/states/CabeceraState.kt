package com.example.pocketpoker.ui.components.states

// CAMBIA
//State que mezcla datos con clic
data class CabeceraState(
    val titulo: String,
    // SIEMPRE (cuando un botón va dentro del State): "= {}" evita obligar a pasarlo a Previews
    val onVolverClick: () -> Unit = {}
)