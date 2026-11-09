package english.c06exceptionsandassertions.keywordassertions;


public class TestAssert {
    public static void main(String[] args) {
        // 1. If we run with 15 30, args[0] is "15" and args[1] is "30".
        // parseInt converts each String into an int.
        int hour = Integer.parseInt(args[0]); // hour = 15
        int mins = Integer.parseInt(args[1]); // mins = 30

        // 2. Is 15 greater than 0 AND less than 24? Yes. Continue.
        assert hour > 0 && hour < 24 : "Invalid hour value";

        // 3. Is 30 greater than 0 AND less than 60? Yes. Continue.
        assert mins > 0 && mins < 60 : "Invalid mins value";

        // 4. Both checks passed. Print 15:30.
        System.out.println(hour + ":" + mins);
    }
}
// -ea stands for "enable assertions".
// Java skips assert statements by default.
// Put -ea before the .java file to enable assertions for this run.
//
// Without -ea, Java skips both assertions and prints 105:80:
// java english\c06exceptionsandassertions\keywordassertions\TestAssert.java 105 80
//
// With -ea, Java checks the first assertion. Since 105 < 24 is false,
// it throws AssertionError: Invalid hour value and stops:
// java -ea english\c06exceptionsandassertions\keywordassertions\TestAssert.java 105 80


