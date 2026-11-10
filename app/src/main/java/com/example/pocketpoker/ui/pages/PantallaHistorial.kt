package com.example.pocketpoker.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pocketpoker.DatosPruebaPartidas
import com.example.pocketpoker.Partida
import com.example.pocketpoker.ui.components.Cabecera
import com.example.pocketpoker.ui.components.TarjetaMesaHistorial

@Composable
fun PantallaHistorial(
    listaPartidas: List<Partida> = DatosPruebaPartidas.listaPartidas,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Cabecera(titulo = "HISTORIAL")

        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(listaPartidas) { partidaIndividual ->
                TarjetaMesaHistorial(partida = partidaIndividual)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaHistorialPreview() {
    PantallaHistorial()
}