package espanol.cp02variablesreferenciasyconstructores.variablesyalcance;
/** Variables locales: declarar y usar variables dentro de un método. */
public class EjemploVariableLocal {

    public void mostrarSuma() {
        int numero1 = 10;         // Variable local.
        int numero2 = 20;         // Variable local.
        int sumar = numero1 + numero2; // Variable local.

        System.out.println("Suma: " + sumar);
    }

    public static void main(String[] argumentos) {
        EjemploVariableLocal ejemplo = new EjemploVariableLocal();
        ejemplo.mostrarSuma();
    }
}