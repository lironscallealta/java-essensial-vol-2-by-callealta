package espanol.cp06excepcionesyaserciones.tareasdecodificacion.desarrollo.tareauno.figuras;

sealed interface Figura permits Rectangulo, Cuadrado, Circulo, Triangulo {

    double obtenerPerimetro();

    double obtenerArea();

    default void mostrarDetalles() {
        System.out.println("Perímetro: " + obtenerPerimetro());
        System.out.println("Área: " + obtenerArea());
    }
}
