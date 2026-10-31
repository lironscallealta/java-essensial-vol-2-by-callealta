package espanol.cp05polimorfismo.tareasdecodificacion.asignacion.tareauno;

public class Asignacion {
    /*
     * Tarea de codificación 1: Beca estudiantil
     *
     * La universidad te encarga crear una aplicación para administrar los
     * registros de estudiantes, sus becas y la información de sus aranceles.
     * Crea una jerarquía con Estudiante, que representa a quien paga el arancel
     * completo, y EstudianteBecadoParcial, una subclase con descuento. El porcentaje
     * de la beca puede variar y lo financia una entidad patrocinadora.
     *
     * Según el UML, crea las clases, atributos, constructores y métodos.
     *
     * Estudiante
     * - nombre: String
     * - curso: String
     * - arancel: float
     * - numeroEstudiante: int
     * - contador: int [estático]
     * + Estudiante(String nombre, String curso, float arancel)
     * // métodos de acceso
     * // toString()
     *
     * EstudianteBecadoParcial extiende Estudiante
     * - tasaDescuento: float
     * - montoPorPagar: float
     * + EstudianteBecadoParcial(String nombre, String curso, float arancel, float tasaDescuento)
     * // métodos de acceso
     * // toString()
     *
     * El constructor de Estudiante recibe el nombre, el curso y el arancel. Crea
     * un contador estático y un numeroEstudiante no estático. Úsalos para calcular
     * el número de cada estudiante creado y mostrarlo en toString().
     *
     * El constructor de EstudianteBecadoParcial recibe nombre, curso, arancel y
     * tasaDescuento. Reutiliza el constructor de Estudiante con los tres primeros
     * valores. Calcula montoPorPagar restando del arancel el producto del arancel
     * por tasaDescuento. Sobrescribe toString() en ambas clases.
     *
     * La prueba debe mostrar los datos de cuatro estudiantes y calcular el monto
     * total por cobrar, aplicando el descuento de cada estudiante becado.
     *
     * Salida de referencia del libro:
     * Estudiante n.º 1: Mathew cursa BSCS; arancel: 10000.0
     * Estudiante n.º 2: Mark cursa BSIT; arancel: 12000.0
     * Estudiante n.º 3: Luke cursa BSIT; arancel: 12000.0; descuento: 25%
     * Arancel neto por pagar: 9000.0
     * Estudiante n.º 4: John cursa BSIT; arancel: 11000.0; descuento: 50%
     * Arancel neto por pagar: 5500.0
     *
     * Monto total por cobrar: 36500.0
     */
}
