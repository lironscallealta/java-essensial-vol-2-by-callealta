package espanol.cp06excepcionesyaserciones.palabrathrows.relanzamientodeexcepciones;

public class AntesDeJDK11 {

    public static void main(String[] args) throws Exception {
        try {
            procesarDatos(null);
        } catch (Exception e) {
            Exception ex = new Exception("Mensaje actualizado: " + e.getMessage());
            throw ex;
        }
    }

    static void procesarDatos(String entrada) throws Exception {
        if (entrada == null) {
            throw new Exception("¡La entrada no puede ser nula!");
        }
    }
}
