package com.example.pocketpoker.ui.components.states

import androidx.annotation.DrawableRes
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.pocketpoker.R

data class AvatarJugadorState(
    @DrawableRes val imagenRes: Int = R.drawable.png_perfil,
    val nombreJugador: String,
    val tamano: Dp = 28.dp
)