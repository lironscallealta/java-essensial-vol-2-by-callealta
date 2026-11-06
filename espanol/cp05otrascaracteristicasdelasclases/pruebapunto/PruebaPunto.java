package espanol.cp05otrascaracteristicasdelasclases.pruebapunto;

// Ejemplo compatible con Java 14 y versiones posteriores; esta sintaxis tambien es anterior a Java 14.
// Punto hereda implicitamente de Object y es final: no puede tener subclases.
// Sus coordenadas final solo pueden asignarse una vez.
// En p1.equals(p2), this referencia p1 y obj recibe p2.
// El parametro Object permite recibir cualquier objeto: estar dentro de Punto no garantiza que obj sea Punto.
// instanceof comprueba el argumento antes de leer sus coordenadas; ya devuelve false para null.
// El casting (Punto) permite acceder a x e y sin crear otro objeto.
// equals() devuelve true cuando coinciden ambas coordenadas, aunque los objetos sean distintos.
// Los puntos iguales deben tener el mismo hashCode(). ^ es XOR bit a bit:
// produce 1 cuando los bits son distintos y 0 cuando son iguales.
// 10: 01010
// 20: 10100
//     -----
// 30: 11110
// El hash no es un identificador unico: puntos diferentes pueden compartirlo.
// Al imprimir un punto se usa toString(); getName() incluye el nombre del paquete.

final class Punto {

    public final int x;
    public final int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // En p1.equals(p2): this es p1 y obj es p2.
    public boolean equals(Object obj) {
        boolean resultado = false;

        // El argumento podria ser de otro tipo: comprobarlo antes del casting.
        if (obj != null && obj instanceof Punto) {

            // Convertimos la referencia, sin crear otro objeto.
            Punto p = (Punto) obj;

            // Los dos valores de las coordenadas deben coincidir.
            if (this.x == p.x && this.y == p.y) {
                resultado = true;
            }
        }

        return resultado;
    }

    public int hashCode() {

        return x ^ y;
    }

    public String toString() {

        return this.getClass().getName()
                + "[x=" + this.x + ", y=" + this.y + "]";
    }
}

public class PruebaPunto {

    public static void main(String[] args) {

        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(10, 20);
        Punto p3 = new Punto(10, 20);

        System.out.println("El punto 1 esta en: "
                + p1.x + " y " + p1.y);
        System.out.println("El punto 2 esta en: "
                + p2.x + " y " + p2.y);
        System.out.println("El punto 3 esta en: "
                + p3.x + " y " + p3.y);

        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p3);

        System.out.println("Comparando p1 y p2: "
                + p1.equals(p2));

        System.out.println("Comparando p2 y p3: "
                + p2.equals(p3));
    }
}
