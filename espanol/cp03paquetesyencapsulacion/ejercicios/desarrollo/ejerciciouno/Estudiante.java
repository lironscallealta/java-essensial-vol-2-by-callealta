package espanol.cp03paquetesyencapsulacion.ejercicios.desarrollo.ejerciciouno;

/*
 * Se proporciona código parcial de Estudiante con nombre, numeroEstudiante y curso.
 * Completa los métodos de consulta y modificación y el cuerpo del constructor.
 * Implementa mostrarInformacionEstudiante() para mostrar los tres atributos del objeto.
 */
// Código de Estudiante.java.
// Completa el código.
public class Estudiante {
    private String nombre;
    private int numeroEstudiante;
    private String curso;

    // Constructor número 1.
    // No es necesario agregar nada aquí.
    public Estudiante() {
    }

    /*
     * public Estudiante(int sN, String c) {
     * numeroEstudiante = sN;
     * curso = c;
     * }
     */

    // Constructor número 2.
    // Debes proporcionar el cuerpo de este constructor.
    public Estudiante(String nombre, int numeroEstudiante,
            String curso) {
        // Completa el cuerpo de este constructor.
        this.nombre = nombre;
        this.numeroEstudiante = numeroEstudiante;
        this.curso = curso;
    }

    // Agrega aquí los métodos de modificación (metodosDeModificacion).

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerNumeroEstudiante(int numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;

    }

    public void establecerCurso(String curso) {
        this.curso = curso;
    }

    // Agrega aquí los métodos de consulta (metodosDeConsulta).

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroEstudiante(){
        return numeroEstudiante;
    }

    public String obtenerCurso() {
        return curso;
    }

    public void mostrarInformacionEstudiante() {

        // Este método debe mostrar el nombre,
        // el número de estudiante y el curso
        // del objeto Estudiante.

        System.out.println("Nombre: " + this.nombre + " Número de estudiante: "  + this.numeroEstudiante + " curso " + this.curso + " Objeto: " + this );
    }
}