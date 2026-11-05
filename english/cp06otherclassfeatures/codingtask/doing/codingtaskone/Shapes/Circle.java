package english.cp06otherclassfeatures.codingtask.doing.codingtaskone.Shapes;

public final class Circle implements Shape {

    private final float PI = 3.14F;
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return Math.round(2 * PI * radius);
    }

    public double getArea() {
        return Math.round(PI * Math.pow(radius, 2));
    }

    @Override
    public void getDetails() {
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("Radius: " + this.radius);
        Shape.super.getDetails();
    }

}
