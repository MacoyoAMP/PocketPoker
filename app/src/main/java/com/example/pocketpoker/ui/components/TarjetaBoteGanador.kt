package com.example.pocketpoker.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
fun TarjetaBoteGanador(
    partida: Partida,
    modifier: Modifier = Modifier
){
    Column (modifier = modifier){
        Row(modifier = Modifier) {
            CabeceraResumen(titulo = "BOTE Y GANADOR", color = Color(0xFFf0bc50), modifier = Modifier)
        }
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 2.dp, bottom = 6.dp, start = 12.dp, end = 12.dp),
            shape= RoundedCornerShape(10.dp),
            colors= CardDefaults.cardColors(containerColor = Color(0xFF132235)),
            border = BorderStroke(1.dp, Color(0xFFf0bc50))) {
            Column(modifier = Modifier) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(text = "BOTE TOTAL", color = Color.Gray, fontSize = 15.sp,fontWeight = FontWeight.Bold)
                    Text(text = "GANADOR", color = Color(0xFF5de077), fontSize = 15.sp,fontWeight = FontWeight.Bold)
                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 6.dp)) {
                    Text(text = partida.boteTotal,
                        color = Color(0xFFf0bc50),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp)
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Foto de perfil",
                        tint = Color.White
                    )
                    Text(text = partida.ganadorNombre,
                        color = Color(0xFF5de077),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaBoteGanadorPreview(){
    TarjetaBoteGanador(partida = Partida(
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
        ))
    )
}