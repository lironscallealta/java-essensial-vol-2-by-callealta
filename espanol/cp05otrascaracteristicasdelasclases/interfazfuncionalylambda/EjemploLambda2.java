package espanol.cp05otrascaracteristicasdelasclases.interfazfuncionalylambda;

public class EjemploLambda2 {
    // La anotación comprueba que la interfaz tenga un único método abstracto.
    // Es opcional, pero ayuda a detectar cambios accidentales.
    @FunctionalInterface
    interface Operacion {
        // Recibe dos enteros y devuelve un entero.
        int calcular(int a, int b);
    }

    public static void main(String[] args) {
        // La lambda implementa calcular(). Recibe dos parámetros y los suma.
        // Java deduce sus tipos a partir del método de la interfaz.
        Operacion suma = (a, b) -> a + b;
        System.out.println(suma.calcular(3, 4)); // 7

        // Debemos declarar ambos parámetros, pero no tenemos que usarlos.
        // Esta implementación siempre devuelve 8.
        Operacion fija = (a, b) -> 8;
        System.out.println(fija.calcular(3, 4));   // 8
        System.out.println(fija.calcular(10, 20)); // 8

        // Una expresión devuelve su resultado automáticamente.
        // Un cuerpo con llaves requiere escribir return explícitamente.
        Operacion fijaConBloque = (a, b) -> {
            return 8;
        };
        System.out.println(fijaConBloque.calcular(1, 2)); // 8

        // El valor devuelto debe coincidir con el tipo de retorno del método.
        // Esto fallaría porque calcular() debe devolver int:
        // Operacion invalida = (a, b) -> "Hola";

        // Crear la lambda define el comportamiento.
        // Llamar a calcular(...) ejecuta ese comportamiento.
    }
}
