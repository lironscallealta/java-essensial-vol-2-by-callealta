package espanol.cp02variablesreferenciasyconstructores.metodos;

/** Parámetros y argumentos: llamar a un método con distintos nombres. */
public class MetodoConParametros {

    // nombre es un parámetro y una variable local.
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static void main(String[] argumentos) {
        MetodoConParametros ejemplo = new MetodoConParametros();

        // Pasa "Lawrence" como argumento.
        ejemplo.saludar("Lawrence");

        // Pasa "Michelle" como argumento.
        ejemplo.saludar("Michelle");
    }
}