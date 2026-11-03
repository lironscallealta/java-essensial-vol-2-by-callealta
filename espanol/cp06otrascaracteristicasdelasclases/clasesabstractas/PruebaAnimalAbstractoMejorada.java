package espanol.cp06otrascaracteristicasdelasclases.clasesabstractas;

// Version que evita repetir las acciones comunes en cada rama.
// Animal declara esas acciones y Java ejecuta la implementacion del objeto recibido.
// instanceof solo se necesita para llamar a las acciones especificas de cada subclase.

public class PruebaAnimalAbstractoMejorada {

    public static void main(String[] args) {
        Mamifero perro = new Mamifero();
        Ave aguila = new Ave();

        realizarAccionesDelAnimal(perro);
        realizarAccionesDelAnimal(aguila);
    }

    public static void realizarAccionesDelAnimal(Animal a) {
        a.comer();
        a.respirar();
        a.dormir();
        a.jugar();

        if (a instanceof Mamifero m) {
            m.alimentarCrias();
        } else if (a instanceof Ave b) {
            b.ponerHuevos();
            b.construirNido();
        }
    }
}
