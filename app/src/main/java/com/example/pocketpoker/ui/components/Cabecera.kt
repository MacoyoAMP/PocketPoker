package com.example.pocketpoker.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Cabecera(
    titulo: String,
    modifier: Modifier = Modifier
){
    Row(modifier = modifier
        .fillMaxWidth()
        .background(MaterialTheme.colorScheme.background)
        .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically){
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = "Volver",
            tint = MaterialTheme.colorScheme.onSurface
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Text(
            text = titulo,
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun CabeceraPreview(){
    Cabecera(titulo = "HISTORIAL")
}