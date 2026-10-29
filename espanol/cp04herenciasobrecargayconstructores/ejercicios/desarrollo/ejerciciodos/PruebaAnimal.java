package espanol.cp04herenciasobrecargayconstructores.ejercicios.desarrollo.ejerciciodos;

public class PruebaAnimal {

    public static void main(String[] argumentos) {

        Perro miPerro = new Perro("Buddy", 3);
        Gato miGato = new Gato("Whiskers", 2);

        miPerro.mostrarInformacion();
        miPerro.emitirSonido();
        miPerro.buscarPelota();
        miGato.mostrarInformacion();
        miGato.emitirSonido();
        miGato.ronronear();

    }

}
