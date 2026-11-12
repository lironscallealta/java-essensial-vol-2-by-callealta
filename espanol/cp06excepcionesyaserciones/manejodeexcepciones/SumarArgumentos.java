package espanol.cp06excepcionesyaserciones.manejodeexcepciones;

public class SumarArgumentos {
    public static void main(String[] args) {
        int suma = 0;
        for (String arg : args) {
            suma += Integer.parseInt(arg);
        }
        System.out.println("Suma: " + suma);
    }
}
// Desde la terminal:
// java espanol/cp06excepcionesyaserciones/manejodeexcepciones/SumarArgumentos.java 10 20 30 40

// O bien, después de compilar:
// java espanol.cp06excepcionesyaserciones.manejodeexcepciones.SumarArgumentos 10 20 30 40

// Prueba con un valor que no sea entero para provocar la excepción.
// java espanol.cp06excepcionesyaserciones.manejodeexcepciones.SumarArgumentos 10 2.2 thirty 40
