package english.cp06otherclassfeatures;

public class StaticExample {

    public static int counter = 0;
    private int serialNumber;

    public StaticExample() {
        counter++;
        serialNumber = counter;
    }

    public static void main(String[] args) {
        System.out.println("Creating the first object: ");
        StaticExample se1 = new StaticExample();
        System.out.println("Creating the second object: ");
        StaticExample se2 = new StaticExample();

        System.out.println("A total of " + counter + " objects were created.");

        // printing the serialNumber of se1

        System.out.println(se1.serialNumber);

        // printing the serialNumber of se2

        System.out.println(se2.serialNumber); //This work even It's instance as private because is inside the same file

        // printing the value of counter

        System.out.println(StaticExample.counter);

    }
}