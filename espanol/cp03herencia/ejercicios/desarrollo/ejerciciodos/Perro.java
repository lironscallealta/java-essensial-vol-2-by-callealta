package espanol.cp03herencia.ejercicios.desarrollo.ejerciciodos;

public class Perro extends Animal {

    Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("¡Guau! ¡Guau! ¡Guau!");
    }

    public void buscarPelota() {
        System.out.println("¡Buscando la pelota!");
    }
}
