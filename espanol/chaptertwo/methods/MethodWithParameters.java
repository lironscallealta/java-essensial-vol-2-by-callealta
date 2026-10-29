package espanol.chaptertwo.methods;

/** Parámetros y argumentos: llamar a un método con distintos nombres. */
public class MethodWithParameters {

    // name es un parámetro y una variable local.
    public void greet(String name) {
        System.out.println("Hola, " + name + "!");
    }

    public static void main(String[] args) {
        MethodWithParameters example = new MethodWithParameters();

        // Pasa "Lawrence" como argumento.
        example.greet("Lawrence");

        // Pasa "Michelle" como argumento.
        example.greet("Michelle");
    }
}