package espanol.cp03paquetesyencapsulacion.ejercicios.enunciados.ejerciciouno;

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

        // Asigna las propiedades del estudiante estudiante3:
        // nombre, numeroEstudiante y curso.

        // Muestra la información del estudiante estudiante1.
        estudiante1.mostrarInformacionEstudiante();

        // Muestra la información del estudiante estudiante2
        // llamando a los métodos de consulta.

        // Muestra la información del estudiante estudiante3
        // llamando a mostrarInformacionEstudiante().
    }
}