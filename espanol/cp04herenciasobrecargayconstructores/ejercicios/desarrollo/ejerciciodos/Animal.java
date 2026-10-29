package espanol.cp04herenciasobrecargayconstructores.ejercicios.desarrollo.ejerciciodos;

public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public void emitirSonido() {
        System.out.println("Sonido genérico de animal");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " Edad: " + edad);
    }

}
