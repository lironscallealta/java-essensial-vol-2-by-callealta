package espanol.ejerciciosdeloscapitulos;

// https://www.w3schools.com/java/java_arrays_reallife.asp
public class EjerciciosArreglos {
    public static void main(String[] args) {
        promedioEdades();
        edadMinima();
        hastaCero();
        maximoYMinimo();
        asientos();
    }

    private static void promedioEdades() {
        // 1. Recorre las edades y muestra su promedio con decimales.
        int[] edades = {20, 22, 18, 35, 48, 26, 87, 70};
        // TODO
    }

    private static void edadMinima() {
        // 2. Busca la edad más baja y muéstrala.
        int[] edades = {20, 22, 18, 35, 48, 26, 87, 70};
        // TODO
    }

    private static void hastaCero() {
        // 3. Omite los negativos con continue. Al encontrar un cero, termina el recorrido con break. Imprime los valores que sí procesas.
        int[] numeros = {3, -1, 7, 0, 9};
        // TODO
    }

    private static void maximoYMinimo() {
        // 4. Encuentra y muestra el mayor y el menor valor en un solo recorrido.
        int[] numeros = {45, 12, 98, 33, 27};
        // TODO
    }

    private static void asientos() {
        // 5. Muestra el índice de cada asiento (desde 0) y el nombre de quien lo ocupa.
        String[] ocupantes = {"Jenny", "Liam", "Angie", "Bo"};
        // TODO
    }
}
