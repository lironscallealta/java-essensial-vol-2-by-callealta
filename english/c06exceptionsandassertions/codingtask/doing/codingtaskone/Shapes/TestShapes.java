package english.c06exceptionsandassertions.codingtask.doing.codingtaskone.Shapes;

import static english.cp05otherclassfeatures.codingtask.doing.codingtaskone.Shapes.CalculatorFigures.*;

import java.util.ArrayList;

public class TestShapes {

    public static void main(String[] args) {
        ArrayList<Integer> listIntegers = new ArrayList<>();
        for (String integers : args) {

            Integer integerNumber = Integer.parseInt(integers);
            listIntegers.add(integerNumber);
        }

        int[] listInt = new int[listIntegers.size()];
        for (int i = 0; i < listIntegers.size(); i++) {
            listInt[i] = listIntegers.get(i);
        }
        int numbers[] = listInt;

        // example Circle, Rectangle, Square, Triangule
        System.out.println("----------#1----------");
        shapes(numbers);

    }

}
