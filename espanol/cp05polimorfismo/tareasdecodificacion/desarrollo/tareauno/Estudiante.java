package espanol.cp05polimorfismo.tareasdecodificacion.desarrollo.tareauno;

public class Estudiante {
    private String nombre;
    private String curso;
    private float arancel;
    private int numeroEstudiante = 1009;
    private static int contador = 0;

    public Estudiante(String nombre, String curso, float arancel) {
        this.nombre = nombre;
        this.curso = curso;
        this.arancel = arancel;
        ++contador;
        numeroEstudiante += contador;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCurso() {
        return curso;
    }

    public float obtenerArancel() {
        return arancel;
    }

    public int obtenerNumeroEstudiante() {
        return numeroEstudiante;
    }

    public int obtenerContador() {
        return contador;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s%nCurso: %s%nArancel: %.2f%nNúmero de estudiante: %d%nCantidad de estudiantes: %d%n",
                nombre, curso,
                arancel, numeroEstudiante, contador);
    }
}

/*
 * public void setName(String nombre) {
 * this.nombre = nombre;
 * }
 * 
 * public void setCourse(String curso) {
 * this.curso = curso;
 * }
 * 
 * public void setTuitionFee(float arancel) {
 * this.arancel = arancel;
 * }
 * 
 * public void setStudentNumber(int numeroEstudiante) {
 * this.numeroEstudiante = numeroEstudiante;
 * }
 * 
 * public void setCounter(int contador) {
 * this.contador = contador;
 * }
 */
