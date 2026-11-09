package english.c06exceptionsandassertions.parameterizedtryblock;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SampleIO {

    public static void main(String[] args) {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("What is your name?");
            String name = in.readLine();

            System.out.println("How old are you?");
            int age = Integer.parseInt(in.readLine());

            System.out.println("Hello " + name + ", next year you will be " + (age + 1) + " years old.");

            in.close();
        } catch (IOException ioe) {
            System.err.println("An exception occurred.");
        }
    }
}

// java.io: The specialist in external communication and files
// (reading disks, data streams, input/output errors like IOException).
// You have to import it when you need it.

// In short, when to use which?
// - Use Scanner when you are writing small programs, quick scripts, or when you
// need
// to read many mixed data types (int, double, String) easily and without
// writing
// so much conversion code.
// - Use BufferedReader when you are building high-performance applications,
// reading
// large files from the hard drive, or when you need to read entire lines of
// text
// as quickly as possible.

// Why use close() instead of exit()?
//
// 1. in.close() closes the input stream (BufferedReader / System.in) to release
// system resources. It only shuts down that specific reading tool, allowing
// the rest of your program to keep running normally.
//
// 2. System.exit(0) shuts down the entire Java Virtual Machine (JVM)
// immediately.
// It kills the whole application. If you used exit() right after reading a name
// and age, the program would close entirely instead of finishing its normal
// flow
// or printing the final greeting.