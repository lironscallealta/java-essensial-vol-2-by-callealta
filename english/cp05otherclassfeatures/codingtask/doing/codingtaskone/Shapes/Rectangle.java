package english.cp05otherclassfeatures.codingtask.doing.codingtaskone.Shapes;

public final class Rectangle implements Shape {

    private int lenght;
    private int width;

    Rectangle(int... sides){
        lenght = sides[0];
        width = sides[1];

    }

    public double getPerimeter() {
        return Math.round(2 * (lenght * width));
    }

    public double getArea() {
        return Math.round(lenght * width) ;
    }

    @Override
    public void getDetails() {
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("Lengh: " + this.lenght);
        System.out.println("Lengh: " + this.width);
        Shape.super.getDetails();
    }

}
