package espanol.cp06excepcionesyaserciones.tareasdecodificacion.desarrollo.tareauno.figuras;

public class PruebaFiguras {

    public static void main(String[] args) {
        try {
            CalculadoraFiguras.figuras(args);
        } catch (NumberFormatException e) {
            System.err.println("Uno de los argumentos no es un entero válido.");
            System.err.println("Se capturó una NumberFormatException.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.err.println("Se capturó una IllegalArgumentException.");
        }

    }

    
}

// Tras compilar, ejecuta: java espanol.cp06excepcionesyaserciones.tareasdecodificacion.desarrollo.tareauno.figuras.PruebaFiguras 10 50
