package espanol.cp05otrascaracteristicasdelasclases.tareasdecodificacion.desarrollo.tareados.clasesdelprograma;

public class Articulo extends Contenido implements Legible {
    private int cantidadDePalabras;

    public Articulo(String titulo, String autor, int cantidadDePalabras) {
        super(titulo, autor);
        this.cantidadDePalabras = cantidadDePalabras;

    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Autor: " + this.autor + ", Artículo: " + this.titulo + ".");
        System.out.println("Cantidad de palabras: " + cantidadDePalabras);
    }

    @Override
    public Double calcularTiempoDeLectura() {

        return cantidadDePalabras/ 200.0;
    }

    @Override
    public void leer() {
        System.out.println("Leyendo el artículo: " + this.titulo);
    }

    @Override
    public void publicar() {
        
        super.publicar();
        System.out.println(this.titulo);
    }

}
