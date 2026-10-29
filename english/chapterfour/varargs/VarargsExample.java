package english.chapterfour.varargs;

public class VarargsExample {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));         // 30
        System.out.println(sum(10, 20, 30));     // 60
        System.out.println(sum(10, 20, 30, 40)); // 100
        System.out.println(sum());              // 0

        // A varargs method can also receive an existing array.
        int[] values = {5, 10, 15};
        System.out.println(sum(values));        // 30
    }

    /*
     * VARARGS: VARIABLE ARGUMENTS
     *
     * int... numbers accepts zero or more int values.
     * Inside the method, numbers is an int[] array.
     *
     * Examples:
     * sum(10, 20)     -> numbers contains {10, 20}
     * sum(10, 20, 30) -> numbers contains {10, 20, 30}
     * sum()           -> numbers is an empty array
     *
     * Rules:
     * 1. A method can have only one varargs parameter.
     * 2. The varargs parameter must be the last parameter.
     *
     * Valid:   show(String title, int... numbers)
     * Invalid: show(int... numbers, String title)
     * Invalid: show(int... numbers, double... values)
     */

    public static int sum(int... numbers) {
        // Start a new total for each method call.
        int total = 0;

        // Take each value from the array, one at a time.
        for (int number : numbers) {
            // Equivalent to: total = total + number;
            total += number;
        }

        // If no arguments were passed, the loop runs zero times
        // and the method returns the initial total: 0.
        return total;
    }
}