package espanol.cp06otrascaracteristicasdelasclases.metodosprivadoseninterfaces;

public class InterfazEstatica implements MiInterfaz {
    @Override
    public void hacerTarea() {
        System.out.println("Dentro de hacerTarea...");
    }

    public static void main(String[] args) {
        InterfazEstatica interfaz = new InterfazEstatica();
        interfaz.hacerTarea();
        interfaz.hacerMas(); // Llama al método predeterminado.
        MiInterfaz.hacerAlgo(); // Llama al método estático.
    }
}
