package english.c06exceptionsandassertions.codingtask.doing.codingtasktwo;


import static java.lang.Math.round;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double a = readSide(input, "a");
            double b = readSide(input, "b");
            double c = Pythagorean.pythagoreanTheorem(a, b);
            System.out.println("c = " +  round(c));
        } catch (InputMismatchException e) {
            System.err.println("Enter a numeric value for each side.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private static double readSide(Scanner input, String side) {
        System.out.println("Enter side " + side + ":");
        double value = input.nextDouble();

        if (value < 0) {
            throw new IllegalArgumentException("Side " + side + " cannot be negative.");
        }

        return value;
    }
}
