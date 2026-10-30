package english.cp05polymorphism.Patternmatchingwithinstanceof;

public class MatchingWithInstanceOf {

    public static void main(String[] args) {
        Object data = "Patterm Matching in java";
        if (data instanceof String str) {
            System.out.println("Length = " + str.length() + " Characters");

        }
        /*
         * Here's another example for matching a custom class:
         * 
         * if (shape instanceof Circle c) {
         * 
         * System.out.println("Radius: " + c.getRadius());
         * 
         * }
         */

        Object obj = "Hello java";
        var objTwo = "hi";

        if (obj instanceof String str && str.length() > 5) {
            System.out.println("String 'srt 'is longar than 5 characters: " + str);

        } else {
            System.out.println("String 'srt 'is shorter than 5 characters: " + obj);
        }

        if (objTwo instanceof String str && str.length() > 5) {
            System.out.println("String 'srt 'is longar than 5 characters: " + str);

        } else {
            System.out.println("String 'srt 'is shorter than 5 characters: " + objTwo);
        }

    }

}
