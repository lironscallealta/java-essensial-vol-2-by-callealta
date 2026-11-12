package espanol.cp00puentealvolumen2;

public class PracticaTernario {
    public static void main(String[] args) {
        int hora = 15;

        // Con hora = 15, ¿15 < 12? No. Java sigue por la rama después del primer ':'.
        // ¿15 < 18? Sí. Java elige el valor después del segundo '?'.
        String saludo = (hora < 12)
                ? "Buenos días"
                : ((hora < 18) ? "Buenas tardes" : "Buenas noches");
        System.out.println(saludo); // Buenas tardes

        // La misma decisión con if, else if y else.
        String saludoConIf;
        if (hora < 12) {
            saludoConIf = "Buenos días";
        } else if (hora < 18) {
            saludoConIf = "Buenas tardes";
        } else {
            saludoConIf = "Buenas noches";
        }
        System.out.println(saludoConIf); // Buenas tardes

        int numero = 0;

        // Con numero = 0, numero < 0 da false, así que Java comprueba numero == 0.
        // La segunda condición da true, así que Java elige "Cero".
        String tipo = (numero < 0)
                ? "Negativo"
                : ((numero == 0) ? "Cero" : "Positivo");
        System.out.println(tipo); // Cero

        // Prueba con hora = 9. ¿Java llega a la segunda condición?
        // Prueba con hora = 18. ¿Qué saludo elige Java?
    }
}
