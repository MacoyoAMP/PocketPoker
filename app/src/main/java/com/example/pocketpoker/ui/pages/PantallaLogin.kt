package com.example.pocketpoker.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pocketpoker.R
import com.example.pocketpoker.ui.components.AvatarJugador
import com.example.pocketpoker.ui.components.states.AvatarJugadorState
import com.example.pocketpoker.ui.viewmodels.LoginViewModel

@Composable
fun PantallaLogin(
    // SIEMPRE
    // Engancha el ViewModel del formulario
    loginViewModel: LoginViewModel = viewModel(),
    onLoginSuccess: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    // SIEMPRE
    // Lee el estado actual (textos escritos y si hay error)
    val uiState by loginViewModel.uiState.collectAsState()

    // SIEMPRE
    // si se usa OutlinedTextField con tema oscuro:
    // Colores para que se vea bien el texto y el borde
    val coloresCampo = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = MaterialTheme.colorScheme.primary,
        unfocusedBorderColor = MaterialTheme.colorScheme.onSurfaceVariant,
        focusedLabelColor = MaterialTheme.colorScheme.primary,
        unfocusedLabelColor = MaterialTheme.colorScheme.onSurfaceVariant,
        focusedTextColor = MaterialTheme.colorScheme.onSurface,
        unfocusedTextColor = MaterialTheme.colorScheme.onSurface
    )

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AvatarJugador(
            state = AvatarJugadorState(
                nombreJugador = stringResource(R.string.titulo_login),
                tamano = 90.dp
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(R.string.titulo_login),
            color = MaterialTheme.colorScheme.primary,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(32.dp))

        // SIEMPRE (en cajas de texto):
        // "value" lee del uiState y "onValueChange" avisa al ViewModel de cada letra que se escribe.
        OutlinedTextField(
            value = uiState.usuario,
            onValueChange = { loginViewModel.onUsuarioChange(it) },
            label = { Text(stringResource(R.string.label_usuario)) },
            singleLine = true,
            colors = coloresCampo,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // "PasswordVisualTransformation()" oculta las letras con puntitos
        OutlinedTextField(
            value = uiState.contrasena,
            onValueChange = { loginViewModel.onContrasenaChange(it) },
            label = { Text(stringResource(R.string.label_contrasena)) },
            singleLine = true,
            visualTransformation = PasswordVisualTransformation(),
            colors = coloresCampo,
            modifier = Modifier.fillMaxWidth()
        )

        // SIEMPRE (para mensajes de error): Solo se pinta si el ViewModel pone mostrarError = true
        if (uiState.mostrarError) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(R.string.error_login_vacio),
                color = MaterialTheme.colorScheme.error,
                fontSize = 14.sp
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // SIEMPRE: El botón delega la comprobación al ViewModel
        Button(
            onClick = { loginViewModel.intentarLogin(onSuccess = onLoginSuccess) },
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.background
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(
                text = stringResource(R.string.btn_entrar),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaLoginPreview() {
    PantallaLogin()
}