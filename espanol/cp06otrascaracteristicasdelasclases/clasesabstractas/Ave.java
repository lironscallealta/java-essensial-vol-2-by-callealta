package espanol.cp06otrascaracteristicasdelasclases.clasesabstractas;

// Ave implementa los metodos abstractos de Animal y agrega acciones propias:
// ponerHuevos() y construirNido().

public class Ave extends Animal {
    @Override
    public void comer() {

        System.out.println("El ave come");
    }

    @Override
    public void respirar() {
        System.out.println("El ave respira");

    };

    @Override 
    public  void dormir(){
        System.out.println("El ave duerme");

    };

    public void ponerHuevos() {
        System.out.println("Poner huevos");

    }

    public void construirNido() {
        System.out.println("Construir nidos");

    }

}
