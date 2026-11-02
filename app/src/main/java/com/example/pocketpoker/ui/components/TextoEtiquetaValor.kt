package com.example.pocketpoker.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TextoEtiquetaValor(
    etiqueta: String,
    valor: String,
    colorEtiqueta: Color = Color.LightGray,
    colorValor: Color = Color.White
) {
    Row {
        Text(
            text = etiqueta,
            color = colorEtiqueta,
            fontSize = 13.sp
        )
        Text(
            text = valor,
            color = colorValor,
            fontSize = 13.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun TextoEtiquetaValorPreview() {
    TextoEtiquetaValor(etiqueta = "MODO: ", valor = "Local")
}