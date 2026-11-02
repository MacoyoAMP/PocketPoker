package com.example.pocketpoker
data class Partida(
    val id: String,
    val numeroMesa: String,
    val fecha: String,
    val duracion: String,
    val modo: String,           // "Local", "Multi", etc.
    val boteTotal: String,
    val ganadorNombre: String,
    val totalManos: Int,
    val mayorBoteGanado: String,
    val ciegasFinales: String,
    val jugadores: List<JugadorPartida> = emptyList()
)