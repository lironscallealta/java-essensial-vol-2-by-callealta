package espanol.cp06otrascaracteristicasdelasclases.enumeraciones;

// Los enum existen desde Java 5. Son clases especiales con un conjunto fijo de objetos.
// PlanetasInteriores es el tipo; MERCURIO, VENUS, TIERRA y MARTE son sus objetos.
// Elegimos uno de ellos sin usar new. Las constantes son public static final.
// Este enum esta dentro de una clase: puede declararse public, private o protected,
// o tener acceso de paquete como aqui; ademas es implicitamente static.
// Al imprimir planeta, Java usa toString(), que devuelve por defecto el nombre de la constante.
// Se imprime TIERRA, no el nombre de la variable planeta.

public class EjemploEnumPlanetasInteriores {

    enum PlanetasInteriores { 
        MERCURIO, VENUS, TIERRA, MARTE; 
    }

    public static void main(String[] args) {

        PlanetasInteriores planeta = PlanetasInteriores.TIERRA;

        System.out.println("Nuestro planeta: " + planeta);
    }
}
