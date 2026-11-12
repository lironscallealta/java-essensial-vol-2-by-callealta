package espanol.cp06excepcionesyaserciones.palabrathrows.relanzamientodeexcepciones;

public class DespuesDeJDK11 {

    public static void main(String[] args) throws Exception {
        try {
            procesarDatos(null);
        } catch (Exception e) {
            // Reasigna la variable del catch y lanza la nueva excepción.
            e = new Exception("Mensaje actualizado: " + e.getMessage());
            throw e;
        }
    }

    static void procesarDatos(String entrada) throws Exception {
        if (entrada == null) {
            throw new Exception("¡La entrada no puede ser nula!");
        }
    }
}
