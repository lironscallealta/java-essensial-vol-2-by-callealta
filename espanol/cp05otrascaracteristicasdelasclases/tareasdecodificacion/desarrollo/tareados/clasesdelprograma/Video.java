package espanol.cp05otrascaracteristicasdelasclases.tareasdecodificacion.desarrollo.tareados.clasesdelprograma;

public class Video extends Contenido implements Visualizable {
    private double duracion; // Duración en minutos

    public Video(String titulo, String autor, double duracion) {
        super(titulo, autor);
        this.duracion = duracion;

    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Autor: " + this.autor + ", Película: " + this.titulo);

    }

    @Override
    public Double calcularTiempoDeLectura() {

        return this.duracion;
    }

    @Override
    public void ver() {
        System.out.println("Reproduciendo la película: " + this.titulo);

    }

    @Override
    public void publicar() {

        super.publicar();
        System.out.println(this.titulo);
    }

}
