package espanol.cp06excepcionesyaserciones.tryconrecursos;

import java.io.*;

public class EjemploES2 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("¿Cómo te llamas?");
            String nombre = in.readLine();

            System.out.println("¿Cuántos años tienes?");
            int edad = Integer.parseInt(in.readLine());

            System.out.println("Hola " + nombre + ", el próximo año tendrás "
                    + (edad + 1) + " años.");
        }
    }
}

/*
 * El BufferedReader se declara como recurso del try y se cierra automáticamente al salir del bloque. Java cierra los recursos que implementan AutoCloseable.
 */