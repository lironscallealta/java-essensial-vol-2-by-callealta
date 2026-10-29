package english.cp01fundamentals;
import java.util.Scanner;


/** Ejemplo general del capítulo 1: consola, tipos, arreglos y primeros objetos.
 * Ejecuta main y responde las preguntas de nombre y edad. Usa Student.java.
 */
public class Main {

    //Chapter 1

    public static void main(String[] args) {

        // 1 print
        System.out.println("Example print");

        // 2 if
        int age = 18;
        if (age == 18)
            System.out.println("you are same old");
        else if (age > 18)
            System.out.println("You are old");
        else
            System.out.println("You are young");

        // 3 scanner with String
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.nextLine();
        System.err.println("hello" + " " + name);

        // 4 Scanner with number
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("How old are you?");
        age = inputTwo.nextInt();
        System.out.println("You are " + age);

        // primitive data types

        int ageAgain = 16;
        double gpa = 3.75;
        char grade = 'A';
        boolean isEnrolled = true;

        String nameAgain = "Michelle";
        System.out.println("Your name " + nameAgain + " has " +
                nameAgain.length() + " letters.");
        System.out.println(name.toUpperCase());

        // Arrays
        int[] scores = { 10, 20, 30, 40 };
        System.out.println("Your first score : " + scores[0] + " and last score was: " + scores[3]);

        // Array examples
        String[] studentNames = { "Matthew", "Mark", "Luke" };
        int[] studentAges = { 17, 16, 18 };
        double[] studentGrades = { 89.5, 92.0, 85.75 };

        // Clases y objetos: usa Student.java de este mismo capítulo.

        Student student = new Student("name", 15, 4.4);
        student.printDetails();   
        
        // Constructor sin argumentos y asignación de atributos.
        Student student1 = new Student();
        student1.name = "Richar";
        student1.age = 15;
        student1.grade = 5.6;
        System.err.println("Hash student: " + student1);
        student1.printDetails();

    }

}