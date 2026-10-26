package ChapterTwo.Methods;

/** Parámetros y argumentos: llamar a un método con distintos nombres. */
public class MethodWithParameters {

    // 'name' is a parameter and a local variable
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        MethodWithParameters example = new MethodWithParameters();

        // Passing "Lawrence" as an argument
        example.greet("Lawrence");

        // Passing "Michelle" as an argument
        example.greet("Michelle");
    }
}