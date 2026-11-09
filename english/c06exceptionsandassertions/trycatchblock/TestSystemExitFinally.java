package english.c06exceptionsandassertions.trycatchblock;

public class TestSystemExitFinally {

    public static void main(String[] args) {
        
        try {
            System.out.println("Inside try block. Calling System.exit(0)...");
            System.exit(0);
        } catch (Exception e) {
            // This won't run because System.exit doesn't throw a catchable Exception
            System.out.println("Inside catch block..");
        } finally {
            // This will NOT execute because the JVM terminates immediately on System.exit(0)
            System.out.println("Inside finally block.. (You will never see this message)");
        }
        
        System.out.println("After try-catch-finally.. (This won't print either)");
    }
}