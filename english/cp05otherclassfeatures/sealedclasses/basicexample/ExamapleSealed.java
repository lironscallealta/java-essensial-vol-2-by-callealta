package english.cp05otherclassfeatures.sealedclasses.basicexample;

// Without "sealed", any class can implement Shapes.
interface OpenShapes {
}

// With "sealed", Shapes restricts which types can directly implement it.
// Only Circle and Rectangle are permitted.
sealed interface Shapes permits Circle, Rectangle {
}

// Because Circle is listed in "permits", it must directly implement Shapes.
// "final" means no other class can extend Circle.
final class Circle implements Shapes {
}

// Rectangle is also listed, so it must directly implement Shapes.
// "final" means no other class can extend Rectangle.
final class Rectangle implements Shapes {
}

// A permitted type must be a direct subtype of Shapes.
// It cannot just be listed in "permits" and then choose not to implement it.
//
// A permitted type must also declare what happens to its own subtypes:
// final     = no subclasses allowed
// sealed    = restrict its subclasses too
// non-sealed = allow any class to extend it