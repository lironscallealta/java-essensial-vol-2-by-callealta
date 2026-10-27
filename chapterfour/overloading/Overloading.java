package chapterfour.overloading;

public class Overloading {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));         // 30
        System.out.println(sum(10, 20, 30));     // 60
        System.out.println(sum(10, 20, 30, 40)); // 100
        System.out.println(sum(1.5, 2.5));       // 4.0
    }

    /*
     * METHOD OVERLOADING
     *
     * Methods have the same name but different parameter lists.
     * They can differ in:
     * - Number of parameters.
     * - Parameter types.
     * - Order of different parameter types.
     *
     * Parameter names and return types do not distinguish overloads.
     */

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Valid overload: three parameters instead of two.
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Valid overload: four parameters.
    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    // Valid overload: two double parameters instead of two int parameters.
    // The different parameter types make this an overload.
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    /*
     * INVALID: changing only parameter names does not create an overload.
     * This would duplicate the existing signature: sum(int, int).
     *
     * public static int sum(int first, int second) {
     *     return first + second;
     * }
     */

    /*
     * INVALID: changing only the return type does not create an overload.
     * This would also duplicate the existing signature: sum(int, int).
     *
     * public static double sum(int a, int b) {
     *     return a + b;
     * }
     */
}