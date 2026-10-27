package chapterfour.constructoroverloading;

import java.util.Date;

public class OverloadingConstructorExample {

    public static class Employee {

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

    public static void main(String[] args) {

        // Name, salary, and birth date.
        Employee p1 = new Employee("Julian", 20000, new Date());

        // Name and salary: birthDate is set to null.
        
        Employee p2 = new Employee("Julian", 20000);

        // Name and birth date: salary defaults to BASE_SALARY (15000).
        Employee p3 = new Employee("Julian", new Date());
        System.out.println(p1.getDetails());
        p1.toString();
        System.out.println(p1.hashCode());
    }
}