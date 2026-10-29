package espanol.chapterthree.staticandinstancemethods;

public class Calculator {

    // Método de instancia: crea un objeto para llamarlo.
    public int addWithObject(int a, int b) {
        return a + b;
    }

    // Método estático: llámalo utilizando el nombre de la clase.
    public static int addWithoutObject(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.addWithObject(3, 4);
        int result2 = Calculator.addWithoutObject(3, 4);

        System.out.println(result1);
        System.out.println(result2);
    }
}