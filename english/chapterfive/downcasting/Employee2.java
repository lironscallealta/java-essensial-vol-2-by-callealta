package english.chapterfive.downcasting;

public class Employee2 {

    String name;
    double salary;

    public String getDetails() {
        return "Name: " + name
                + "\nSalary: " + salary;
    }

    public void work() {
        System.out.println("Work work work...");
    }
}