package chapterfour.overloading;

public class Overloading {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}

  /*
    public static int sum(int first, int second) {
        return first + second;
    }
    */

    // INVALID: changing only the return type does not create an overload.
    /*
    public static double sum(int a, int b) {
        return a + b;
    }
    */
