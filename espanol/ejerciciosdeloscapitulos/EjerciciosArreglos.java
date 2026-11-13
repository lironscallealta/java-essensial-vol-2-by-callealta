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

        int[] edades = { 20, 22, 18, 35, 48, 26, 87, 70 };
        System.out.println("ejercicio 1");
        float suma = 0, promedio, cantidad = edades.length;
        for (int edad : edades) {
            suma += edad;
        }
        promedio = suma / cantidad;
        System.out.println(promedio);

    }

    private static void edadMinima() {
        // 2. Busca la edad más baja y muéstrala.
        int[] edades = { 20, 22, 18, 35, 48, 26, 87, 70 };
        System.out.println("ejercicio 2");
        int menorEdad = edades[0];
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] < menorEdad) {
                menorEdad = edades[i];
            }
        }
        System.out.println(menorEdad);
    }

    private static void hastaCero() {
        // 3. Omite los negativos con continue. Al encontrar un cero, termina el recorrido con break. Imprime los valores que sí procesas.
        int[] numeros = { 3, -1, 7, 0, 9 };
        System.out.println("ejercicio 3");
        for (int i : numeros) {
            if (i < 0) {
                System.out.println("Se omite un número negativo");

                continue;
            } else if (i == 0) {
                System.out.println("El recorrido termina al encontrar cero");
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }

    }

    private static void maximoYMinimo() {
        // 4. Encuentra y muestra el mayor y el menor valor en un solo recorrido.
        int[] numeros = { 45, 12, 98, 33, 27 };
        int mayor = numeros[0];
        int menor = numeros[0];
        for (int i : numeros) {
            if (i > mayor) {
                mayor = i;
            }
            if (i < menor) {
                menor = i;

            }
        }
        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);
    }

    private static void asientos() {
        // 5. Muestra el índice de cada asiento (desde 0) y el nombre de quien lo ocupa.
        String[] ocupantes = { "Jenny", "Liam", "Angie", "Bo" };
        for (int i = 0; i < ocupantes.length; i++) {
            System.out.println(i + 1 + "- " + ocupantes[i]);
        }
    }
}
