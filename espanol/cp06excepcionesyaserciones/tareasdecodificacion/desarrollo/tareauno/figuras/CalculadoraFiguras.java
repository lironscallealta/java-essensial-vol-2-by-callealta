package espanol.cp06excepcionesyaserciones.tareasdecodificacion.desarrollo.tareauno.figuras;
public class CalculadoraFiguras {

    public static void figuras(String[] args) {
        int[] numeros = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }
        figuras(numeros);
    }

    public static void figuras(int... entradas) {

        int cantidad = entradas.length;
        if (cantidad == 0) {
            throw new IllegalArgumentException("Pasa de uno a tres valores por la línea de comandos.");
        }
        if (cantidad > 3) {
            throw new IllegalArgumentException("Pasa como máximo tres valores.");
        }
        for (int numero : entradas) {
            if (numero < 0) {
                throw new IllegalArgumentException("Se recibió un valor negativo.");
            }
        }

        if (cantidad == 3) {
            Triangulo triangulo = new Triangulo(entradas);
            triangulo.mostrarDetalles();
        } else if (cantidad == 2 && (entradas[0] - entradas[1] == 0)) {
            Cuadrado cuadrado = new Cuadrado(entradas[0]);
            cuadrado.mostrarDetalles();

        }

        else if (cantidad == 2 && (entradas[0] - entradas[1] != 0)) {
            Rectangulo rectangulo = new Rectangulo(entradas);
            rectangulo.mostrarDetalles();

        }

        else if (cantidad == 1) {
            Circulo circulo = new Circulo(entradas[0]);
            circulo.mostrarDetalles();

        }
    }

}
