package espanol.cp06excepcionesyaserciones.bloquestrycatch;

public class SumarArgumentos3 {

    public static void main(String[] args) {

        int suma = 0;
        for (String arg : args) {

            try {

                suma += Integer.parseInt(arg);
            }
            catch (NumberFormatException nfe) {

                System.err.println(arg + " no es"
                         + " un entero y no "
                         + "se incluirá en la suma.");
            }
        }
        System.out.println("Suma: " + suma);
    }
}
// Desde la terminal:
// Compila: javac espanol/cp06excepcionesyaserciones/bloquestrycatch/SumarArgumentos3.java
// O ejecútalo directamente:
// java espanol/cp06excepcionesyaserciones/bloquestrycatch/SumarArgumentos3.java 10 2.2 thirty 40