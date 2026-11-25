package com.example.pocketpoker.ui.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

// CAMBIA
// La "caja" con los datos que necesita pintar esta pantalla.
data class LoginUiState(
    val usuario: String = "",
    val contrasena: String = "",
    val mostrarError: Boolean = false
)

// SIEMPRE
// Todo ViewModel tiene que heredar de ": ViewModel()"
class LoginViewModel : ViewModel() {

    // SIEMPRE
    // 1. Privado: solo este ViewModel puede cambiar los datos.
    private val _uiState = MutableStateFlow(LoginUiState())

    // 2. Público: la pantalla solo puede MIRAR los datos, nunca modificarlos directamente.
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    // CAMBIA
    // Funciones que llama la pantalla cuando el usuario escribe o toca algo.
    // ".update { it.copy(...) }" crea una caja nueva cambiando solo lo que le digas.
    fun onUsuarioChange(nuevoUsuario: String) {
        _uiState.update { it.copy(usuario = nuevoUsuario, mostrarError = false) }
    }

    fun onContrasenaChange(nuevaContrasena: String) {
        _uiState.update { it.copy(contrasena = nuevaContrasena, mostrarError = false) }
    }

    // CAMBIA
    // Lógica al pulsar el botón principal.
    // "_uiState.value" sirve para leer cómo están los datos en este preciso instante.
    fun intentarLogin(onSuccess: () -> Unit) {
        val actual = _uiState.value
        if (actual.usuario.isNotBlank() && actual.contrasena.isNotBlank()) {
            onSuccess() // Si todo está bien, avisamos para navegar a la siguiente pantalla
        } else {
            _uiState.update { it.copy(mostrarError = true) } // Si falla, activamos el error
        }
    }
}