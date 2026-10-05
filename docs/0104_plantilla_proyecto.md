# Plantilla: propuesta del Proyecto A



## 0 · Datos

|||
|-|-|
|**Nombre de la app**|PocketPoker|
|**Autor/a**|Alejandro Millán Polvorosa|
|**Fecha**|19/09/2026|



## 1 · La idea en una frase

> Qué hace tu app y para quién, en una sola frase.

Una app que permite la gestión y creación de partidas, para en un futuro poder jugar al póker sin baraja ni fichas físicas,
en cualquier lugar y está dirigido a cualquier publico.



## 2 · El problema

> ¿Qué problema resuelve? 

Permite improvisar, gestionar y crear una partida de póker en cualquier lugar, para en un futuro reimplementar su jugabilidad.



> ¿Cómo se resuelve hoy sin tu app?

Llevando maletines de póker (pesados e incómodos de transportar), anotando fichas de cada jugador,
o jugando en aplicaciones de póker online genéricas (incluidas casas de apuestas, evitándolas)
donde cada jugador está aislado en su pantalla sin la experiencia de jugar en grupo cara a cara.
Es decir requiere una gestión manual.



## 3 · Personas usuarias

> ¿Quién la va a usar? 

Alex, 21 años, estudiante de ciclo superior. Le gusta quedar los fines de semana con sus amigos en casa de alguno de ellos.
Maneja el móvil con total soltura. Abriría la app al inicio de la partida y la mantendría activa en sesiones cortas e intensas de pocos segundos en cada turno de juego,
pudiendo mantenerla en segundo plano. Una pantalla principal, de tipo table o Android tv (o similar) sería el centro de la mesa.
Si la app falla puntualmente no sería un drama, ya que podría reconectarse a la partida, recuperando su progreso.


## 4 · Funcionalidades

### Imprescindibles (sin esto la app no tiene sentido)

|#|Funcionalidad|
|-|-|
|F1|Creación de la mesa general, con su propia configuración para cada partida.
|F2|Unirse a una partida ya creada, accediendo con un jugador ya creado o permitiendo crear uno nuevo.
|F3|Zona de historial/estadísticas, en la que poder consultar partidas pasadas o datos propios de cada jugador.

### Opcionales (si sobra tiempo)

| #  |Funcionalidad|
|----|-|
| O1 |Personalizar el tapete visual de la mesa y el reverso de la baraja.|



## 5 · Pantallas

| Pantalla                       | Para qué sirve                                                                                                         |Se llega desde|
|--------------------------------|------------------------------------------------------------------------------------------------------------------------|-|
| Inicio                         | Diferentes botones para el acceso a: Creación y Configuración de la mesa, Unirse a una partida, Historial/Estadísticas |(arranque)|
| Configuración Mesa             | Configuración de la mesa de juego y botón para iniciar su creación.                                                    |Inicio|
| Unión a partida/Config.Jugador | Zona de elección de jugador ya creado o creación de un nuevo jugador.                                                  |Inicio|
| Historial / Estadísticas       | Consultar el registro de partidas pasadas y los balances de propio de cada jugador                                     |Inicio|



## 6 · Bocetos

![Boceto_Proyecto.jpg](res/Boceto_Proyecto.jpg)

## 7 · Qué datos guarda la app

|Tipo de dato|Campos|Ejemplo|
|-|-|-|
|Jugador|ID, nombre, foto de perfil, fichas totales...|1, "Carlos", "carlos.jpg", 1500...|
|Partida|ID, fecha, bote final, id ganador...|102, "12/10/2026", 4500, 1...|



## 8 · Encaje con los requisitos del módulo

> Apartado obligatorio: ninguna casilla puede quedar vacía.

| Requisito                | Dónde encaja en tu app                                                                                                                                                                                                                                             |Tema|
|--------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-|
| **Persistencia de datos** — la información sobrevive al cerrar la app | Guardado local de los datos del perfil de usuario, ajustes de partidas e historial de estadísticas...                                                                                                                                                              |4|
| **Servicio web** — la app consulta datos por internet| Consulta/sincronización remota para validar la existencia de partidas creadas en red o descargar avatares/datos de jugadores globales.                                                                                        |5|
| **Sensor o localización**| Uso del acelerómetro/giroscopio para detectar gestos físicos (por ejemplo, agitar el dispositivo para reiniciar el formulario de configuración...) o geolocalización GPS para sugerir el nombre de la mesa según la ubicación actual (ej. "Partida en Pontevedra"). |6|
| **Contenido multimedia** — foto, audio, vídeo o animación | Captura y almacenamiento de la foto de perfil del jugador usando la cámara/galería del dispositivo, efectos de sonido para los botones de acción e inclusión de animaciones en la interfaz.                                                                        |7|



## 9 · Riesgos

|Lo que me preocupa|Plan B|
|-|-|
|Que la gestión de imágenes de perfil (fotos tomadas con la cámara) ralentice las listas de jugadores o consuma demasiada memoria.|Utilizar una librería eficiente de carga de imágenes o limitar la personalización a avatares vectoriales predefinidos de la app si hay problemas de rendimiento.



## Antes de entregar

* \[X] La idea cabe en una frase.
* \[X] El público es una persona concreta, no «todo el mundo».
* \[X] Hay **3 o 4** funcionalidades imprescindibles, no diez.54
* \[X] Cada funcionalidad imprescindible tiene su pantalla.
* \[X] Hay bocetos de las pantallas principales.
* \[X] **Las cuatro casillas del apartado 8 están rellenas.**
* \[X] Está identificado al menos un riesgo con su plan B.

