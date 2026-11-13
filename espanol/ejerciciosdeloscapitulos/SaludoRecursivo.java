package espanol.ejerciciosdeloscapitulos;

public class SaludoRecursivo {
    public static void main(String[] args) {
        repetirSaludo(3, "hola");
    }

    static void repetirSaludo(int veces, String mensaje) {
        // Caso base. Termina cuando ya no quedan repeticiones.
        if (veces == 0) {
            return;
        }

        // Esta llamada imprime un saludo.

        System.out.println(mensaje);

        // Vuelve a llamar al método con una repetición menos.
        repetirSaludo(veces - 1, mensaje);
    }
}
