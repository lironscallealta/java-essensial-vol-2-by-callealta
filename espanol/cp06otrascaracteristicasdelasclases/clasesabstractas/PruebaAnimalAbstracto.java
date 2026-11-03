package espanol.cp06otrascaracteristicasdelasclases.clasesabstractas;

// No se puede escribir new Animal(): Animal es abstracta.
// El parametro Animal acepta tanto un Mamifero como un Ave.
// La primera rama muestra instanceof y casting explicito: no crea otro objeto.
// La segunda usa una variable de patron, disponible de forma estandar desde Java 16.
// comer(), respirar(), dormir() y jugar() se repiten en ambas ramas; esa es la redundancia.

public class PruebaAnimalAbstracto {

    public static void main(String[] args) {

        Mamifero perro = new Mamifero();
        Ave aguila = new Ave();

        realizarAccionesDelAnimal(perro);
        realizarAccionesDelAnimal(aguila);
    }

    public static void realizarAccionesDelAnimal(Animal a) {

        if (a instanceof Mamifero) {
            Mamifero m = (Mamifero) a;

            m.comer(); 
            m.respirar(); 
            m.dormir(); 
            m.jugar(); 
            m.alimentarCrias();
        } else if (a instanceof Ave b) {

            b.comer(); 
            b.respirar(); 
            b.dormir(); 
            b.jugar(); 
            b.ponerHuevos();
            b.construirNido();
        }
    }
}
