package english.cp05otherclassfeatures.codingtask.doing.codingtaskone.Shapes;

public final class Square implements Shape {

    private int side;

    Square(int side) {
        this.side = side;
    }

    public double getPerimeter() {
        return Math.round(4 * side);
    }

    public double getArea() {
        return Math.round(side * side);
    }

    @Override
    public void getDetails() {
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("side: " + this.side);
        Shape.super.getDetails();
    }

}
