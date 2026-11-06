package espanol.cp05otrascaracteristicasdelasclases.interfazpredeterminada.metodopredeterminado;

interface MiInterfaz {
    public void saludar();

    default void miSaludoPredeterminado() {
        System.out.println("Hola, mundo predeterminado.");
    }
}

public class InterfazPredeterminada implements MiInterfaz {
    @Override
    public void saludar() {
        System.out.println("Hola");
    }

    @Override
    public void miSaludoPredeterminado() {
        MiInterfaz.super.miSaludoPredeterminado();
        System.out.println("Sobrescribiendo el método predeterminado.");
    }

    public static void main(String[] args) {
        MiInterfaz interfaz = new InterfazPredeterminada();
        interfaz.saludar();
        interfaz.miSaludoPredeterminado();
    }
}
