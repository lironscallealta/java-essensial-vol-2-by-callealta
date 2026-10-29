package espanol.chapterfive.downcasting;

public class Employee2 {

    String name;
    double salary;

    public String getDetails() {
        return "Nombre: " + name
                + "\nSueldo: " + salary;
    }

    public void work() {
        System.out.println("Trabajar, trabajar, trabajar...");
    }
}