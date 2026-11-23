package com.example.pocketpoker.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.pocketpoker.DatosPruebaPartidas
import com.example.pocketpoker.Partida
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class DetallePartidaUiState(
    val partida: Partida = DatosPruebaPartidas.listaPartidas[0]
)

class DetallePartidaViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(DetallePartidaUiState())
    val uiState: StateFlow<DetallePartidaUiState> = _uiState.asStateFlow()

    fun cargarPartida(partidaId: String?) {
        val encontrada = DatosPruebaPartidas.listaPartidas.find { it.id == partidaId }
            ?: DatosPruebaPartidas.listaPartidas[0]
        _uiState.value = DetallePartidaUiState(partida = encontrada)
    }
}