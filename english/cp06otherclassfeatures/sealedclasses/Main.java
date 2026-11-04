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
    int width = 4;
    int height = 5;
}

// Sealed classes and interfaces became a standard feature in Java 17.

public class Main {
    public static void describeShape(Shapes shape) {
        

    }
}
