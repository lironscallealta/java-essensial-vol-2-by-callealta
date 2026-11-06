package english.cp05otherclassfeatures.codingtask.doing.codingtaskone.Shapes;


public class TestShapes {

    public static void main(String[] args) {
        //example Circle
        shapes(10);
        //example Triangule
        System.out.println();
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
