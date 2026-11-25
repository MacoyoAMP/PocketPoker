package com.example.pocketpoker.ui.components.states

// CAMBIA
// State que contiene una LISTA (por eso luego en la pantalla se usa .map).
data class TarjetaEstadisticasJugadoresState(
    val jugadores: List<JugadorEstadisticaState>
)

// Cada fila individual dentro de esa tarjeta usa esta data class:
data class JugadorEstadisticaState(
    val id: Int,
    val nombre: String,
    val esGanador: Boolean,
    val fichasGanadasPerdidas: Int
)