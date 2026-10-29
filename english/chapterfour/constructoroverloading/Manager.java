package english.chapterfour.constructoroverloading;

// Manager.java

public class Manager extends Employee {

    private String dept;

    public Manager(String name, double salary, String dept) {
        super(name, salary);
        this.dept = dept;
    }

    /*
     * This constructor would fail because Java implicitly calls super(),
     * but Employee does not have a no-argument constructor.
     *
     * public Manager(String dept) {
     *     this.dept = dept;
     * }
     */

    // Additional Manager code...
}

