package espanol.cp06excepcionesyaserciones.tareasdecodificacion.desarrollo.tareauno.figuras;
public final class Rectangulo implements Figura {

    private int largo;
    private int ancho;

    Rectangulo(int... lados){
        largo = lados[0];
        ancho = lados[1];

    }

    public double obtenerPerimetro() {
        return Math.round(2 * (largo * ancho));
    }

    public double obtenerArea() {
        return Math.round(largo * ancho) ;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Largo: " + this.largo);
        System.out.println("Ancho: " + this.ancho);
        Figura.super.mostrarDetalles();
    }

}
