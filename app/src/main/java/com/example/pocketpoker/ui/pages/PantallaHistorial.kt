package com.example.pocketpoker.ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pocketpoker.DatosPruebaPartidas
import com.example.pocketpoker.Partida
import com.example.pocketpoker.ui.components.Cabecera
import com.example.pocketpoker.ui.components.Proximamente
import com.example.pocketpoker.ui.components.SelectorPestañas
import com.example.pocketpoker.ui.components.TarjetaMesaHistorial

@Composable
fun PantallaHistorial(
    listaPartidas: List<Partida> = DatosPruebaPartidas.listaPartidas,
    modifier: Modifier = Modifier
) {
    var pestanaSeleccionada by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            Cabecera(titulo = "HISTORIAL")
        },
        containerColor = Color(0xFF0B141D),
        modifier = modifier
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            SelectorPestañas(
                pestanaSeleccionada = pestanaSeleccionada,
                onPestanaSeleccionadaChange = { nuevaPestana ->
                    pestanaSeleccionada = nuevaPestana
                }
            )

            Spacer(modifier = Modifier.height(8.dp))

            if (pestanaSeleccionada == 0) {
                LazyColumn(
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(listaPartidas) { partidaIndividual ->
                        TarjetaMesaHistorial(partida = partidaIndividual)
                    }
                }
            } else {
                Proximamente()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaHistorialPreview() {
    PantallaHistorial()
}