package english.c07javatextbasedaplications.stringformat;

import java.io.*;
import java.util.Scanner;

public class DisplayAverage {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = s.nextInt();
        System.out.println("Enter second number: ");
        int second = s.nextInt();
        double quotient = (double)first / second;
        String result = String.format("%6.2f", quotient);
        System.out.println("Quotient is: " + result);
        s.close();
    }
}