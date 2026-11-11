package english.c07javatextbasedaplications.inputoutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExample  {

    public static void main(String[] args) throws InputMismatchException {
        Scanner s = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = s.nextLine();

        System.out.println("How old are you?");
        int age = s.nextInt();

        System.out.println("Enter your GPA:");
        double gpa = s.nextDouble();

        System.out.println("Hello " + name
                + ", next year you'll be " + (age + 1) + " years old."
                + "\nGPA is: " + gpa);

        s.close();
    }
}