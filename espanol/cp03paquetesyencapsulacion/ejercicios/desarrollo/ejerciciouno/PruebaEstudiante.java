package espanol.cp03paquetesyencapsulacion.ejercicios.desarrollo.ejerciciouno;

// Código de PruebaEstudiante.java.
// Completa el código.
public class PruebaEstudiante {
    public static void main(String argumentos[]) {

        Estudiante estudiante1 = new Estudiante("Lawrence", 1111,
                "Licenciatura en Ciencias de la Computación");
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();

        // Asigna las propiedades del estudiante estudiante2:
        // nombre, numeroEstudiante y curso.
        estudiante2.establecerNombre("Nombre cualquiera");
        estudiante2.establecerNumeroEstudiante(1545);
        estudiante2.establecerCurso("B3 Informática");

        // Asigna las propiedades del estudiante estudiante3:
        // nombre, numeroEstudiante y curso.
        estudiante3.establecerNombre("Peditus");
        estudiante3.establecerNumeroEstudiante(4545);
        estudiante3.establecerCurso("Deportes");

        // Muestra la información del estudiante estudiante1.
        System.out.println("ID: " + estudiante1.obtenerNumeroEstudiante());
        estudiante1.mostrarInformacionEstudiante();

        // Muestra la información del estudiante estudiante2
        // llamando a los métodos de consulta.
        System.out.println(
                "nombre " + estudiante2.obtenerNombre() + " identificador del estudiante: " + estudiante2.obtenerNumeroEstudiante() + " Curso: " + estudiante2.obtenerCurso() + " Objeto " + estudiante2);

        // Muestra la información del estudiante estudiante3
        // llamando a mostrarInformacionEstudiante().
        estudiante3.mostrarInformacionEstudiante();
    }
}