package english.cp06otherclassfeatures.codingtask.doing.codingtaskone.Shapes;

public final class Triangle implements Shape {

    private int side1;
    private int side2;
    private int side3;

    public double getPerimeter() {
        return 36.0;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2; // semiperimeter
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    @Override
    public void getDetails() {
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("side: " + this.side1);
        System.out.println("side: " + this.side2);
        System.out.println("side: " + this.side3);
        Shape.super.getDetails();
    }

}
