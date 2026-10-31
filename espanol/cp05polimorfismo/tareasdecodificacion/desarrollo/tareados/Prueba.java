package espanol.cp05polimorfismo.tareasdecodificacion.desarrollo.tareados;
public class Prueba {

    public static void main(String[] args) {
        Animal animales[] = {
                new Perro(),
                new Gato(),
                new Ave()
        };


        for (int i = 0; i < animales.length; i++) {
           ReinoAnimal.imprimirSonidoAnimal(animales[i]);
           animales[i].mover();
        }
    }



}
