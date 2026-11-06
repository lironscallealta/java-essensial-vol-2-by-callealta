package espanol.cp04polimorfismo.tareasdecodificacion.desarrollo.tareados;

public class Ave extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("Pío");
    }

    @Override
    public void mover() {
        System.out.println("El ave está volando");
    }

}
