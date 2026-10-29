package espanol.cp04herenciasobrecargayconstructores.sobrecarga;

public class Sobrecarga {

    public static void main(String[] argumentos) {
        System.out.println(sumar(10, 20));         // 30
        System.out.println(sumar(10, 20, 30));     // 60
        System.out.println(sumar(10, 20, 30, 40)); // 100
        System.out.println(sumar(1.5, 2.5));       // 4.0
    }

    /*
 * SOBRECARGA DE MÉTODOS
 * Los métodos tienen el mismo nombre, pero distintas listas de parámetros.
 * Pueden diferir en la cantidad, los tipos o el orden de tipos diferentes.
 * Los nombres de parámetros y los tipos de retorno no distinguen sobrecargas.
 */

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    // Sobrecarga válida: tres parámetros en lugar de dos.
    public static int sumar(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }

    // Sobrecarga válida: cuatro parámetros.
    public static int sumar(int numero1, int numero2, int numero3, int numero4) {
        return numero1 + numero2 + numero3 + numero4;
    }

    // Sobrecarga válida: dos parámetros double en lugar de dos int.
    // La diferencia en los tipos de parámetros define una sobrecarga.
    public static double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    /*
 * NO VÁLIDO: cambiar solo los nombres de parámetros no crea una sobrecarga.
 * Esto duplicaría la firma existente sumar(int, int).
 * public static int sumar(int primero, int segundo) {
 *     return primero + segundo;
 * }
 */

    /*
 * NO VÁLIDO: cambiar solo el tipo de retorno no crea una sobrecarga.
 * Esto también duplicaría la firma existente sumar(int, int).
 * public static double sumar(int a, int b) {
 *     return a + b;
 * }
 */
}