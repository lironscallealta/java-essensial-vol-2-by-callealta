package espanol.cp05otrascaracteristicasdelasclases.tareasdecodificacion.desarrollo.tareados.clasesdelprograma;

public abstract class Contenido {

    protected String titulo;
    protected String autor;

    Contenido(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    abstract void mostrarInformacion();

    public abstract Double calcularTiempoDeLectura();

    public void publicar() {
        System.out.print("Contenido publicado: ");
    }

}
