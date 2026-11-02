package english.cp06otherclassfeatures;

public class TheMathClassAndTheSystemClass {

    public static void main(String[] args) {
        System.out.println(Math.PI);

        System.out.println(Math.max(20, 30));
    }
    /*
     * In addition, the Math and System classes are the only classes that do not
     * have any constructors in them, not even the default constructors. Neither the
     * Math nor System classes have a public constructor. In fact, their constructor
     * is private. The reason behind this is that all methods in both the Math class
     * and the System classes are static, and therefore no object instance is needed
     * to access the class members—both attributes and methods. They are designed so
     * that you never make objects from them. Instead, you access their features
     * directly through class name + static members.
     */

}
