package english.c06exceptionsandassertions.createyourownexception;

import java.util.Scanner;

class LoginException extends RuntimeException { // unchecked exception
}

public class MyOtherExceptionExample {
    private static String username = "admin";
    private static String password = "password";

    public static void main(String[] args) {
        // try-with-resources ensures Scanner
        // is closed automatically
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter your username: ");
            String uname = s.nextLine();

            System.out.println("Enter your password: ");
            String pword = s.nextLine();

            if (uname.equals(username) && pword.equals(password)) {
                System.out.println("Access Granted");
            } else {
                throw new LoginException();
            }
        } catch (LoginException ae) {
            System.err.println("Incorrect username / password");
        }
    }
}