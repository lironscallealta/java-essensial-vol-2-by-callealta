package espanol.cp06excepcionesyaserciones.tryconrecursos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EjemploES {

    public static void main(String[] args) {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("¿Cómo te llamas?");
            String nombre = in.readLine();

            System.out.println("¿Cuántos años tienes?");
            int edad = Integer.parseInt(in.readLine());

            System.out.println("Hola " + nombre + ", el próximo año tendrás " + (edad + 1) + " años.");

            in.close();
        } catch (IOException ioe) {
            System.err.println("Ocurrió una excepción.");
        }
    }
}

// java.io contiene las clases de entrada/salida, como BufferedReader e IOException.
// Scanner facilita la lectura de valores de distintos tipos. BufferedReader permite leer líneas completas con eficiencia.
// close() cierra el flujo de entrada y libera sus recursos. El programa puede seguir ejecutándose.
// System.exit(0) termina la JVM. Si lo llamas antes del saludo, el programa termina sin imprimirlo.
