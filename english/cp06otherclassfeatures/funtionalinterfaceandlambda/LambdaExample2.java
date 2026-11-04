package english.cp06otherclassfeatures.funtionalinterfaceandlambda;

public class LambdaExample2 {

    // This annotation checks that the interface has one abstract method.
    // It is optional, but helps prevent accidental changes.
    @FunctionalInterface
    interface Operation {

        // Receives two integers and returns an integer.
        int calculate(int a, int b);
    }

    public static void main(String[] args) {

        // The lambda implements calculate().
        // It receives two parameters and returns their sum.
        // Java infers their types from the interface method.
        Operation addition = (a, b) -> a + b;

        System.out.println(addition.calculate(3, 4)); // 7

        // We must declare both parameters, but we do not have to use them.
        // This implementation always returns 8.
        Operation fixed = (a, b) -> 8;

        System.out.println(fixed.calculate(3, 4));   // 8
        System.out.println(fixed.calculate(10, 20)); // 8

        // With a single expression, the result is returned automatically.
        // With a block body, we must write return explicitly.
        Operation fixedWithBlock = (a, b) -> {
            return 8;
        };

        System.out.println(fixedWithBlock.calculate(1, 2)); // 8

        // The returned value must match the method's return type.
        // This would fail because calculate() must return int, not String:
        // Operation invalid = (a, b) -> "Hello";

        // Creating the lambda defines the behavior.
        // Calling calculate(...) executes that behavior.
    }
}
