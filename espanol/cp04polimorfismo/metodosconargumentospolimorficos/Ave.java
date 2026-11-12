package espanol.cp04polimorfismo.metodosconargumentospolimorficos;

public class Ave extends Animal {

    public void ponerHuevos() {
        System.out.println("Poner huevos");
    }

    public void construirNido() {
        System.out.println("Construir nidos");

    }

    @Override
    public void respirar() {
        System.out.println("El ave respira");

    }

    @Override
    public void comer() {
        System.out.println("El ave come");
    }

    @Override
    public void dormir() {
        System.out.println("El ave duerme");
    }

}
