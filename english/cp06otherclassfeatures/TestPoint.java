package english.cp06otherclassfeatures;

// TestPoint.java

final class Point {

    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        boolean result = false;

        if (obj != null && obj instanceof Point) {
            Point p = (Point) obj;
            if (this.x == p.x && this.y == p.y) {
                result = true;
            }
        }

        return result;
    }

    public int hashCode() {
        return x ^ y;
    }

    public String toString() {
        return this.getClass().getName()
                + "[x=" + this.x + ", y=" + this.y + "]";
    }
}

public class TestPoint {

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(10, 20);

        System.out.println("Point 1 is at: "
                + p1.x + " and " + p1.y);
        System.out.println("Point 2 is at: "
                + p2.x + " and " + p2.y);
        System.out.println("Point 3 is at: "
                + p3.x + " and " + p3.y);

        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p3);

        System.out.println("Comparing p1 and p2: "
                + p1.equals(p2));
        System.out.println("Comparing p2 and p3: "
                + p2.equals(p3));
    }
}