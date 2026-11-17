package com.example.pocketpoker.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pocketpoker.DatosPruebaPartidas
import com.example.pocketpoker.Partida
import com.example.pocketpoker.R
import com.example.pocketpoker.ui.components.Cabecera
import com.example.pocketpoker.ui.components.CabeceraResumen
import com.example.pocketpoker.ui.components.TarjetaBoteGanador
import com.example.pocketpoker.ui.components.TarjetaDatosJuego
import com.example.pocketpoker.ui.components.TarjetaEstadisticasJugadores
import com.example.pocketpoker.ui.components.TarjetaMesaDetalle
import com.example.pocketpoker.ui.components.states.JugadorEstadisticaState
import com.example.pocketpoker.ui.components.states.TarjetaBoteGanadorState
import com.example.pocketpoker.ui.components.states.TarjetaDatosJuegoState
import com.example.pocketpoker.ui.components.states.TarjetaEstadisticasJugadoresState
import com.example.pocketpoker.ui.components.states.TarjetaMesaDetalleState

@Composable
fun PantallaDetallePartida(
    partida: Partida = DatosPruebaPartidas.listaPartidas[0],
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Cabecera(titulo = stringResource(R.string.titulo_detalle_partida))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.padding(5.dp))

            TarjetaMesaDetalle(
                state = TarjetaMesaDetalleState(
                    numeroMesa = partida.numeroMesa,
                    fecha = partida.fecha,
                    duracion = partida.duracion,
                    modo = partida.modo,
                    totalManos = partida.totalManos
                )
            )

            Spacer(modifier = Modifier.padding(15.dp))
            CabeceraResumen(titulo = stringResource(R.string.titulo_resumen))

            TarjetaBoteGanador(
                state = TarjetaBoteGanadorState(
                    boteTotal = partida.boteTotal,
                    ganadorNombre = partida.ganadorNombre
                )
            )

            Spacer(modifier = Modifier.padding(15.dp))

            TarjetaEstadisticasJugadores(
                state = TarjetaEstadisticasJugadoresState(
                    jugadores = partida.jugadores.map { jugador ->
                        JugadorEstadisticaState(
                            id = jugador.posicion,
                            nombre = jugador.nombre,
                            esGanador = jugador.esGanador,
                            fichasGanadasPerdidas = jugador.fichasGanadasPerdidas
                        )
                    }
                )
            )

            Spacer(modifier = Modifier.padding(15.dp))

            TarjetaDatosJuego(
                state = TarjetaDatosJuegoState(
                    mayorBoteGanado = partida.mayorBoteGanado,
                    ciegasFinales = partida.ciegasFinales,
                    totalManos = partida.totalManos
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaDetallePartidaPreview() {
    PantallaDetallePartida()
}