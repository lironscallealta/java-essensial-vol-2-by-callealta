package espanol.cp05polimorfismo.tareasdecodificacion.desarrollo.tareados;

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }

    @Override
    public void mover() {
        System.out.println("El perro está corriendo");
    }

}
