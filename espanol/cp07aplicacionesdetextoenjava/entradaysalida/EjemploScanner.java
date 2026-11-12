package espanol.cp07aplicacionesdetextoenjava.entradaysalida;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploScanner  {

    public static void main(String[] args) throws InputMismatchException {
        Scanner s = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        String nombre = s.nextLine();

        System.out.println("¿Cuántos años tienes?");
        int edad = s.nextInt();

        System.out.println("Ingresa tu promedio:");
        double promedio = s.nextDouble();

        System.out.println("Hola " + nombre
                + ", el próximo año tendrás " + (edad + 1) + " años."
                + "\nPromedio: " + promedio);

        s.close();
    }
}