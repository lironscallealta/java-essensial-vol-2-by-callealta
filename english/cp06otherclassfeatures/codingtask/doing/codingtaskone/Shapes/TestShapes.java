package english.cp06otherclassfeatures.codingtask.doing.codingtaskone.Shapes;

import java.util.Scanner;

public class TestShapes {

    public static void main(String[] args) {
        shapes(20);

    }

    public static void shapes(int... inputs) {
        int totalLenght = inputs.length;
        int numbers[] = inputs;
        if (totalLenght == 3) {
            
        }
        else if (totalLenght == 1) {
            Circle circle = new Circle(inputs[0]);
            circle.getDetails();
        }
        
    }

}
