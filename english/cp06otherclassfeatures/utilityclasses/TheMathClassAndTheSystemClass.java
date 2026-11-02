package english.cp06otherclassfeatures.utilityclasses;

public class TheMathClassAndTheSystemClass {

    public static void main(String[] args) {
        System.out.println(Math.PI);

        System.out.println(Math.max(20, 30));
    }
    /*
     * Math and System have private constructors, so you cannot create
     * instances of these classes from your code. Access their public static
     * members through the class name, such as Math.PI and System.out.
     * System.out is a static field that refers to a PrintStream object;
     * println() is an instance method called on that object.
     */

}
