package espanol.cp07aplicacionesdetextoenjava.formatodecadenas;

import java.io.*;
import java.util.Scanner;

public class MostrarCociente {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        int primero = s.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int segundo = s.nextInt();
        double cociente = (double)primero / segundo;
        String resultado = String.format("%6.2f", cociente);
        System.out.println("Cociente: " + resultado);
        s.close();
    }
}