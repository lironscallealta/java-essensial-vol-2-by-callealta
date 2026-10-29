package espanol.chapterone;
import java.util.Scanner;


/** Ejemplo general del capítulo 1: consola, tipos, arreglos y primeros objetos.
 * Ejecuta main y responde las preguntas de nombre y edad. Usa Student.java.
 */
public class Main {

    // Capítulo 1

    public static void main(String[] args) {

        // 1. Imprimir en consola
        System.out.println("Ejemplo de impresión");

        // 2 if
        int age = 18;
        if (age == 18)
            System.out.println("Tienes la misma edad");
        else if (age > 18)
            System.out.println("Eres mayor");
        else
            System.out.println("Eres menor");

        // 3. Scanner con String
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String name = input.nextLine();
        System.err.println("hola" + " " + name);

        // 4. Scanner con números
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("¿Cuántos años tienes?");
        age = inputTwo.nextInt();
        System.out.println("Tu edad es " + age);

        // Tipos de datos primitivos

        int ageAgain = 16;
        double gpa = 3.75;
        char grade = 'A';
        boolean isEnrolled = true;

        String nameAgain = "Michelle";
        System.out.println("Tu nombre " + nameAgain + " tiene " +
                nameAgain.length() + " letras.");
        System.out.println(name.toUpperCase());

        // Arreglos
        int[] scores = { 10, 20, 30, 40 };
        System.out.println("Tu primera puntuación: " + scores[0] + " y la última fue: " + scores[3]);

        // Ejemplos de arreglos
        String[] studentNames = { "Matthew", "Mark", "Luke" };
        int[] studentAges = { 17, 16, 18 };
        double[] studentGrades = { 89.5, 92.0, 85.75 };

        // Clases y objetos: usa Student.java de este mismo capítulo.

        Student student = new Student("nombre", 15, 4.4);
        student.printDetails();   
        
        // Constructor sin argumentos y asignación de atributos.
        Student student1 = new Student();
        student1.name = "Richar";
        student1.age = 15;
        student1.grade = 5.6;
        System.err.println("Hash del estudiante: " + student1);
        student1.printDetails();

    }

}