package espanol.cp05otrascaracteristicasdelasclases.tareasdecodificacion.asignacion.tareauno;

public class Asignacion {
    /*
     * # Tarea de codificación 1: Figuras
     *
     * ## Descripción
     *
     * Crea un programa que reciba números mediante los argumentos de la línea de comandos. Todos deben ser enteros mayores que cero. Determina la figura según la cantidad de argumentos:
     *
     * - Un argumento: un círculo.
     * - Dos argumentos: un cuadrado o un rectángulo.
     * - Tres argumentos: un triángulo.
     *
     * Muestra el tipo de figura, sus detalles, el perímetro y el área. Sigue el diagrama UML adjunto. En un rectángulo, el largo debe ser mayor que el ancho.
     *
     * ## Requisitos del UML, traducidos
     *
     * La interfaz `Figura` corresponde a `Shape` en el diagrama. La implementan `Circulo`, `Triangulo`, `Rectangulo` y `Cuadrado`.
     *
     * - `Figura`: métodos públicos `obtenerPerimetro(): double`, `obtenerArea(): double` y `mostrarDetalles(): void`.
     * - `Circulo`: atributos privados `PI: float (3.14)` y `radio: int`; los tres métodos públicos anteriores.
     * - `Triangulo`: atributos privados `lado1: int`, `lado2: int` y `lado3: int`; los tres métodos públicos anteriores.
     * - `Rectangulo`: atributos privados `largo: int` y `ancho: int`; los tres métodos públicos anteriores.
     * - `Cuadrado`: atributo privado `lado: int`; los tres métodos públicos anteriores.
     *
     * Crea los archivos correspondientes a esas figuras y una clase de prueba `PruebaFiguras.java` con `main`, que reciba los valores por argumentos de la línea de comandos.
     *
     * **Nota del original:** el diagrama llama `Shape` a la interfaz, pero la lista de archivos pide `Shapes.java`. Esa diferencia ya existe en las capturas. En esta versión se utiliza el nombre español `Figura` para referirse a la interfaz.
     *
     * ## Ejemplos de ejecución, traducidos
     *
     * Son resultados esperados del enunciado, no una implementación. Los comandos siguen el formato del libro; al ejecutarlos dentro del repositorio tendrás que usar el paquete correspondiente.
     *
     * ```text
     * java PruebaFiguras 15
     * Tipo: Círculo
     * Radio: 15
     * Perímetro: 94.2
     * Área: 706.5
     *
     * java PruebaFiguras 12 24
     * Tipo: Rectángulo
     * Largo: 24
     * Ancho: 12
     * Perímetro: 72.0
     * Área: 288.0
     *
     * java PruebaFiguras 24 12
     * Tipo: Rectángulo
     * Largo: 24
     * Ancho: 12
     * Perímetro: 72.0
     * Área: 288.0
     *
     * java PruebaFiguras 12 12
     * Tipo: Cuadrado
     * Lado: 12
     * Perímetro: 48.0
     * Área: 144.0
     *
     * java PruebaFiguras 9 15 12
     * Tipo: Triángulo
     * Lado1: 9
     * Lado2: 15
     * Lado3: 12
     * Perímetro: 36.0
     * Área: 54.0
     *
     * java PruebaFiguras 9 15 12 8
     * Entrada inválida
     * ```
     *
     * Para calcular el área del triángulo, el enunciado pide utilizar la [fórmula de Herón](https://www.mathsisfun.com/geometry/herons-formula.html).
     */
}
