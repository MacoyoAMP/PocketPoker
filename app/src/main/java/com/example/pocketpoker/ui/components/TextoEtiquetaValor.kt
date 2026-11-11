package com.example.pocketpoker.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextoEtiquetaValor(
    etiqueta: String,
    valor: String,
    colorEtiqueta: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    colorValor: Color = MaterialTheme.colorScheme.onSurface
) {
    Row {
        Text(
            text = etiqueta,
            color = colorEtiqueta,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(2.dp))
        Text(
            text = valor,
            color = colorValor,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun TextoEtiquetaValorPreview() {
    TextoEtiquetaValor(etiqueta = "MODO: ", valor = "Local")
}