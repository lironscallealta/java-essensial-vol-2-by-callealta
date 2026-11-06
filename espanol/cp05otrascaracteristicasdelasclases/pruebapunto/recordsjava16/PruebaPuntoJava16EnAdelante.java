package espanol.cp05otrascaracteristicasdelasclases.pruebapunto.recordsjava16;

// Los records son estandar desde Java 16; fueron una caracteristica preliminar en Java 14 y 15.
// Java genera atributos private final, un constructor, accesores public, equals(), hashCode() y toString().
// Los accesores se llaman x() e y(), sin el prefijo get: permiten leer atributos que siguen siendo privados.
// No se generan setters. Los records son implicitamente final; los anidados tambien son static.
// Al imprimir un punto, toString() produce algo como Punto[x=10, y=20].
// equals() compara los valores de los componentes.

public class PruebaPuntoJava16EnAdelante {

    record Punto(int x, int y) { }

    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(10, 20);
        Punto p3 = new Punto(10, 20);

        System.out.println("El punto 1 esta en: "
                + p1.x() + " y " + p1.y());
        System.out.println("El punto 2 esta en: "
                + p2.x() + " y " + p2.y());
        System.out.println("El punto 3 esta en: "
                + p3.x() + " y " + p3.y());

        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p3);

        System.out.println("Comparando p1 y p2: "
                + p1.equals(p2));
        System.out.println("Comparando p2 y p3: "
                + p2.equals(p3));
    }
}
