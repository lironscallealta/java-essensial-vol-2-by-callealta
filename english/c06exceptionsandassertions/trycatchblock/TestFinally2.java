package english.c06exceptionsandassertions.trycatchblock;

public class TestFinally2 {

    public static void main(String[] args) {

        System.out.println("Enter the for loop..");
        for (int i = 1; i <= 5; i++) {

            try {

                if (i == 2)
                    break;
                System.out.println("i = " + i);
            } catch (Exception e) {

                System.out.println("inside catch block..");
            } finally {
                System.out.println("inside the " +
                        "finally block..");
            }
        }
        System.out.println("after the loop..");
    }
}

/*
 * The finally block in Java is generally executed regardless of what happens
 * within the try or catch blocks. However, there are a few scenarios where it
 * might not run:
 * 
 * 1. Calling System.exit(0):
 * If System.exit(0) is called within the try or catch blocks, the JVM
 * terminates
 * immediately, causing the program to shut down before the finally block can
 * execute.
 * 
 * 2. Fatal System/JVM Crashes:
 * If the program crashes due to a severe hardware or system-level failure, such
 * as
 * running out of memory (OutOfMemoryError), the JVM dies instantly, preventing
 * the finally block from running.
 */