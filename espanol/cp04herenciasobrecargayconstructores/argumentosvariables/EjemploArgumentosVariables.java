package espanol.cp04herenciasobrecargayconstructores.argumentosvariables;

public class EjemploArgumentosVariables {

    public static void main(String[] argumentos) {
        System.out.println(sumar(10, 20));         // 30
        System.out.println(sumar(10, 20, 30));     // 60
        System.out.println(sumar(10, 20, 30, 40)); // 100
        System.out.println(sumar());              // 0

        // Un método argumentosvariables también puede recibir un arreglo existente.
        int[] valores = {5, 10, 15};
        System.out.println(sumar(valores));        // 30
    }

    /*
 * VARARGS: ARGUMENTOS VARIABLES
 * int... numeros acepta cero o más valores int.
 * Dentro del método, numeros es un arreglo int[].
 * Ejemplos:
 * sumar(10, 20)     -> numeros contiene {10, 20}
 * sumar(10, 20, 30) -> numeros contiene {10, 20, 30}
 * sumar()           -> numeros es un arreglo vacío
 * Reglas:
 * 1. Un método solo puede tener un parámetro argumentosvariables.
 * 2. El parámetro argumentosvariables debe ser el último.
 * Válido:    mostrar(String titulo, int... numeros)
 * No válido: mostrar(int... numeros, String titulo)
 * No válido: mostrar(int... numeros, double... valores)
 */

    public static int sumar(int... numeros) {
        // Inicia un total nuevo en cada llamada al método.
        int total = 0;

        // Obtiene cada valor del arreglo, uno a la vez.
        for (int numero : numeros) {
            // Equivale a: total = total + numero;
            total += numero;
        }

        // Si no se pasan argumentos, el bucle se ejecuta cero veces
        // y el método devuelve el total inicial: 0.
        return total;
    }
}