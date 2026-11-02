package com.example.pocketpoker

object DatosPruebaPartidas {
    val listaPartidas: List<Partida> = listOf(
        Partida(
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
        ),
        Partida(
            id = "2",
            numeroMesa = "#0002",
            fecha = "27/10/2026",
            duracion = "3h 10m",
            modo = "Multi",
            boteTotal = "32.500 Fichas",
            ganadorNombre = "Millán",
            totalManos = 64,
            mayorBoteGanado = "9.800 (Millán)",
            ciegasFinales = "250 / 500",
            jugadores = listOf(
                JugadorPartida(1, "Millán", esGanador = true, fichasGanadasPerdidas = 14200),
                JugadorPartida(2, "Alex", esGanador = false, fichasGanadasPerdidas = -4200),
                JugadorPartida(3, "Dani", esGanador = false, fichasGanadasPerdidas = -4000),
                JugadorPartida(4, "Andrés", esGanador = false, fichasGanadasPerdidas = -6000)
            )
        ),
        Partida(
            id = "3",
            numeroMesa = "#0003",
            fecha = "25/10/2026",
            duracion = "1h 30m",
            modo = "Local",
            boteTotal = "8.000 Fichas",
            ganadorNombre = "Quique",
            totalManos = 32,
            mayorBoteGanado = "2.100 (Quique)",
            ciegasFinales = "50 / 100",
            jugadores = listOf(
                JugadorPartida(1, "Quique", esGanador = true, fichasGanadasPerdidas = 4800),
                JugadorPartida(2, "Alex", esGanador = false, fichasGanadasPerdidas = -1800),
                JugadorPartida(3, "Andrés", esGanador = false, fichasGanadasPerdidas = -3000)
            )
        ),
        Partida(
            id = "4",
            numeroMesa = "#0004",
            fecha = "22/10/2026",
            duracion = "2h 45m",
            modo = "Multi",
            boteTotal = "21.000 Fichas",
            ganadorNombre = "Pirulo",
            totalManos = 55,
            mayorBoteGanado = "6.500 (Pirulo)",
            ciegasFinales = "150 / 300",
            jugadores = listOf(
                JugadorPartida(1, "Pirulo", esGanador = true, fichasGanadasPerdidas = 11000),
                JugadorPartida(2, "Alex", esGanador = false, fichasGanadasPerdidas = -1000),
                JugadorPartida(3, "Cris", esGanador = false, fichasGanadasPerdidas = -4000),
                JugadorPartida(4, "Andrés", esGanador = false, fichasGanadasPerdidas = -6000)
            )
        ),
        Partida(
            id = "5",
            numeroMesa = "#0005",
            fecha = "18/10/2026",
            duracion = "0h 50m",
            modo = "Local",
            boteTotal = "5.000 Fichas",
            ganadorNombre = "Alex",
            totalManos = 18,
            mayorBoteGanado = "1.900 (Alex)",
            ciegasFinales = "25 / 50",
            jugadores = listOf(
                JugadorPartida(1, "Alex", esGanador = true, fichasGanadasPerdidas = 3500),
                JugadorPartida(2, "Millán", esGanador = false, fichasGanadasPerdidas = -3500)
            )
        )
    )
}