package espanol.cp04polimorfismo.metodosconargumentospolimorficos;

public class PruebaAnimal {

    public static void main(String[] args) {
        Mamifero perro = new Mamifero();
        Ave aguila = new Ave();

        System.out.println("-------");
        System.out.println("Prueba con un perro");
        System.out.println("-------");
        mostrarComportamiento(perro);

         System.out.println("-------");
        System.out.println("Prueba con un águila");
        System.out.println("-------");
        mostrarComportamiento(aguila);

    }

    public static void mostrarComportamiento(Animal a) {

        a.comer();
        a.respirar();
        a.dormir();
        a.jugar();

        if (a instanceof Mamifero) {

            Mamifero m = (Mamifero) a;
            m.alimentarCrias();

        }
        else if (a instanceof Ave) {

            Ave b = (Ave) a;
            b.ponerHuevos();;
            b.construirNido();
            
        }

    }

}
