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
    }
}