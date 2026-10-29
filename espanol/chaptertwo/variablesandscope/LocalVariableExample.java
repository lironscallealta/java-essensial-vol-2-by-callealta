package espanol.chaptertwo.variablesandscope;
/** Variables locales: declarar y usar variables dentro de un método. */
public class LocalVariableExample {

    public void displaySum() {
        int num1 = 10;         // Variable local.
        int num2 = 20;         // Variable local.
        int sum = num1 + num2; // Variable local.

        System.out.println("Suma: " + sum);
    }

    public static void main(String[] args) {
        LocalVariableExample example = new LocalVariableExample();
        example.displaySum();
    }
}