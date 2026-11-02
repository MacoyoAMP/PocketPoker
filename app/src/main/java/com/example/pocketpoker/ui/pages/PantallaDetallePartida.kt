package com.example.pocketpoker.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pocketpoker.DatosPruebaPartidas
import com.example.pocketpoker.Partida
import com.example.pocketpoker.ui.components.Cabecera
import com.example.pocketpoker.ui.components.CabeceraResumen
import com.example.pocketpoker.ui.components.TarjetaVerticalDatosJuego
import com.example.pocketpoker.ui.components.TarjetaVerticalGanador
import com.example.pocketpoker.ui.components.TarjetaVerticalJugadores
import com.example.pocketpoker.ui.components.TarjetaVerticalMesa

@Composable
fun PantallaDetallePartida(
    partida: Partida = DatosPruebaPartidas.listaPartidas[0],
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF0B141D))
    ) {
        Cabecera(titulo = "DETALLE DE PARTIDA")

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            TarjetaVerticalMesa(partida=partida)
            Spacer(modifier = Modifier.padding(15.dp))
            CabeceraResumen(titulo = "RESUMEN")
            TarjetaVerticalGanador(partida = partida)
            Spacer(modifier = Modifier.padding(15.dp))
            TarjetaVerticalJugadores(partida = partida)
            Spacer(modifier = Modifier.padding(15.dp))
            TarjetaVerticalDatosJuego(partida = partida)
        }
    }
}

@Preview
@Composable
fun PantallaDetallePartidaPreview() {
    PantallaDetallePartida()
}