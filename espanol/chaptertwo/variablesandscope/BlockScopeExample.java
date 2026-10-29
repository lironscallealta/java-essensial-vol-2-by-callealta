package espanol.chaptertwo.variablesandscope;

/** Alcance: una variable declarada dentro de un bloque solo existe en ese bloque. */
public class BlockScopeExample {

    public static void main(String[] args) {
        // Esta variable está disponible
        // en todo el método main.
        int outerVariable = 5;

        if (outerVariable > 0) {
            // Variable local de este bloque if.
            int innerVariable = 10;
            System.out.println("Variable interna: " + innerVariable);
        }

        // Usarla aquí causaría un error de compilación.
        // System.out.println(innerVariable);
    }
}
