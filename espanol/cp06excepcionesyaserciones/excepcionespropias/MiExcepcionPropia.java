package espanol.cp06excepcionesyaserciones.excepcionespropias;

class ExcepcionComidaDesagradable extends Exception {
}

public class MiExcepcionPropia {

    private static boolean caramelo = false;
    private static boolean carameloAcido = true;

    public static void main(String[] args) {
        // 1. Java entra en main y empieza con el primer bloque try.
        try {
            System.out.println("Probando caramelo");

            // 2. Imagina una pausa aquí. caramelo vale false.
            // Entra en esAcido en A con saborAcido = false.
            // Ve de A a C y vuelve al paso 3.
            esAcido(caramelo);

            // 3. esAcido terminó normalmente y la ejecución continúa aquí.
            System.out.println("caramelo: esAcido terminó normalmente");

        } catch (ExcepcionComidaDesagradable btfe) {
            // Se omite este catch porque no se lanzó ninguna excepción.
            System.out.println("caramelo: se ejecutó el bloque catch");
        }

        // 4. Pasamos al segundo bloque try.
        try {
            System.out.println("Probando caramelo ácido");

            // 5. Imagina una pausa aquí. carameloAcido vale true.
            // Entra en esAcido en A con saborAcido = true.
            // Ve de A a B y salta al paso 6.
            esAcido(carameloAcido);

            // Se omite esta línea porque esAcido lanzó una excepción.
            System.out.println("carameloAcido: esAcido terminó normalmente");

        } catch (ExcepcionComidaDesagradable btfe) {
            // 6. Java encuentra el catch correspondiente y ejecuta su código.
            // La variable btfe contiene la excepción lanzada.
            System.out.println("carameloAcido: se ejecutó el bloque catch");
        }

        // 7. Llegamos al final de main.
    }

    private static void esAcido(boolean saborAcido)
            throws ExcepcionComidaDesagradable {
        // A. ¿saborAcido vale true? Si vale false, omite el if y ve a C.
        if (saborAcido) {
            // B. saborAcido vale true. Lanza la excepción y sale del método.
            throw new ExcepcionComidaDesagradable();
        }
        // C. El método llega al final y retorna normalmente.
    }
}