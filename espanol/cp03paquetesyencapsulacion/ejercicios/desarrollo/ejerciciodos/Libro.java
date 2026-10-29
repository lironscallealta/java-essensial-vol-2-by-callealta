package espanol.cp03paquetesyencapsulacion.ejercicios.desarrollo.ejerciciodos;

/*
 * Ejercicio de programación 2:
 * 1. Crea Libro con los campos privados String titulo, String autor e int anioPublicacion.
 * 2. Agrega un constructor que inicialice los tres campos.
 * 3. Proporciona métodos públicos de consulta y modificación para cada campo.
 * 4. Agrega mostrarInformacion(), un método de instancia que muestre los datos así:
 *    "Título: <titulo>, Autor: <autor>, Año: <anioPublicacion>"
 * 5. En main de AplicacionBiblioteca, crea al menos dos objetos Libro, establece o modifica
 *    sus datos con los métodos de modificación y llama a mostrarInformacion() en cada uno.
 */
public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    Libro(Libro libro) {
        titulo = libro.titulo;
        autor = libro.autor;
        anioPublicacion = libro.anioPublicacion;
    }

    public void establecerTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void establecerAutor(String autor) {
        this.autor = autor;

    }

    public void establecerAnioPublicacion(int anioPublicacion) {

        this.anioPublicacion = anioPublicacion;

    }

    public String obtenerTitulo() {
        return titulo;
    }

    public String obtenerAutor() {
        return autor;
    }

    public int obtenerAnioPublicacion() {
        return anioPublicacion;
    }

    public void mostrarInformacion(){
        System.out.println("Título: " + titulo +", Autor: " + autor + ", Año: " + anioPublicacion);
    }



}

