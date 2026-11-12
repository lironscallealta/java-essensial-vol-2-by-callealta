package english.c06exceptionsandassertions.codingtask.doing.codingtaskone.Shapes;

public final class Triangle implements Shape {

    private int side1;
    private int side2;
    private int side3;

    Triangle(int... sides) {
        this.side1 = sides[0];
        this.side2 = sides[1];
        this.side3 = sides[2];
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        // 1. Check the triangle inequality: all three conditions must hold
        boolean isValid = (side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side2 + side3 > side1);

        if (!isValid) {
            System.out.println("Invalid triangle: the sum of any two sides must be greater than the third side.");
            return 0.0; // or throw: throw new IllegalArgumentException("Invalid triangle sides");
        }

        // 2. Calculate the area only if the triangle is valid
        double s = (side1 + side2 + side3) / 2.0;
        return Math.round(Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))) ;
    }

    @Override
    public void getDetails() {
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("side 1°: " + this.side1);
        System.out.println("side 2°: " + this.side2);
        System.out.println("side 3°: " + this.side3);
        Shape.super.getDetails();
    }

}
