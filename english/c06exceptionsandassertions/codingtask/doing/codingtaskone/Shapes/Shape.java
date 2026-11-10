package english.c06exceptionsandassertions.codingtask.doing.codingtaskone.Shapes;

sealed interface Shape permits Rectangle, Square, Circle, Triangle {

    double getPerimeter();

    double getArea();

    default void getDetails() {
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("area: " + getArea());
    }
}
