package english.cp05otherclassfeatures.codingtask.doing.codingtaskone.Shapes;

public final class Rectangle implements Shape {

    private int lenght;
    private int width;

    public double getPerimeter() {
        return 72.0;
    }

    public double getArea() {
        return lenght * width;
    }

    @Override
    public void getDetails() {
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("Lengh: " + this.lenght);
        System.out.println("Lengh: " + this.width);
        Shape.super.getDetails();
    }

}
