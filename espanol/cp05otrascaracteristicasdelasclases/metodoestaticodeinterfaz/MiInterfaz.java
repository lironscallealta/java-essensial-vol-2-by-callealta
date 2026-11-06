package espanol.cp05otrascaracteristicasdelasclases.metodoestaticodeinterfaz;

public interface MiInterfaz {
    // Es un método de instancia. La clase concreta debe implementarlo.
    public void hacerTarea();

    // Este método es estático y pertenece a MiInterfaz.
    // Solo el método es estático; la interfaz no lo es.
    // Se llama con MiInterfaz.hacerAlgo().
    public static void hacerAlgo() {
        System.out.println("Dentro de hacerAlgo...");
    }
}
