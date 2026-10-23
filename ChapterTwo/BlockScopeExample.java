package ChapterTwo;

public class BlockScopeExample {

    public static void main(String[] args) {
        // This variable exists in
        // the entire main method.
        int outerVariable = 5;

        if (outerVariable > 0) {
            // Local to this if block
            int innerVariable = 10;
            System.out.println("Inner Variable: " + innerVariable);
        }

        // If used, would cause a compilation error
        // System.out.println(innerVariable);
    }
}
