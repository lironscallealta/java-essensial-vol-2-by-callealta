package espanol.chaptertwo.variablesandscope;

/** Inferencia de tipos con var: ejemplos de variables locales y bucles. */
public class VarExample {

    public static void main(String[] args) {
        // Uso de var para declarar variables locales.

        // Tipo inferido: String.
        var message = "¡Hola, Java 10 y versiones posteriores!";

        // Tipo inferido: int.
        var number = 42;

        // Tipo inferido: double.
        var pi = 3.14159;

        // Tipo inferido: boolean.
        var isJavaFun = true;

        // Imprime las variables con tipo inferido.
        System.out.println(message);
        System.out.println("Número: " + number);
        System.out.println("Pi: " + pi);
        System.out.println("¿Java es divertido? " + isJavaFun);

        // Uso de var en un bucle.
        var fruits = new String[] { "Manzana", "Plátano", "Cereza" };
        String listStrings[] = { "hola", "mi", "amigo", "¿cómo", "estás", "tú?" };

        for (String string : listStrings) {
            System.out.print(string + " ");
        }
        System.out.println("");

        // El tipo de fruit se infiere como String.
        for (var fruit : fruits) {
            System.out.println("Fruta: " + fruit);
        }

        // var con un objeto cuyo tipo se infiere como PersonThree.
        var person = new PersonThree("Lawrence", 25);
        person.introduce();
    }
}

// Una clase sencilla que representa una persona.

class PersonThree {

    private String name;
    private int age;

    PersonThree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println(
                "Hola, soy " + name + " y tengo " + age + " años.");
    }
}