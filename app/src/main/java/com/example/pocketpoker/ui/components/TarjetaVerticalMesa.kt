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
import com.example.pocketpoker.JugadorPartida
import com.example.pocketpoker.Partida

@Composable
fun TarjetaVerticalMesa(
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
            Text(text = "MESA ${partida.numeroMesa}",
                color = Color(0xFFf0bc50),
                fontSize = 18.sp,
                fontWeight= FontWeight.Bold )
            Spacer(modifier = Modifier.padding(6.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                TextoEtiquetaValor(etiqueta = "DÍA ", valor = partida.fecha)
                TextoEtiquetaValor(etiqueta = "DURACIÓN ", valor = partida.duracion)
            }
            Spacer(modifier = Modifier.padding(4.dp))
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween) {
                TextoEtiquetaValor(etiqueta = "MODO: ", valor = partida.modo)
                TextoEtiquetaValor(etiqueta = "TOTAL MANOS: ", valor = partida.totalManos.toString())
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaVerticalMesaPreview() {
    TarjetaVerticalMesa(
        partida = Partida(
            id = "1",
            numeroMesa = "#0001",
            fecha = "28/10/2026",
            duracion = "2h 15m",
            modo = "Local",
            boteTotal = "15.000 Fichas",
            ganadorNombre = "Alex",
            totalManos = 48,
            mayorBoteGanado = "4.200 (Alex)",
            ciegasFinales = "100 / 200",
            jugadores = listOf(
                JugadorPartida(1, "Alex", esGanador = true, fichasGanadasPerdidas = 8500),
                JugadorPartida(2, "Cris", esGanador = false, fichasGanadasPerdidas = -3000),
                JugadorPartida(3, "Andrés", esGanador = false, fichasGanadasPerdidas = -5500)
            )
        )
    )
}
