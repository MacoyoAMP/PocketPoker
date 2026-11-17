package com.example.pocketpoker

data class JugadorPartida(
    val posicion: Int,
    val nombre: String,
    val esGanador: Boolean = false,
    val fichasGanadasPerdidas: Int
)