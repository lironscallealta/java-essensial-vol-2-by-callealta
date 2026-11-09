package english.c06exceptionsandassertions.parameterizedtryblock;

import java.io.*;

public class SampleIO2 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("What is your name?");
            String name = in.readLine();

            System.out.println("How old are you?");
            int age = Integer.parseInt(in.readLine());

            System.out.println("Hello " + name + ", next year you will be "
                    + (age + 1) + " years old.");
        }
    }
}

/*
 * Notice that in lines 7 and 8, you have a try block that has parameters in it.
 * The object BufferedReader in that was declared inside the try block parameter
 * is considered a resource and will be closed automatically after the try block
 * is finished in line 17. No need to call the in.close() method because all
 * resources declared inside the parameterized try block will be closed as long
 * as those objects are
 */