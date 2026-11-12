package espanol.cp06excepcionesyaserciones.tareasdecodificacion.desarrollo.tareauno.figuras;

public final class Circulo implements Figura {

    private final float PI = 3.14F;
    private int radio;

    Circulo(int radio) {
        this.radio = radio;
    }

    public double obtenerPerimetro() {
        return Math.round(2 * PI * radio);
    }

    public double obtenerArea() {
        return Math.round(PI * Math.pow(radio, 2));
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Radio: " + this.radio);
        Figura.super.mostrarDetalles();
    }

}
