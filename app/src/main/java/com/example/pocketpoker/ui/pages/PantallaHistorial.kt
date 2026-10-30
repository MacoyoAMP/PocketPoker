package com.example.pocketpoker.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pocketpoker.Partida
import com.example.pocketpoker.ui.components.Cabecera
import com.example.pocketpoker.ui.components.Proximamente
import com.example.pocketpoker.ui.components.SelectorPestañas
import com.example.pocketpoker.ui.components.TarjetaVertical

@Composable
fun PantallaHistorial(
    modifier: Modifier = Modifier
) {
    var pestanaSeleccionada by remember { mutableIntStateOf(0) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF0B141D))
    ) {
        Cabecera(titulo = "HISTORIAL")

        Spacer(modifier = Modifier.height(8.dp))

        SelectorPestañas(
            pestanaSeleccionada = pestanaSeleccionada,
            onPestanaSeleccionadaChange = { nuevaPestana ->
                pestanaSeleccionada = nuevaPestana
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        val listaPartidas = listOf(
            Partida(
                idMesa = "#0001",
                fecha = "28/10/2026",
                modo = "Local",
                boteFichas = "15.000 Fichas",
                ganador = "Alex"
            ),
            Partida(
                idMesa = "#0002",
                fecha = "27/10/2026",
                modo = "Online",
                boteFichas = "32.500 Fichas",
                ganador = "Millán"
            ),
            Partida(
                idMesa = "#0003",
                fecha = "25/10/2026",
                modo = "Local",
                boteFichas = "8.000 Fichas",
                ganador = "Quique"
            )
        )

        if (pestanaSeleccionada == 0) {
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                items(listaPartidas) { partidaIndividual ->
                    TarjetaVertical(partida = partidaIndividual)
                }
            }
        } else {
            Proximamente()
        }
    }
}

@Preview
@Composable
fun PantallaHistorialPreview() {
    PantallaHistorial()
}