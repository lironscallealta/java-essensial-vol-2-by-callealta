package espanol.chapterfour.overloading;

public class Overloading {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));         // 30
        System.out.println(sum(10, 20, 30));     // 60
        System.out.println(sum(10, 20, 30, 40)); // 100
        System.out.println(sum(1.5, 2.5));       // 4.0
    }

    /*
 * SOBRECARGA DE MÉTODOS
 * Los métodos tienen el mismo nombre, pero distintas listas de parámetros.
 * Pueden diferir en la cantidad, los tipos o el orden de tipos diferentes.
 * Los nombres de parámetros y los tipos de retorno no distinguen sobrecargas.
 */

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Sobrecarga válida: tres parámetros en lugar de dos.
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Sobrecarga válida: cuatro parámetros.
    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    // Sobrecarga válida: dos parámetros double en lugar de dos int.
    // La diferencia en los tipos de parámetros define una sobrecarga.
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    /*
 * NO VÁLIDO: cambiar solo los nombres de parámetros no crea una sobrecarga.
 * Esto duplicaría la firma existente sum(int, int).
 * public static int sum(int first, int second) {
 *     return first + second;
 * }
 */

    /*
 * NO VÁLIDO: cambiar solo el tipo de retorno no crea una sobrecarga.
 * Esto también duplicaría la firma existente sum(int, int).
 * public static double sum(int a, int b) {
 *     return a + b;
 * }
 */
}