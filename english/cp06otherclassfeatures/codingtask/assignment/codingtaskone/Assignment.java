package english.cp06otherclassfeatures.codingtask.assignment.codingtaskone;

public class Assignment {
    /*
     * # Coding Task 1: Shapes
     *
     * ## Description
     *
     * Create a program that accepts numeric inputs through command-line arguments. All inputs must be integers greater than zero. Decide which shape to create based on the number of inputs:
     *
     * - One input: a circle.
     * - Two inputs: a square or a rectangle.
     * - Three inputs: a triangle.
     *
     * Display the shape type, details, perimeter, and area. Follow the supplied UML diagram. For a rectangle, length is greater than width.
     *
     * ## UML requirements
     *
     * The diagram shows the interface `Shape`, implemented by `Circle`, `Triangle`, `Rectangle`, and `Square`.
     *
     * - `Shape`: public methods `getPerimeter(): double`, `getArea(): double`, and `getDetails(): void`.
     * - `Circle`: private `PI: float (3.14)` and `radius: int`; the three public methods above.
     * - `Triangle`: private `side1: int`, `side2: int`, and `side3: int`; the three public methods above.
     * - `Rectangle`: private `length: int` and `width: int`; the three public methods above.
     * - `Square`: private `side: int`; the three public methods above.
     *
     * The source text asks for `Shapes.java`, `Circle.java`, `Rectangle.java`, `Square.java`, and `Triangle.java`, plus a test class `TestShapes.java` with a `main` method that accepts command-line arguments.
     *
     * **Source naming note:** the diagram says `Shape` (singular), while the file list says `Shapes.java` (plural). Both spellings are preserved here so the difference remains visible; no solution is supplied.
     *
     * ## Sample runs from the source
     *
     * These are expected examples, not an implementation. Commands are reproduced as printed in the book, without this repository's package prefix.
     *
     * ```text
     * java TestShapes 15
     * Type: Circle
     * Radius: 15
     * Perimeter: 94.2
     * Area: 706.5
     *
     * java TestShapes 12 24
     * Type: Rectangle
     * Length: 24
     * Width: 12
     * Perimeter: 72.0
     * Area 288.0
     *
     * java TestShapes 24 12
     * Type: Rectangle
     * Length: 24
     * Width: 12
     * Perimeter: 72.0
     * Area 288.0
     *
     * java TestShapes 12 12
     * Type: Square
     * Side: 12
     * Perimeter: 48.0
     * Area 144.0
     *
     * java TestShapes 9 15 12
     * Type: Triangle
     * Side1: 9
     * Side2: 15
     * Side3: 12
     * Perimeter: 36.0
     * Area 54.0
     *
     * java TestShapes 9 15 12 8
     * Invalid Input
     * ```
     *
     * For the triangle area, the source requests [Heron's formula](https://www.mathsisfun.com/geometry/herons-formula.html).
     */
}
