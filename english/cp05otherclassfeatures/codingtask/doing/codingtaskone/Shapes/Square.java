package english.cp05otherclassfeatures.codingtask.doing.codingtaskone.Shapes;

public final class Square implements Shape {

    private int side;

    public double getPerimeter() {
        return 48.0;
    }

    public double getArea() {
        return side * side;
    }

   
    @Override
    public void getDetails() {
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("side: " + this.side);
        Shape.super.getDetails();
    }

}
