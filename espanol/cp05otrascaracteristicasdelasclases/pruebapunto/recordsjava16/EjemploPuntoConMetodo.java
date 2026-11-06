package espanol.cp05otrascaracteristicasdelasclases.pruebapunto.recordsjava16;

// Los datos del record se declaran entre parentesis.
// Dentro de sus llaves podemos agregar metodos, como sumar().
// x() e y() son accesores generados; sumar() es nuestro metodo adicional.

public class EjemploPuntoConMetodo {

    record Punto(int x, int y) {

        public int sumar() {
            return x + y;
        }
    }

    public static void main(String[] args) {
        Punto punto = new Punto(10, 20);

        System.out.println(punto.x());   
        System.out.println(punto.y());   
        System.out.println(punto.sumar()); 
    }
}
