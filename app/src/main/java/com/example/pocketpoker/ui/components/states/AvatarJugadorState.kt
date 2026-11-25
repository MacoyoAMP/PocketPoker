package com.example.pocketpoker.ui.components.states

import androidx.annotation.DrawableRes
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.pocketpoker.R

data class AvatarJugadorState(
    // SIEMPRE (cuando el componente lleva imagen local):
    // "@DrawableRes" avisa a Android de que este Int tiene que ser un R.drawable.algo válido.
    @DrawableRes val imagenRes: Int = R.drawable.png_perfil,
    val nombreJugador: String,
    // CAMBIA: Valor por defecto, para no tener que escribirlo siempre si no hace falta
    val tamano: Dp = 28.dp
)