package espanol.cp06excepcionesyaserciones.tareasdecodificacion.desarrollo.tareauno.figuras;

public final class Cuadrado implements Figura {

    private int lado;

    Cuadrado(int lado) {
        this.lado = lado;
    }

    public double obtenerPerimetro() {
        return Math.round(4 * lado);
    }

    public double obtenerArea() {
        return Math.round(lado * lado);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Lado: " + this.lado);
        Figura.super.mostrarDetalles();
    }

}
