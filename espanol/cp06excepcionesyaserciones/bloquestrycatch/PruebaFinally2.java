package espanol.cp06excepcionesyaserciones.bloquestrycatch;

public class PruebaFinally2 {

    public static void main(String[] args) {

        System.out.println("Entrando al bucle for.");
        for (int i = 1; i <= 5; i++) {

            try {

                if (i == 2)
                    break;
                System.out.println("i = " + i);
            } catch (Exception e) {

                System.out.println("Dentro del bloque catch.");
            } finally {
                System.out.println("Dentro del " +
                        "bloque finally.");
            }
        }
        System.out.println("Después del bucle.");
    }
}

/*
 * finally normalmente se ejecuta aunque try o catch salgan con return, break o una excepción. Puede quedar sin ejecutarse si System.exit termina la JVM o si el proceso se interrumpe de forma abrupta.
 */