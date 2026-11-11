package com.example.pocketpoker.ui.components.states

data class TarjetaEstadisticasJugadoresState(
    val jugadores: List<JugadorEstadisticaState>
)

data class JugadorEstadisticaState(
    val id: Int,
    val nombre: String,
    val esGanador: Boolean,
    val fichasGanadasPerdidas: Int
)