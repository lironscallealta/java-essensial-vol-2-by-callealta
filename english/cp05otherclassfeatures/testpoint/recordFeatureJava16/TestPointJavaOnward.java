package english.cp05otherclassfeatures.testpoint.recordFeatureJava16;

public class TestPointJavaOnward {

    // Records became a standard feature in Java 16.
    // They were available as a preview feature in Java 14 and 15.
    //
    // A record automatically provides:
    // - Private final fields and a constructor.
    // - Public accessor methods: x() and y().
    // - equals(), hashCode(), and toString().
    //
    // Accessors use the component names without the "get" prefix:
    // x() instead of getX(), and y() instead of getY().
    // The fields remain private; these methods let us read their values.
    // No setters are generated.
    //
    // Records are implicitly final.
    // A nested record is also implicitly static.
    record Point(int x, int y) { }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(10, 20);

        // x() and y() are the generated accessors, equivalent in purpose to getters.
        System.out.println("Point 1 is at: "
                + p1.x() + " and " + p1.y());
        System.out.println("Point 2 is at: "
                + p2.x() + " and " + p2.y());
        System.out.println("Point 3 is at: "
                + p3.x() + " and " + p3.y());

        // The generated toString() produces text such as Point[x=10, y=20].
        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p3);

        // The generated equals() compares the record's component values.
        System.out.println("Comparing p1 and p2: "
                + p1.equals(p2));
        System.out.println("Comparing p2 and p3: "
                + p2.equals(p3));
    }
}