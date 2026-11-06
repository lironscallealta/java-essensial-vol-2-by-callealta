package espanol.cp05otrascaracteristicasdelasclases.interfazpredeterminada.metodopredeterminado;

interface MiInterfaz1 {
    public default void miSaludoPredeterminado() {
        System.out.println("Dentro de MiInterfaz 1");
    }
}

interface MiInterfaz2 {
    public default void miSaludoPredeterminado() {
        System.out.println("Dentro de MiInterfaz 2");
    }
}

public class HerenciaMultipleDeInterfacesPredeterminadas
        implements MiInterfaz1, MiInterfaz2 {
    // Ambas interfaces proporcionan un método default con la misma firma.
    // Esta clase debe sobrescribirlo y decidir qué implementación utilizar.
    @Override
    public void miSaludoPredeterminado() {
        // Llama a la implementación de MiInterfaz1.
        MiInterfaz1.super.miSaludoPredeterminado();

        // Llama a la implementación de MiInterfaz2.
        MiInterfaz2.super.miSaludoPredeterminado();

        System.out.println("Sobrescribiendo el método predeterminado.");
    }

    public static void main(String[] args) {
        HerenciaMultipleDeInterfacesPredeterminadas interfaz =
                new HerenciaMultipleDeInterfacesPredeterminadas();
        interfaz.miSaludoPredeterminado();
    }
}
