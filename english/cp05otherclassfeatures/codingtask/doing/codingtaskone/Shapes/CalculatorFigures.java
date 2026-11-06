package english.cp05otherclassfeatures.codingtask.doing.codingtaskone.Shapes;

public class CalculatorFigures {

    public static void shapes(int... inputs) {

        int totalLenght = inputs.length;

        if (totalLenght == 3) {
            Triangle triangle = new Triangle(inputs);
            triangle.getDetails();
        } else if (totalLenght == 2 && (inputs[0] - inputs[1] == 0)) {
            Square square = new Square(inputs[0]);
            square.getDetails();

        }

        else if (totalLenght == 2 && (inputs[0] - inputs[1] != 0)) {
            Rectangle rectangle = new Rectangle(inputs);
            rectangle.getDetails();

        }

        else if (totalLenght == 1) {
            Circle circle = new Circle(inputs[0]);
            circle.getDetails();

        }
    }

}
