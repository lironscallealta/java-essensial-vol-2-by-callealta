package english.cp05otherclassfeatures.statickeyword;

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

        System.out.println(se2.serialNumber); // This work even It's instance as private because is inside the same file

        // printing the value of counter

        System.out.println(StaticExample.counter);

        

    }

    /*
     * In Java, `static` means that a member belongs to the class itself,
     * rather than to an individual object.
     *
     * You can use `static` for fields, methods, and nested classes:
     *
     * class Library {
     * static int bookCount;
     *
     * static class Book {
     * String title;
     * }
     * }
     *
     * A top-level class cannot be declared `static` because it is not
     * contained inside another class. A nested class can be `static`
     * because it is a member of its enclosing class.
     *
     * Static methods can be called without creating an object:
     *
     * int sum = MathExample.add(2, 3);
     *
     * Instance methods belong to objects, so you must create an object
     * before calling them. A static method also cannot directly access
     * an instance field or instance method; it needs an object to do that.
     */
}