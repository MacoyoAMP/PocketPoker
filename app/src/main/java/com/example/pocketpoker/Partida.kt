package com.example.pocketpoker

data class Partida(
    val idMesa: String,      // Ejemplo: "#9999"
    val fecha: String,       // Ejemplo: "28/10/2026"
    val modo: String,        // Ejemplo: "Local" o "Multi"
    val boteFichas: String,  // Ejemplo: "15.000 Fichas"
    val ganador: String
)
