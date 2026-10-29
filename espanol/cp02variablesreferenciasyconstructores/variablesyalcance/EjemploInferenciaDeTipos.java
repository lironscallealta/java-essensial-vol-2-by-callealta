package espanol.cp02variablesreferenciasyconstructores.variablesyalcance;

/** Inferencia de tipos con var: ejemplos de variables locales y bucles. */
public class EjemploInferenciaDeTipos {

    public static void main(String[] argumentos) {
        // Uso de var para declarar variables locales.

        // Tipo inferido: String.
        var mensaje = "¡Hola, Java 10 y versiones posteriores!";

        // Tipo inferido: int.
        var numero = 42;

        // Tipo inferido: double.
        var pi = 3.14159;

        // Tipo inferido: boolean.
        var esJavaDivertido = true;

        // Imprime las variables con tipo inferido.
        System.out.println(mensaje);
        System.out.println("Número: " + numero);
        System.out.println("Pi: " + pi);
        System.out.println("¿Java es divertido? " + esJavaDivertido);

        // Uso de var en un bucle.
        var frutas = new String[] { "Manzana", "Plátano", "Cereza" };
        String listaCadenas[] = { "hola", "mi", "amigo", "¿cómo", "estás", "tú?" };

        for (String cadena : listaCadenas) {
            System.out.print(cadena + " ");
        }
        System.out.println("");

        // El tipo de fruta se infiere como String.
        for (var fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        // var con un objeto cuyo tipo se infiere como PersonaTres.
        var persona = new PersonaTres("Lawrence", 25);
        persona.presentarse();
    }
}

// Una clase sencilla que representa una persona.

class PersonaTres {

    private String nombre;
    private int edad;

    PersonaTres(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void presentarse() {
        System.out.println(
                "Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}