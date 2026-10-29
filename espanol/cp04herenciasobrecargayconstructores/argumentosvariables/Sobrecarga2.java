package espanol.cp04herenciasobrecargayconstructores.argumentosvariables;

// Notación de argumentos variables (argumentosvariables).

public class Sobrecarga2 {

    public static void main(String[] argumentos) {
        System.out.println(sumar(10, 20));
        System.out.println(sumar(10, 20, 30));
        System.out.println(sumar(10, 20, 30, 40));
        System.out.println(sumar(1.0, 2.0, 3.0, 4.0));
    }

    public static int sumar(int... numeros) {
        int total = 0;

        for (int n : numeros) {
            total += n;
        }

        return total;
    }

    public static double sumar(double... numeros) {
        double total = 0;

        for (double n : numeros) {
            total += n;
        }

        return total;
    }
}