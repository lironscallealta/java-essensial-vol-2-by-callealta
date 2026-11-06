package english.cp05otherclassfeatures.javainterfaces;

public class JavaInterface {
    // all variables are public static final
    /*
     * Take note that interfaces cannot have constructors.
     * It would be senseless to have a constructor because we cannot create an
     * object from an interface. A
     * n interface can also extend other interfaces. In an event that there are
     * multiple interfaces that need to be extended,
     * a comma is needed to separate the inherited interfaces.
     */
    interface I1 {
        double pi = 3.14;
    }

    interface I2 {
        public double pi = 3.14;
    }

    interface I3 {
        static double pi = 3.14;
    }

    interface I4 {
        final double pi = 3.14;
    }

    interface I5 {
        public static double pi = 3.14;
    }

    interface I6 {
        public static final double pi = 3.14;
    }

    interface I7 {
        public final double pi = 3.14;
    }

    // Interfaces can extend multiple interfaces.
    // Classes can extend only one class, but implement multiple interfaces.
    //
    // Interface fields are always public static final.
    // Interface methods follow different rules: an ordinary method
    // declared without a body is implicitly public abstract.

    public static void main(String[] args) {
        System.out.println(I1.pi); // 3.14

        // I1.pi = 5; // Compilation error: the field is final.
    }
}