package english.cp04inheritanceoverloadingandconstructors.varargs;

//var-args notation

public class Overloading2 {

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(1.0, 2.0, 3.0, 4.0));
    }

    public static int sum(int... num) {
        int total = 0;

        for (int n : num) {
            total += n;
        }

        return total;
    }

    public static double sum(double... num) {
        double total = 0;

        for (double n : num) {
            total += n;
        }

        return total;
    }
}