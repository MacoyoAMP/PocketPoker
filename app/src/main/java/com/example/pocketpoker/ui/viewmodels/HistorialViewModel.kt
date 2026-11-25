package com.example.pocketpoker.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.pocketpoker.DatosPruebaPartidas
import com.example.pocketpoker.Partida
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

// CAMBIA
// La "caja" con la lista de elementos que pinta esta pantalla.
data class HistorialUiState(
    val partidas: List<Partida> = DatosPruebaPartidas.listaPartidas
)

// SIEMPRE
// Todo ViewModel tiene que heredar de ": ViewModel()"
class HistorialViewModel : ViewModel() {

    // SIEMPRE
    // 1. Privado: cargamos aquí la lista inicial desde nuestros datos de prueba.
    private val _uiState = MutableStateFlow(HistorialUiState())

    // 2. Público: la pantalla solo puede MIRAR la lista, nunca modificarla directamente.
    val uiState: StateFlow<HistorialUiState> = _uiState.asStateFlow()
}