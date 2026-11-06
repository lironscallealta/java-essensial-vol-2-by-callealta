package english.cp05otherclassfeatures.testpoint.recordFeatureJava16;

public class PointWithMethodExample {

    record Point(int x, int y) {

        // The record body can contain additional methods.
        public int sum() {
            return x + y;
        }
    }

    public static void main(String[] args) {
        Point point = new Point(10, 20);

        System.out.println(point.x());   // 10 — generated accessor
        System.out.println(point.y());   // 20 — generated accessor
        System.out.println(point.sum()); // 30 — our custom method
    }
}