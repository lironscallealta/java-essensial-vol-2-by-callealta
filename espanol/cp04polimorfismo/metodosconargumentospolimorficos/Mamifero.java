package espanol.cp04polimorfismo.metodosconargumentospolimorficos;

public class Mamifero extends Animal {

    public void alimentarCrias() {

        System.out.println("Alimentar a las crías");

    }

    @Override
    public void respirar() {
        System.out.println("El mamífero respira");
        
    }

    @Override
    public void comer() {
        System.out.println("El mamífero come");
    }

    @Override
    public void dormir() {
        System.out.println("El mamífero duerme");
    }
}
