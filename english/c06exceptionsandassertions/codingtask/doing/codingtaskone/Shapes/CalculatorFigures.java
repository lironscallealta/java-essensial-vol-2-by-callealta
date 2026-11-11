package english.c06exceptionsandassertions.codingtask.doing.codingtaskone.Shapes;
public class CalculatorFigures {

    public static void shapes(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        shapes(numbers);
    }

    public static void shapes(int... inputs) {

        int totalLenght = inputs.length;
        if (totalLenght == 0) {
            throw new IllegalArgumentException("Pass one to three values via command line.");
        }
        if (totalLenght > 3) {
            throw new IllegalArgumentException("Limit your arguments to a maximum of 3 values.");
        }
        for (int number : inputs) {
            if (number < 0) {
                throw new IllegalArgumentException("A negative value was passed.");
            }
        }

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
