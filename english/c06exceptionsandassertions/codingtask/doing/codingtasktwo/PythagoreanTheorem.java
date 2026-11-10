package english.c06exceptionsandassertions.codingtask.doing.codingtasktwo; // Places the exercise in Chapter 6.

import java.util.InputMismatchException; // Handles input that cannot be read as a double.
import java.util.Scanner; // Reads values from the console.

public class PythagoreanTheorem { // Defines the program.
    public static void main(String[] args) { // Starts the program.
        try (Scanner scanner = new Scanner(System.in)) { // Opens the scanner and closes it when we leave the try.
            System.out.println("Enter side a:"); // Asks for the first side.
            double a = readSide(scanner, "a"); // Reads and checks the first side.
            System.out.println("Enter side b:"); // Asks for the second side.
            double b = readSide(scanner, "b"); // Reads and checks the second side.
            double c = Math.hypot(a, b); // Computes the square root of a squared plus b squared.
            System.out.println("c = " + c); // Displays the hypotenuse.
        } catch (InputMismatchException error) { // Handles a value that is not numeric.
            System.out.println("Enter a numeric value for each side."); // Explains how to fix the input.
        } catch (IllegalArgumentException error) { // Handles a negative side.
            System.out.println(error.getMessage()); // Displays the message for the side that failed.
        } // Ends the exception handling.
    } // Ends main.

    private static double readSide(Scanner scanner, String side) { // Reads and validates one side.
        double value = scanner.nextDouble(); // Throws InputMismatchException if the next value is not numeric.
        if (value < 0) { // Checks whether this side is negative.
            throw new IllegalArgumentException("Side " + side + " cannot be negative."); // Stops and identifies the invalid side.
        } // Ends the negative check.
        return value; // Returns the validated side.
    } // Ends readSide.
} // Ends the program class.
