package com.example.pocketpoker.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.pocketpoker.DatosPruebaPartidas
import com.example.pocketpoker.Partida
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class HistorialUiState(
    val partidas: List<Partida> = emptyList()
)

class HistorialViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(
        HistorialUiState(partidas = DatosPruebaPartidas.listaPartidas)
    )
    val uiState: StateFlow<HistorialUiState> = _uiState.asStateFlow()
}