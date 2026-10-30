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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pocketpoker.Partida

@Composable
fun TarjetaVertical(
    partida: Partida,
    modifier: Modifier= Modifier
){
    Card(modifier = modifier
        .fillMaxWidth()
        .padding(vertical = 6.dp, horizontal = 12.dp),
        shape= RoundedCornerShape(10.dp),
        colors= CardDefaults.cardColors(containerColor = Color(0xFF132235)),
        border = BorderStroke(1.dp, Color(0xFFf0bc50))
    ){
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(14.dp)) {
            Text(text = "MESA ${partida.idMesa}",
                color = Color(0xFFf0bc50),
                fontSize = 18.sp,
                fontWeight= FontWeight.Bold )
            Spacer(modifier = Modifier.padding(6.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = "DÍA: ${partida.fecha}",
                    color = Color.LightGray,
                    fontSize = 13.sp
                )
                Text(
                    text = "BOTE: ${partida.boteFichas}",
                    color = Color(0xFFF0BC50),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.padding(4.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = "MODO: ${partida.modo}",
                    color = Color.LightGray,
                    fontSize = 13.sp
                )
                Text(
                    text = "GANADOR: ${partida.ganador}",
                    color = Color(0xFF3a995d),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaVerticalPreview() {
    TarjetaVertical(
        partida = Partida(
            idMesa = "#9999",
            fecha = "28/10/2026",
            modo = "Local",
            boteFichas = "15.000 Fichas",
            ganador = "Alex"
        )
    )
}
