package espanol.cp03paquetesyencapsulacion.ejercicios.desarrollo.ejerciciodos;

public class AplicacionBiblioteca {

    /*
 * 5. En main de AplicacionBiblioteca, crea al menos dos objetos Libro, establece o modifica
 * sus datos mediante los métodos de modificación y llama a mostrarInformacion() en cada uno.
 */
    public static void main(String[] argumentos) {

        Libro libro1 = new Libro("Condorito", "Pepo", 1515);
        Libro libro2 = new Libro(libro1);
        System.out.println(libro1 + " - " + libro2);
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }

}
