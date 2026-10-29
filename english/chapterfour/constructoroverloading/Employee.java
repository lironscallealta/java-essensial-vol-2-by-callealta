package english.chapterfour.constructoroverloading;

import java.util.Date;

public class Employee {

    private String name;
    private Date birthDate;
    private double salary;
    private static final double BASE_SALARY = 15000.00;

    public Employee(String name, double salary, Date DoB) {
        this.name = name;
        this.salary = salary;
        this.birthDate = DoB;
    }

    public Employee(String name, double salary) {
        this(name, salary, null);
    }

    public Employee(String name, Date DoB) {
        this(name, BASE_SALARY, DoB);
    }

    public String getDetails() {
        return "Name: " + name + "\nSalary: "
                + salary + "\nBirth Date: " + birthDate;
    }
}
