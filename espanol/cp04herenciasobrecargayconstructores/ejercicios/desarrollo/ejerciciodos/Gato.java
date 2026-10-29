package espanol.cp04herenciasobrecargayconstructores.ejercicios.desarrollo.ejerciciodos;

public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("¡Miau! ¡Miau! ¡Miau!");
    }

    public void ronronear() {
        System.out.println("¡Ronroneando suavemente!");
    }

}