package espanol.cp06excepcionesyaserciones.bloquestrycatch;

public class PruebaFinally1 {

    public static void main(String[] args) {

        System.out.println("Dentro del método main.");
        hacerAlgo();
        System.out.println("Después de llamar a hacerAlgo().");
    }

    public static void hacerAlgo() {

        System.out.println("Dentro de hacerAlgo");
        try {

            System.out.println("Dentro del bloque try.");
            throw new Exception();
        } catch (Exception e) {

            System.out.println("Se capturó una excepción.");
            return;
        } finally {
            System.out.println("Dentro del " +
                    "bloque finally.");
        }
    }
}

/*
 * Ejemplo de limpieza con finally.
 *
 * try {
 *     abrirGrifo();
 *     regarCesped();
 * } catch (ExcepcionTuberiaRota e) {
 *     registrarProblema(e);
 * } finally {
 *     cerrarGrifo();
 * }
 */
