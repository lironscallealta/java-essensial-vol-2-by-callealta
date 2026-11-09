package english.c06exceptionsandassertions.trycatchblock;

public class AddArgs2 {

    public static void main(String[] args) {

        try {

            int sum = 0;
            for (String arg : args) {

                sum += Integer.parseInt(arg);
            }
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException nfe) {

            System.err.println("One of the values"
                    + " is not an integer.");
        }
    }
}

//try java english.c06exceptionsandassertions.AddArgs2 10 2.2 thirty 40



/* 
  
try {
// block of code to monitor for errors or statements
// that might cause an exception
}
catch(ExceptionType1 exOb) {
// exception handler for ExceptionType1 and / or
// statements to handle the Exception object
}
catch(ExceptionType2 exOb) {
// exception handler for ExceptionType2 and / or
// statements to handle the Exception object
}
finally {
// block of code to be executed even if no Exception
// occurred
}

*/


