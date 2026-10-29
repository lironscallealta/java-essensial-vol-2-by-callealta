package english.chaptertwo.variablesandscope;
/** Variables locales: declarar y usar variables dentro de un método. */
public class LocalVariableExample {

    public void displaySum() {
        int num1 = 10;         // Local variable
        int num2 = 20;         // Local variable
        int sum = num1 + num2; // Local variable

        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        LocalVariableExample example = new LocalVariableExample();
        example.displaySum();
    }
}