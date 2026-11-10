package english.c06exceptionsandassertions.codingtask.doing.codingtaskone.Shapes;

import english.cp05otherclassfeatures.codingtask.doing.codingtaskone.Shapes.CalculatorFigures;

public class TestShapes {

    public static void main(String[] args) {
        try {
            // 1. Check how many dimensions we received before reading them.
            if (args.length == 0) {
                throw new IllegalArgumentException("Pass one to three values via command line.");
            }
            if (args.length > 3) {
                throw new IllegalArgumentException("Limit your arguments to a maximum of 3 values.");
            }

            // 2. Convert each argument. parseInt throws if the input is not an integer.
            int[] dimensions = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                dimensions[i] = Integer.parseInt(args[i]);
                if (dimensions[i] < 0) {
                    throw new IllegalArgumentException("A negative value was passed.");
                }
                if (dimensions[i] == 0) {
                    throw new IllegalArgumentException("Dimensions must be greater than zero.");
                }
            }

            // 3. Valid dimensions reach the calculator from Chapter 5.
            CalculatorFigures.shapes(dimensions);
        } catch (NumberFormatException error) {
            // 4. Catch the more specific type first because it extends IllegalArgumentException.
            System.out.println("An argument contains a String value.");
            System.out.println("A NumberFormatException is caught.");
        } catch (IllegalArgumentException error) {
            // 5. Print the message from whichever argument check failed.
            System.out.println(error.getMessage());
            System.out.println("An IllegalArgumentException is caught.");
        }
    }
}
