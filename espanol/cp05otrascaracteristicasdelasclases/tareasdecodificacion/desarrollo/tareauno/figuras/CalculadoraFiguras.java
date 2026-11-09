package espanol.cp05otrascaracteristicasdelasclases.tareasdecodificacion.desarrollo.tareauno.figuras;

public class CalculadoraFiguras {

    public static void figuras(int... entradas) {

        int cantidadDeEntradas = entradas.length;

        if (cantidadDeEntradas == 3) {
            Triangulo triangulo = new Triangulo(entradas);
            triangulo.mostrarDetalles();
        } else if (cantidadDeEntradas == 2 && (entradas[0] - entradas[1] == 0)) {
            Cuadrado cuadrado = new Cuadrado(entradas[0]);
            cuadrado.mostrarDetalles();

        }

        else if (cantidadDeEntradas == 2 && (entradas[0] - entradas[1] != 0)) {
            Rectangulo rectangulo = new Rectangulo(entradas);
            rectangulo.mostrarDetalles();

        }

        else if (cantidadDeEntradas == 1) {
            Circulo circulo = new Circulo(entradas[0]);
            circulo.mostrarDetalles();

        }
    }

}
