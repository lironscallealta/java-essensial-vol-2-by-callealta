package espanol.cp05otrascaracteristicasdelasclases.clasesabstractas;

// Una clase abstracta no se puede instanciar directamente.
// Sus subclases concretas deben implementar comer(), respirar() y dormir().
// El metodo jugar() ya tiene una implementacion que pueden heredar.

public abstract class Animal {

    public abstract void comer();

    public abstract void respirar();

    public abstract void dormir();

    public void jugar() {
        System.out.println("Diviertete");
    }

}
