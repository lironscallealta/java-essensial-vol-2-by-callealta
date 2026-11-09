package english.c06exceptionsandassertions.exceptionhanlding;

public class AddArgs {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("Sum: " + sum);
    }
}
//with cmd terminal
// java english/c06exceptionsandassertions/exceptionhanlding/AddArgs.java
// AddArgs 10 20 30 40

// or
// java english.c06exceptionsandassertions.exceptionhanlding.AddArgs 10 20 30 40

//Try this to hace error with non-integer
// java english.c06exceptionsandassertions.exceptionhanlding.AddArgs 10 2.2 thirty 40
