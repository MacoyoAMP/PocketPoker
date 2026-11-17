package com.example.pocketpoker.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pocketpoker.R
import com.example.pocketpoker.ui.components.states.TarjetaMesaHistorialState

@Composable
fun TarjetaMesaHistorial(
    state: TarjetaMesaHistorialState,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp, horizontal = 12.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
        ) {
            Text(
                text = stringResource(R.string.label_mesa, state.numeroMesa),
                color = MaterialTheme.colorScheme.primary,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.padding(6.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextoEtiquetaValor(etiqueta = stringResource(R.string.label_dia), valor = state.fecha)
                TextoEtiquetaValor(
                    etiqueta = stringResource(R.string.label_bote),
                    valor = state.boteTotal,
                    colorValor = MaterialTheme.colorScheme.primary
                )
            }
            Spacer(modifier = Modifier.padding(4.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextoEtiquetaValor(etiqueta = stringResource(R.string.label_modo), valor = state.modo)
                TextoEtiquetaValor(
                    etiqueta = stringResource(R.string.label_ganador),
                    valor = state.ganadorNombre,
                    colorEtiqueta = MaterialTheme.colorScheme.secondary
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaMesaHistorialPreview() {
    TarjetaMesaHistorial(
        state = TarjetaMesaHistorialState(
            numeroMesa = "#0001",
            fecha = "28/10/2026",
            boteTotal = "15.000 Fichas",
            modo = "Local",
            ganadorNombre = "Alex"
        )
    )
}