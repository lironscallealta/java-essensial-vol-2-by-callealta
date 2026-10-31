package espanol.cp05polimorfismo.tareasdecodificacion.desarrollo.tareados;

public class Gato extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    @Override
    public void mover() {
        System.out.println("El gato está saltando");
    }

}
