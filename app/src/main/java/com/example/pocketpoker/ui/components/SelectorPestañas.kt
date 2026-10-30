package com.example.pocketpoker.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SelectorPestañas(
    pestanaSeleccionada: Int,
    onPestanaSeleccionadaChange: (Int) -> Unit,
    modifier: Modifier = Modifier
){
    Card(modifier = modifier
        .fillMaxWidth()
        .padding(vertical = 6.dp, horizontal = 12.dp),
        shape= RoundedCornerShape(20.dp),
        colors= CardDefaults.cardColors(containerColor = Color(0xFF132235)),
        border = BorderStroke(1.dp, Color.Gray)
    ){
        TabRow(
            selectedTabIndex = pestanaSeleccionada,
            containerColor = Color(0xFF132235),
            indicator = {},
            divider = {}
        ) {
            Tab(
                selected = pestanaSeleccionada == 0,
                onClick = { onPestanaSeleccionadaChange(0) },
                modifier = Modifier.background(
                    if (pestanaSeleccionada == 0) Color(0xFF9b6301) else Color.Transparent,
                    shape = RoundedCornerShape(20.dp)
                ),
                text = {
                    Text(
                        text = "PARTIDAS JUGADAS",
                        color = if (pestanaSeleccionada == 0) Color.White else Color.Gray,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            )

            Tab(
                selected = pestanaSeleccionada == 1,
                onClick = { onPestanaSeleccionadaChange(1) },
                modifier = Modifier.background(
                    if (pestanaSeleccionada == 1) Color(0xFF9b6301) else Color.Transparent,
                    shape = RoundedCornerShape(20.dp)
                ),
                text = {
                    Text(
                        text = "JUGADORES STATS",
                        color = if (pestanaSeleccionada == 1) Color.White else Color.Gray,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            )
        }
    }
}

@Preview
@Composable
fun SelectorPestañasPreview(){
    SelectorPestañas(
        pestanaSeleccionada = 0,
        onPestanaSeleccionadaChange = {}
    )
}