package espanol.cp06excepcionesyaserciones.bloquestrycatch;

public class PruebaSalidaFinally {

    public static void main(String[] args) {
        
        try {
            System.out.println("Dentro del bloque try. Llamando a System.exit(0)...");
            System.exit(0);
        } catch (Exception e) {
            // System.exit termina el proceso, así que este catch no se ejecuta.
            System.out.println("Dentro del bloque catch.");
        } finally {
            // System.exit(0) termina la JVM antes de que se ejecute finally.
            System.out.println("Dentro del bloque finally. (Este mensaje no se imprime)");
        }
        
        System.out.println("Después de try-catch-finally. (Este mensaje tampoco se imprime)");
    }
}