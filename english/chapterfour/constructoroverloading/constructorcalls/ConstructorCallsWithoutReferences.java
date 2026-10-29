package english.chapterfour.constructoroverloading.constructorcalls;

import java.util.Date;

import english.chapterfour.constructoroverloading.Employee;

public class ConstructorCallsWithoutReferences {

    public static void main(String[] args) {

        // Name, salary, and birth date.
         new Employee("Julian", 20000, new Date());

        // Name and salary: birthDate is set to null.
        
         new Employee("Julian", 20000);

        // Name and birth date: salary defaults to BASE_SALARY (15000).
        new Employee("Julian", new Date());
 
    }
}