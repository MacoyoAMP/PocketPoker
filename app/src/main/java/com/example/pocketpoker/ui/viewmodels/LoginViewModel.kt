package com.example.pocketpoker.ui.viewmodels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class LoginUiState(
    val usuario: String = "",
    val contrasena: String = "",
    val mostrarError: Boolean = false
)

class LoginViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    fun onUsuarioChange(nuevoUsuario: String) {
        _uiState.update { it.copy(usuario = nuevoUsuario, mostrarError = false) }
    }

    fun onContrasenaChange(nuevaContrasena: String) {
        _uiState.update { it.copy(contrasena = nuevaContrasena, mostrarError = false) }
    }

    fun intentarLogin(onSuccess: () -> Unit) {
        val actual = _uiState.value
        if (actual.usuario.isNotBlank() && actual.contrasena.isNotBlank()) {
            onSuccess()
        } else {
            _uiState.update { it.copy(mostrarError = true) }
        }
    }
}