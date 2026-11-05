package english.cp06otherclassfeatures.codingtask.doing.codingtaskone.Shapes;

sealed interface Shape permits Rectangle, Square, Circle, Triangle  {

    double getPerimeter();

    double getArea();

    void getDetails();
}
