package english.c06exceptionsandassertions.codingtask.doing.codingtaskone.Shapes;

public class TestShapes {

    public static void main(String[] args) {
        try {
            CalculatorFigures.shapes(args);
        } catch (NumberFormatException e) {
            System.err.println("An argument contains a String value.");
            System.err.println("A NumberFormatException is caught.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.err.println("An IllegalArgumentException is caught.");
        }

    }

    
}

//java english\c06exceptionsandassertions\codingtask\doing\codingtaskone\Shapes\TestShapes.java 10 50
