package espanol.cp06otrascaracteristicasdelasclases.tareasdecodificacion.asignacion.tareados;

public class Asignacion {
    /*
     * # Tarea de codificación 2: Clase abstracta e interfaces
     *
     * ## Objetivo y descripción
     *
     * Practica la palabra `abstract` y las interfaces de Java mediante una pequeña aplicación de gestión de contenido (CMS) para artículos, videos y pódcast. Cada tipo de contenido tendrá sus propios atributos y comportamientos.
     *
     * ## 1. Clase abstracta: Contenido
     *
     * Crea una clase abstracta `Contenido` con:
     *
     * - Atributos `titulo: String` y `autor: String`.
     * - Un constructor que inicialice el título y el autor.
     * - Método abstracto `void mostrarInformacion()`: las subclases mostrarán la información del contenido.
     * - Método abstracto `Double calcularTiempoDeLectura()`: las subclases estimarán el tiempo necesario para consumir el contenido.
     * - Método concreto `void publicar()`: mostrará un mensaje indicando que el contenido se publica.
     *
     * ## 2. Interfaces
     *
     * - `Legible`: declara `void leer()` para los contenidos que se puedan leer.
     * - `Visualizable`: declara `void ver()` para los contenidos que se puedan ver.
     *
     * ## 3. Subclases de Contenido
     *
     * ### Articulo
     *
     * - Hereda de `Contenido` e implementa `Legible`.
     * - Agrega `cantidadDePalabras: int`.
     * - Implementa `mostrarInformacion()` para mostrar título, autor y cantidad de palabras.
     * - Implementa `calcularTiempoDeLectura()` con una velocidad promedio de 200 palabras por minuto.
     * - Implementa `leer()` para mostrar un mensaje indicando que el artículo se está leyendo.
     *
     * ### Video
     *
     * - Hereda de `Contenido` e implementa `Visualizable`.
     * - Agrega `duracion: double`, expresada en minutos.
     * - Implementa `mostrarInformacion()` para mostrar título, autor y duración.
     * - Implementa `calcularTiempoDeLectura()` para devolver la duración del video.
     * - Implementa `ver()` para mostrar un mensaje indicando que el video se está viendo.
     *
     * ### Podcast
     *
     * - Hereda de `Contenido` e implementa `Legible` y `Visualizable`.
     * - Agrega `duracion: double` y `transcripcion: boolean`, que indica si existe una transcripción.
     * - Implementa `mostrarInformacion()` para mostrar título, autor, duración y disponibilidad de la transcripción.
     * - Implementa `calcularTiempoDeLectura()` usando la duración si se ve el contenido, o una cantidad de palabras si hay transcripción. Supón una cantidad fija de palabras para la transcripción.
     * - Implementa `leer()` y `ver()` teniendo en cuenta si el pódcast tiene transcripción.
     *
     * ## 4. Método main
     *
     * - Crea instancias de `Articulo`, `Video` y `Podcast`.
     * - Muestra su información con `mostrarInformacion()`.
     * - Demuestra las llamadas a `leer()` o `ver()`, según corresponda.
     * - Publica cada tipo de contenido.
     *
     * ## Salida de ejemplo, traducida
     *
     * ```text
     * Artículo: "Aprende Java de la manera correcta", por Dr. Lawrence Decamora
     * Cantidad de palabras: 1200
     * Tiempo estimado de lectura: 6.0 minutos
     * Leyendo artículo: "Aprende Java de la manera correcta"
     * Publicando contenido: Aprende Java de la manera correcta
     * Video: "Tutorial de Java", por Michelle Decamora
     * Duración: 30.0 minutos
     * Tiempo estimado de visualización: 30.0 minutos
     * Viendo video: "Tutorial de Java"
     * Publicando contenido: Tutorial de Java
     * Pódcast: "Fundamentos de Java", por John Doe
     * Duración: 20.0 minutos
     * Transcripción disponible: true
     * Tiempo estimado de lectura: 5.0 minutos
     * Leyendo pódcast: "Fundamentos de Java"
     * Viendo pódcast: "Fundamentos de Java"
     * Publicando contenido: Fundamentos de Java
     * ```
     *
     * **Detalles del original:** el método abstracto pide `Double` con mayúscula; los atributos de duración usan `double`. No se fija la cantidad de palabras de la transcripción ni se detalla exactamente qué hacen ambos métodos del pódcast cuando no hay transcripción. Se conserva esa información tal como aparece, sin agregar una solución.
     */
}
