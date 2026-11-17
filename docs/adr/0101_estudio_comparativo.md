# A1.1 · Estudio comparativo de tecnologías

## Tabla comparativa

| Aspectos | Android Nativo | Flutter                                                                                                               | PWA |
| :--- | :--- |:----------------------------------------------------------------------------------------------------------------------| :--- |
| **Lenguaje y herramientas** | Kotlin (o Java) + Android Studio | Dart + VS Code / Android Studio + Flutter SDK                                                                         | HTML5, CSS3, JavaScript / TypeScript + cualquier editor de código |
| **Plataformas soportadas** | Android, Android Wear, Android TV, Android Auto | Android, iOS, Web, Windows, macOS, Linux                                                                              | Cualquier navegador moderno (Android, iOS, Desktop) |
| **Rendimiento y acceso al hardware** | **Máximo/Total.** Acceso directo e inmediato, sensores, Bluetooth, GPU... | **Alto.** Renderizado propio mediante Canvas; compilación a código nativo                                             | **Medio / Bajo / Limitado.** Limitado por el motor del navegador; mayor consumo en procesos complejos |
| **Coste de desarrollo / Mantenimiento** | **Alto.** Si se necesita versión iOS, exige crear otro proyecto en Swift con otro equipo | **Bajo.** Un único código sirve para múltiples plataformas, reduciendo costes y tiempos                               | **Muy Bajo.** Un único desarrollo web emulado como app; sin necesidad de subir a tiendas oficiales |
| **Caso de uso recomendado** | Apps de juegos/recursos en tiempo real como cámara, Bluetooth local, sensores de alta frecuencia | Apps corporativas, tiendas online o redes sociales que necesitan desplegar en Android e iOS rápido con un solo equipo | Catalogación de productos, periódicos digitales o paneles de gestión interna donde no se requiera acceso profundo a hardware |

## Justificación de casos de uso

1. **Android Nativo:** Es la mejor opción para aplicaciones como *Pocket Dealer* (el proyecto que he presentado para este curso), ya que se requiere el rendimiento máximo para la comunicación en red en tiempo real, la gestión de animaciones de cartas y el uso directo de sensores.
2. **Flutter:** Es la mejor opción para una pyme que lanza, por ejemplo, un servicio de entrega a domicilio. Con un presupuesto ajustado y un único equipo de desarrolladores, permite publicar la app simultáneamente en Google Play y App Store compartiendo el 90% de la lógica visual y de negocio.
3. **PWA:** Es la opción ideal para, por ejemplo, un periódico local. Permite a los usuarios consultar el contenido, enviar notificaciones push e instalar un acceso directo sin tener que descargar una app pesada desde la Play Store ni pasar por el proceso de aprobación de las tiendas.