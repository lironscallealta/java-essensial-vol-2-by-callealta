package espanol.chapterfour.varargs;

public class VarargsExample {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));         // 30
        System.out.println(sum(10, 20, 30));     // 60
        System.out.println(sum(10, 20, 30, 40)); // 100
        System.out.println(sum());              // 0

        // Un método varargs también puede recibir un arreglo existente.
        int[] values = {5, 10, 15};
        System.out.println(sum(values));        // 30
    }

    /*
 * VARARGS: ARGUMENTOS VARIABLES
 * int... numbers acepta cero o más valores int.
 * Dentro del método, numbers es un arreglo int[].
 * Ejemplos:
 * sum(10, 20)     -> numbers contiene {10, 20}
 * sum(10, 20, 30) -> numbers contiene {10, 20, 30}
 * sum()           -> numbers es un arreglo vacío
 * Reglas:
 * 1. Un método solo puede tener un parámetro varargs.
 * 2. El parámetro varargs debe ser el último.
 * Válido:    show(String title, int... numbers)
 * No válido: show(int... numbers, String title)
 * No válido: show(int... numbers, double... values)
 */

    public static int sum(int... numbers) {
        // Inicia un total nuevo en cada llamada al método.
        int total = 0;

        // Obtiene cada valor del arreglo, uno a la vez.
        for (int number : numbers) {
            // Equivale a: total = total + number;
            total += number;
        }

        // Si no se pasan argumentos, el bucle se ejecuta cero veces
        // y el método devuelve el total inicial: 0.
        return total;
    }
}