package com.example.pocketpoker.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.pocketpoker.DatosPruebaPartidas
import com.example.pocketpoker.Partida
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

// CAMBIA
// La "caja" con el elemento concreto que se muestra en esta pantalla de detalle.
data class DetallePartidaUiState(
    val partida: Partida = DatosPruebaPartidas.listaPartidas[0]
)

// SIEMPRE
// Todo ViewModel tiene que heredar de ": ViewModel()"
class DetallePartidaViewModel : ViewModel() {

    // SIEMPRE
    // 1. Privado: solo este ViewModel puede cambiar los datos.
    private val _uiState = MutableStateFlow(DetallePartidaUiState())

    // 2. Público: la pantalla solo puede MIRAR los datos, nunca modificarlos directamente.
    val uiState: StateFlow<DetallePartidaUiState> = _uiState.asStateFlow()

    // CAMBIA
    // Busca el elemento por su ID en la lista. Si no lo encuentra, carga el primer "[0]" para no fallar.
    fun cargarPartida(partidaId: String?) {
        val encontrada = DatosPruebaPartidas.listaPartidas.find { it.id == partidaId }
            ?: DatosPruebaPartidas.listaPartidas[0]
        _uiState.value = DetallePartidaUiState(partida = encontrada)
    }
}