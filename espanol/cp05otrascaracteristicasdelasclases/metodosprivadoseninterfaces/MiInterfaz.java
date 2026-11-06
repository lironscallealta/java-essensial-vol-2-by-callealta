package espanol.cp05otrascaracteristicasdelasclases.metodosprivadoseninterfaces;

public interface MiInterfaz {
    // Método público abstracto.
    void hacerTarea();

    // Método estático.
    public static void hacerAlgo() {
        System.out.println("Dentro de hacerAlgo...");
        registrarComun(); // Llama al método auxiliar privado.
    }

    // Método predeterminado.
    default void hacerMas() {
        System.out.println("Dentro de hacerMas...");
        registrarComun(); // Llama al método auxiliar privado.
    }

    private static void registrarComun() {
        System.out.println("[REGISTRO] Este es un método auxiliar privado dentro de la interfaz.");
    }
}
