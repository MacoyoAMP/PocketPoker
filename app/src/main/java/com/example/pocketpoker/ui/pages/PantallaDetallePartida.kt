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
import com.example.pocketpoker.ui.components.TarjetaBoteGanador
import com.example.pocketpoker.ui.components.TarjetaDatosJuego
import com.example.pocketpoker.ui.components.TarjetaEstadisticasJugadores
import com.example.pocketpoker.ui.components.TarjetaMesaDetalle
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
            Spacer(modifier = Modifier.padding(5.dp))
            TarjetaMesaDetalle(partida=partida)
            Spacer(modifier = Modifier.padding(15.dp))
            CabeceraResumen(titulo = "RESUMEN")
            TarjetaBoteGanador(partida = partida)
            Spacer(modifier = Modifier.padding(15.dp))
            TarjetaEstadisticasJugadores(partida = partida)
            Spacer(modifier = Modifier.padding(15.dp))
            TarjetaDatosJuego(partida = partida)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaDetallePartidaPreview() {
    PantallaDetallePartida()
}