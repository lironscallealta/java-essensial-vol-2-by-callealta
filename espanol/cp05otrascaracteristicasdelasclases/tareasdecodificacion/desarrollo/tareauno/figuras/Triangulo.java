package espanol.cp05otrascaracteristicasdelasclases.tareasdecodificacion.desarrollo.tareauno.figuras;

public final class Triangulo implements Figura {

    private int lado1;
    private int lado2;
    private int lado3;

    Triangulo(int... lados) {
        this.lado1 = lados[0];
        this.lado2 = lados[1];
        this.lado3 = lados[2];
    }

    public double obtenerPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double obtenerArea() {
        // 1. Validar desigualdad triangular: las tres deben cumplirse
        boolean esValido = (lado1 + lado2 > lado3) &&
                (lado1 + lado3 > lado2) &&
                (lado2 + lado3 > lado1);

        if (!esValido) {
            System.out.println("Triángulo inválido: la suma de dos lados cualesquiera debe ser mayor que el tercero.");
            return 0.0; // o lanzar: throw new IllegalArgumentException("Lados del triángulo inválidos");
        }

        // 2. Solo si es válido se calcula el área
        double s = (lado1 + lado2 + lado3) / 2.0;
        return Math.round(Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3))) ;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Lado 1: " + this.lado1);
        System.out.println("Lado 2: " + this.lado2);
        System.out.println("Lado 3: " + this.lado3);
        Figura.super.mostrarDetalles();
    }

}
