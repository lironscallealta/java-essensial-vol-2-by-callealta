package english.c06exceptionsandassertions.exceptionhanlding;

public class AddArgs3 {

    public static void main(String[] args) {

        int sum = 0;
        for (String arg : args) {

            try {

                sum += Integer.parseInt(arg);
            }
            catch (NumberFormatException nfe) {

                System.err.println(arg + " is not"
                         + " an int and will not "
                         + " be included in the sum ");
            }
        }
        System.out.println("Sum: " + sum);
    }
}
//with cmd terminal
// compile javac english\c06exceptionsandassertions\exceptionhanlding\AddArgs3.java
//or try direct
//java english\c06exceptionsandassertions\exceptionhanlding\AddArgs3.java 10 2.2 thirty 40