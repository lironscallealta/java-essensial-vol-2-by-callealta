package espanol.cp06excepcionesyaserciones.palabrathrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.io.IOException;

public class EjemploES3 {

    /*
 * main declara throws IOException, por lo que los errores de lectura se propagan al llamador. Esto mantiene el ejemplo breve y deja que la JVM muestre el error si nadie lo captura.
 *
 * Si escribes letras en vez de una edad, parseInt lanza NumberFormatException. Es una excepción no comprobada y se propaga aunque la firma solo declare IOException.
 */

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("¿Cómo te llamas?");
        String nombre = in.readLine();

        System.out.println("¿Cuántos años tienes?");
        int edad = Integer.parseInt(in.readLine());

        System.out.println("Hola " + nombre + ", el próximo año tendrás " + (edad + 1) + " años.");

        in.close();
    }
}

class EjemplosMetodos {
    void hacerAlgo() throws IOException {
    }

    void algunMetodo() throws SQLException, IOException {
    }

}
