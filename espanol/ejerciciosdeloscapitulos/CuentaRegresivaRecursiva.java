package espanol.ejerciciosdeloscapitulos;

public class CuentaRegresivaRecursiva {
    public static void main(String[] args) {
        contarHaciaAtras(3);
    }

    static void contarHaciaAtras(int numero) {
        // Caso base. Termina cuando el número llega a cero.
        if (numero == 0) {
            System.out.println("¡Terminó!");
            return;
        }

        // Imprime el número actual.
        System.out.println(numero);

        // Vuelve a llamar al método con un número menor.
        contarHaciaAtras(numero - 1);
    }
}
