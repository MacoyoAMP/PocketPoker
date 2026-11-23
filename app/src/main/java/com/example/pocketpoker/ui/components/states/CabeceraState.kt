package com.example.pocketpoker.ui.components.states

data class CabeceraState(
    val titulo: String,
    val onVolverClick: () -> Unit = {}
)