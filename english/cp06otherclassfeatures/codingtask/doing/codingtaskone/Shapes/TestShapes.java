package english.cp06otherclassfeatures.codingtask.doing.codingtaskone.Shapes;

import java.util.Scanner;

public class TestShapes {

    public static void main(String[] args) {
        
        shapes(10,20,20);

    }

    public static void shapes(int... inputs) {
        int totalLenght = inputs.length;
    
        if (totalLenght == 3) {
            Triangle triangle = new Triangle(inputs);
            triangle.getDetails();
            
        }
        else if (totalLenght == 1) {
            Circle circle = new Circle(inputs[0]);
            circle.getDetails();
        }
        
    }

}
