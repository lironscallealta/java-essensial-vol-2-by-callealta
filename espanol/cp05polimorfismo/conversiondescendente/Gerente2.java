package espanol.cp05polimorfismo.conversiondescendente;

public class Gerente2 extends Empleado2 {

    String departamento;

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()
                + "\nDepartamento: " + departamento;
    }

    public void convocarReunion() {
        System.out.println("Convocar reunión de departamento..");
    }
    
}
