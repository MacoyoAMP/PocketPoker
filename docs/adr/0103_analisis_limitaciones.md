# A1.3 · Análisis de limitaciones de un dispositivo

## 1. Documentación del dispositivo real

* **Modelo:** Xiaomi POCO F6
* **Procesador:** Qualcomm Snapdragon 8s Gen 3 Mobile Platform Octa-core Max 3,0 GHz
* **Memoria RAM:** 12 GB
* **Almacenamiento libre:** 300 GB libres de 512 GB
* **Pantalla:** 6.67" AMOLED, resolución 1220 x 2712 píxeles (1.5K), tasa de refresco de 120 Hz, densidad de píxeles: ~446 ppi (`xxxhdpi`)
* **Versión de Android:** Android 16 (HyperOS 3.0)
* **Sensores disponibles:** Acelerómetro, Giroscopio, Sensor de Luz Ambiental, Sensor de Proximidad, Brújula digital (Magnetómetro), Emisor IR (Infrarrojos), Lector de huellas bajo pantalla (óptico).
* **Estado de la batería y consumo:** 5000 mAh (carga rápida 90W). Consumo según ajustes: Pantalla (38%), Servicios del Sistema/Android (16%), Aplicaciones en segundo plano (22%).

---

## 2. Conclusiones de diseño para mi futura aplicación

### 1. Rendimiento y fluidez (12 GB de RAM / Pantalla a 120 Hz)
* **Dato del móvil:** Mi teléfono tiene 12 GB de RAM y la pantalla funciona a 120 Hz.
* **Conclusión para mi app:** Aunque en mi móvil todo vaya súper fluido por tener tanta RAM, no puedo confiarme. Para que la app no dé tirones al repartir cartas o mover fichas en móviles más normales, tengo que aprender a no recargar el hilo principal con tareas pesadas de red o cálculos sobre el juego, pasando esas operaciones a hilos secundarios.

### 2. Diseño de la interfaz y densidad de pantalla (446 ppi / xxxhdpi)
* **Dato del móvil:** La pantalla tiene mucha resolución (1220 x 2712) y una densidad de píxeles muy alta (`xxxhdpi`).
* **Conclusión para mi app:** Si uso imágenes normales adaptadas a esta resolución, para las cartas o el tapete, la app va a pesar muchísimo y consumirá demasiada memoria al cargarlas. Por eso, me convendría usar archivos de tipo vector (SVG), porque se adaptan solos a cualquier tamaño de pantalla sin perder nitidez y pesan mucho menos.

### 3. Consumo de batería y pantalla (38% de consumo en pantalla AMOLED)
* **Dato del móvil:** En los ajustes de batería he visto que la pantalla es lo que más consume con diferencia (un 38% del total).
* **Conclusión para mi app:** En una partida de póker la pantalla va a estar encendida todo el tiempo. Como mi móvil tiene pantalla AMOLED, si diseño la app con un modo oscuro, los píxeles negros se apagarán y el consumo de batería bajará bastante durante las partidas.