package english.cp06otherclassfeatures.testpoint;

// Java 14-compatible example. This syntax is still valid in newer Java versions.

// final prevents other classes from extending Point.
// Point implicitly extends Object.
final class Point {

    // Each coordinate can be assigned only once.
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Overrides Object.equals(): points are equal when their coordinates match.
    //
    // In p1.equals(p2):
    // this refers to p1, and obj refers to p2.
    //
    // Object allows any object as an argument, including a String.
    // Being inside Point does not guarantee that obj is also a Point.
    public boolean equals(Object obj) {
        boolean result = false;

        // Check that the argument is a Point before accessing its coordinates.
        // instanceof already rejects null, so obj != null is optional here.
        if (obj != null && obj instanceof Point) {

            // Cast the reference to Point so we can access x and y.
            // This does not create a new object.
            Point p = (Point) obj;

            // Compare this point's coordinates with the argument's coordinates.
            if (this.x == p.x && this.y == p.y) {
                result = true;
            }
        }

        return result;
    }

    // Equal points must produce the same hash code.
    public int hashCode() {
        // ^ is bitwise XOR: each result bit is 1 when the input bits differ.
        //
        // 10: 01010
        // 20: 10100
        // -----
        // 30: 11110
        //
        // Different points can share a hash code; it is not a unique ID.
        return x ^ y;
    }

    // Defines the text representation used when printing a Point.
    public String toString() {
        // getName() includes the package name.
        return this.getClass().getName()
                + "[x=" + this.x + ", y=" + this.y + "]";
    }
}

public class TestPoint {

    public static void main(String[] args) {

        // Three separate objects; p2 and p3 have matching coordinates.
        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(10, 20);

        System.out.println("Point 1 is at: "
                + p1.x + " and " + p1.y);
        System.out.println("Point 2 is at: "
                + p2.x + " and " + p2.y);
        System.out.println("Point 3 is at: "
                + p3.x + " and " + p3.y);

        // Printing a Point automatically uses its toString() method.
        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p3);

        // Different coordinates: false.
        System.out.println("Comparing p1 and p2: "
                + p1.equals(p2));

        // Matching coordinates, even though they are separate objects: true.
        System.out.println("Comparing p2 and p3: "
                + p2.equals(p3));
    }
}