package english.c06exceptionsandassertions.keywordthrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SampleIO3 {

    /*
     * ==========================================
     * SUMMARY OF THIS APPROACH (Throws vs. Try-Catch)
     * ==========================================
     * 
     * 1. WHAT CHANGED COMPARED TO THE PREVIOUS CODE?
     * - The try-catch block has completely disappeared.
     * - Instead, we added "throws IOException" to the main method signature.
     * 
     * 2. WHAT IS THAT FLOATING "THROWS IOException"?
     * - It is an official warning (a contract with the compiler). The method
     * "washes its hands" and says: "I am not catching reading errors here.
     * If the console or system fails, I am passing the hot potato to whoever called
     * me."
     * 
     * 3. WHAT DO YOU GAIN WITH THIS?
     * - Code cleanliness: You avoid cluttering your script with repetitive
     * try-catch blocks,
     * keeping the main logic direct, clean, and very easy to read.
     * - Ideal for quick tests or scripts where you prefer the application to crash
     * and show the error in the console rather than writing extra error-handling
     * code.
     * 
     * 4. WATCH OUT FOR THE ACHILLES' HEEL!
     * - If you type letters instead of a number for the age, this WILL STILL CRASH
     * with a NumberFormatException. Why? Because "throws IOException" only covers
     * input/output issues, not text-to-number conversion errors (RuntimeException).
     */

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        String name = in.readLine();

        System.out.println("How old are you?");
        int age = Integer.parseInt(in.readLine());

        System.out.println("Hello " + name + ", next year you will be " + (age + 1) + " years old.");

        in.close();
    }
}
