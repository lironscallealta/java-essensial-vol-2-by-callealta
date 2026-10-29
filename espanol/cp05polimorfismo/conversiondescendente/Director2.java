package espanol.cp05polimorfismo.conversiondescendente;

public class Director2 extends Gerente2 {

    double asignacionAutomovil;

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()
                + "\nAsignación para automóvil: " + asignacionAutomovil;
    }

    public void jugarGolf() {
        System.out.println("Jugar golf..");
    }
}