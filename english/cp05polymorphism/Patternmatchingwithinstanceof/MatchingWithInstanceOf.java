package english.cp05polymorphism.Patternmatchingwithinstanceof;

public class MatchingWithInstanceOf {

    public static void main(String[] args) {
        Object data = "Patterm Matching in java";
        if (data instanceof String str) {
            System.out.println("Length = " + str.length() + " Characters");

        }

    }

}
