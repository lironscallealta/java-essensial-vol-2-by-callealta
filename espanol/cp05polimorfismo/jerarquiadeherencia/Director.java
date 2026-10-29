package espanol.cp05polimorfismo.jerarquiadeherencia;

public class Director extends Gerente {

    public double asignacionAutomovil(){
        return 0.0;
    }

    public void aumentarAsignacion(){
        System.out.println("Vacío");
    }

}
