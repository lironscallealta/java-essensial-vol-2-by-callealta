package espanol.cp06excepcionesyaserciones.bloquestrycatch;

public class SumarArgumentos2 {

    public static void main(String[] args) {

        try {

            int suma = 0;
            for (String arg : args) {

                suma += Integer.parseInt(arg);
            }
            System.out.println("Suma: " + suma);
        } catch (NumberFormatException nfe) {

            System.err.println("Uno de los valores"
                    + " no es un entero.");
        }
    }
}

// Prueba: java espanol/cp06excepcionesyaserciones/bloquestrycatch/SumarArgumentos2.java 10 2.2 thirty 40



/*
 * try {
 *     // Código que puede lanzar una excepción.
 * } catch (TipoExcepcion1 ex) {
 *     // Maneja la primera excepción.
 * } catch (TipoExcepcion2 ex) {
 *     // Maneja la segunda excepción.
 * } finally {
 *     // Se ejecuta al salir de try o catch en el flujo normal de la JVM.
 * }
 */


