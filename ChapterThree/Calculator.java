package ChapterThree;

public class Calculator {

    // Instance method: create an object to call it
    public int addWithObject(int a, int b) {
        return a + b;
    }

    // Static method: call it using the class name
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