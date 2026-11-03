package espanol.cp06otrascaracteristicasdelasclases.clasesabstractas;

// Mamifero implementa los metodos abstractos de Animal y agrega alimentarCrias().

public class Mamifero extends Animal {

    public void comer() {
        System.out.println("El mamifero come");
    }

    public void respirar() {
        System.out.println("El mamifero respira");

    };

    public void dormir() {
        System.out.println("El mamifero duerme");

    };

    public void alimentarCrias() {
        System.out.println("Alimentar a las crias");

    }

}
