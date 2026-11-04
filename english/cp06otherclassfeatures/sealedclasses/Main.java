package english.cp06otherclassfeatures.sealedclasses;

// A sealed interface restricts which classes can implement it.
// Only the classes listed after "permits" are allowed.
sealed interface Shapes permits Circle, Rectangle {
}

// A permitted class must be declared final, sealed, or non-sealed.
// "final" means no other class can extend Circle.
final class Circle implements Shapes {
    int radius = 3;
}

// "final" also prevents other classes from extending Rectangle.
final class Rectangle implements Shapes {
    int width = 4, height = 5;
}

// Sealed classes and interfaces became a standard feature in Java 17.

public class Main {
    public static void describeShape(Shapes shape) {
        if (shape instanceof Circle c) {
            System.out.println("Circle with radius " + c.radius);
        } else if (shape instanceof Rectangle r) {
            System.out.println("Rectangle of " + r.width + " x " + r.height);
        }

    }

    public static void main(String[] args) {
        describeShape(new Circle());
        describeShape(new Rectangle());
    }
}
