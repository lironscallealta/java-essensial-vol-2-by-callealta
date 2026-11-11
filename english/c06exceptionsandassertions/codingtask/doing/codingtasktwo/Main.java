package english.c06exceptionsandassertions.codingtask.doing.codingtasktwo;

import static english.c06exceptionsandassertions.codingtask.doing.codingtasktwo.Pythagorean.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("right number 1: ");
            double n1 = input.nextDouble();
            if (n1 < 0) {
                throw new IllegalArgumentException();
            }

            System.out.println("right number 2: ");
            double n2 = input.nextDouble();
            if (n2 < 0) {
                throw new IllegalArgumentException();

            }

            System.out.println("Result is: ");
            System.out.println(pythagoreanTheorem(n1, n2));

        } catch (IllegalArgumentException e) {
            System.err.println("negative value");
        } catch (InputMismatchException e) {
            System.err.println("String is not allowed");
        }

    }

}
