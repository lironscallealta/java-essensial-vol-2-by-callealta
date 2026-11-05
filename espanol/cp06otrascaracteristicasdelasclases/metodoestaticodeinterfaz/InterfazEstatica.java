package espanol.cp06otrascaracteristicasdelasclases.metodoestaticodeinterfaz;

public class InterfazEstatica implements MiInterfaz {
    @Override
    public void hacerTarea() {
        System.out.println("Dentro de hacerTarea...");
    }

    public static void main(String[] args) {
        InterfazEstatica interfaz = new InterfazEstatica();

        // Llama al método de instancia mediante un objeto.
        interfaz.hacerTarea();

        // Llama al método estático mediante el nombre de la interfaz.
        // Pertenece a MiInterfaz.
        MiInterfaz.hacerAlgo();
    }
}
