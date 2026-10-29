package espanol.cp02variablesreferenciasyconstructores.variablesyalcance;

/** Alcance: una variable declarada dentro de un bloque solo existe en ese bloque. */
public class EjemploAlcanceDeBloque {

    public static void main(String[] argumentos) {
        // Esta variable está disponible
        // en todo el método main.
        int variableExterna = 5;

        if (variableExterna > 0) {
            // Variable local de este bloque if.
            int variableInterna = 10;
            System.out.println("Variable interna: " + variableInterna);
        }

        // Usarla aquí causaría un error de compilación.
        // System.out.println(variableInterna);
    }
}
