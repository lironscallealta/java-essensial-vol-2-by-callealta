package espanol.cp01fundamentos;
import java.util.Scanner;


/** Ejemplo general del capítulo 1: consola, tipos, arreglos y primeros objetos.
 * Ejecuta main y responde las preguntas de nombre y edad. Usa Estudiante.java.
 */
public class Principal {

    // Capítulo 1

    public static void main(String[] argumentos) {

        // 1. Imprimir en consola
        System.out.println("Ejemplo de impresión");

        // 2 if
        int edad = 18;
        if (edad == 18)
            System.out.println("Tienes la misma edad");
        else if (edad > 18)
            System.out.println("Eres mayor");
        else
            System.out.println("Eres menor");

        // 3. Scanner con String
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = entrada.nextLine();
        System.err.println("hola" + " " + nombre);

        // 4. Scanner con números
        Scanner segundaEntrada = new Scanner(System.in);
        System.out.println("¿Cuántos años tienes?");
        edad = segundaEntrada.nextInt();
        System.out.println("Tu edad es " + edad);

        // Tipos de datos primitivos

        int otraEdad = 16;
        double promedio = 3.75;
        char nota = 'A';
        boolean estaMatriculado = true;

        String otroNombre = "Michelle";
        System.out.println("Tu nombre " + otroNombre + " tiene " +
                otroNombre.length() + " letras.");
        System.out.println(nombre.toUpperCase());

        // Arreglos
        int[] puntuaciones = { 10, 20, 30, 40 };
        System.out.println("Tu primera puntuación: " + puntuaciones[0] + " y la última fue: " + puntuaciones[3]);

        // Ejemplos de arreglos
        String[] nombresEstudiantes = { "Matthew", "Mark", "Luke" };
        int[] edadesEstudiantes = { 17, 16, 18 };
        double[] notasEstudiantes = { 89.5, 92.0, 85.75 };

        // Clases y objetos: usa Estudiante.java de este mismo capítulo.

        Estudiante estudiante = new Estudiante("nombre", 15, 4.4);
        estudiante.imprimirDetalles();   
        
        // Constructor sin argumentos y asignación de atributos.
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Richar";
        estudiante1.edad = 15;
        estudiante1.nota = 5.6;
        System.err.println("Hash del estudiante: " + estudiante1);
        estudiante1.imprimirDetalles();

    }

}