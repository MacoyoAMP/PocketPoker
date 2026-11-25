package com.example.pocketpoker.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pocketpoker.R
import com.example.pocketpoker.ui.components.states.AvatarJugadorState
@Composable
fun AvatarJugador(
    state: AvatarJugadorState,
    modifier: Modifier = Modifier
) {
    // SIEMPRE (para pintar imágenes guardadas en res/drawable):
    Image(
        // Carga el archivo de res/drawable
        painter = painterResource(id = state.imagenRes),
        // Descripción de accesibilidad usando strings.xml con parámetro (%1$s)
        contentDescription = stringResource(R.string.cd_avatar_jugador, state.nombreJugador),
        // Crop recorta la imagen para que rellene todo el círculo sin deformarse
        contentScale = ContentScale.Crop,
        modifier = modifier
            .size(state.tamano)
            .clip(CircleShape) // Recorta en círculo
            .border(
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
                shape = CircleShape
            )
    )
}

@Preview(showBackground = true)
@Composable
fun AvatarJugadorPreview() {
    AvatarJugador(
        state = AvatarJugadorState(
            imagenRes = R.drawable.png_perfil,
            nombreJugador = "Alex"
        )
    )
}