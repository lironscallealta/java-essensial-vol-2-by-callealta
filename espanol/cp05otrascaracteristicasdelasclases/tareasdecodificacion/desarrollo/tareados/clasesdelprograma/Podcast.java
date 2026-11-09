package espanol.cp05otrascaracteristicasdelasclases.tareasdecodificacion.desarrollo.tareados.clasesdelprograma;

public class Podcast extends Contenido implements Legible, Visualizable {
    private double duracion;
    private boolean transcripcion;

    public Podcast(String titulo, String autor, double duracion, boolean transcripcion) {
        super(titulo, autor);
        this.duracion = duracion;
        this.transcripcion = transcripcion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Autor: " + this.autor + ", Título: " + this.autor);
        System.out.println("Duración: " + duracion);
        if (transcripcion) {
            System.out.println("Transcripción disponible: " + transcripcion);
        } else
            System.out.println("No hay transcripción disponible");

    }

    @Override
    public void leer() {
        System.out.println("Leyendo el pódcast: " + this.titulo);
    }

    @Override
    public void ver() {
        System.out.println("Viendo el pódcast: " + this.titulo);

    }

    @Override
    public Double calcularTiempoDeLectura() {
        return this.duracion;
    }

    @Override
    public void publicar() {

        super.publicar();
        System.out.println(this.titulo);
    }

}
