package com.example.pocketpoker.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pocketpoker.R
import com.example.pocketpoker.ui.components.states.JugadorEstadisticaState
import com.example.pocketpoker.ui.components.states.TarjetaEstadisticasJugadoresState

@Composable
fun TarjetaEstadisticasJugadores(
    state: TarjetaEstadisticasJugadoresState,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        Row(modifier = Modifier) {
            CabeceraResumen(
                titulo = stringResource(R.string.titulo_estadisticas_jugadores),
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier
            )
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 2.dp, bottom = 6.dp, start = 12.dp, end = 12.dp),
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
        ) {
            Column(modifier = Modifier) {
                state.jugadores.forEachIndexed { index, jugador ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = stringResource(R.string.cd_foto_perfil),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "${index + 1}.${jugador.nombre}",
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 20.sp
                        )
                        if (jugador.esGanador) {
                            Text(
                                text = stringResource(R.string.label_ganador_tag),
                                color = MaterialTheme.colorScheme.secondary,
                                fontSize = 20.sp
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = jugador.fichasGanadasPerdidas.toString(),
                            color = if (jugador.fichasGanadasPerdidas >= 0)
                                MaterialTheme.colorScheme.secondary
                            else
                                MaterialTheme.colorScheme.error,
                            fontSize = 20.sp
                        )
                    }
                    if (index < state.jugadores.size - 1) {
                        HorizontalDivider(
                            modifier = Modifier.padding(horizontal = 12.dp),
                            thickness = 1.dp,
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaEstadisticasJugadoresPreview(){
    TarjetaEstadisticasJugadores(
        state = TarjetaEstadisticasJugadoresState(
            jugadores = listOf(
                JugadorEstadisticaState(1, "Alex", esGanador = true, fichasGanadasPerdidas = 8500),
                JugadorEstadisticaState(2, "Cris", esGanador = false, fichasGanadasPerdidas = -3000),
                JugadorEstadisticaState(3, "Andrés", esGanador = false, fichasGanadasPerdidas = -5500)
            )
        )
    )
}