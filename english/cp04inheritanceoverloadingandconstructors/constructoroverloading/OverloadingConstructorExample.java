package english.cp04inheritanceoverloadingandconstructors.constructoroverloading;

import java.util.Date;

public class OverloadingConstructorExample {

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