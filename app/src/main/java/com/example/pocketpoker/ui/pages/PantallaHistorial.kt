package com.example.pocketpoker.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pocketpoker.R
import com.example.pocketpoker.ui.components.Cabecera
import com.example.pocketpoker.ui.components.TarjetaMesaHistorial
import com.example.pocketpoker.ui.components.states.CabeceraState
import com.example.pocketpoker.ui.components.states.TarjetaMesaHistorialState
import com.example.pocketpoker.ui.viewmodels.HistorialViewModel

@Composable
fun PantallaHistorial(
    historialViewModel: HistorialViewModel = viewModel(),
    onPartidaClick: (String) -> Unit = {},
    onVolverClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val uiState by historialViewModel.uiState.collectAsState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Cabecera(
            state = CabeceraState(
                titulo = stringResource(R.string.titulo_historial),
                onVolverClick = onVolverClick
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(uiState.partidas) { partidaIndividual ->
                TarjetaMesaHistorial(
                    state = TarjetaMesaHistorialState(
                        numeroMesa = partidaIndividual.numeroMesa,
                        fecha = partidaIndividual.fecha,
                        boteTotal = partidaIndividual.boteTotal,
                        modo = partidaIndividual.modo,
                        ganadorNombre = partidaIndividual.ganadorNombre
                    ),
                    modifier = Modifier.clickable {
                        onPartidaClick(partidaIndividual.id)
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaHistorialPreview() {
    PantallaHistorial()
}