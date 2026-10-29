package english.cp05polymorphism.inheritancehierarchy;

import java.util.Date;

/*
 * UML REFERENCE — BOOK, PAGE 276
 *
 * Inheritance tree (each child extends the class above it):
 *
 * Employee
 *   +-- Engineer
 *   +-- Manager
 *   |     +-- Director
 *   +-- Secretary
 *
 * Classes and members shown in the book:
 *
 * +------------------------------------+
 * | Employee                           |
 * +------------------------------------+
 * | +name: String = " "                |
 * | +salary: double                    |
 * | +birthDate: Date                   |
 * +------------------------------------+
 * | +getDetails(): String              |
 * +------------------------------------+
 *
 * +------------------------------------+
 * | Manager                            |
 * +------------------------------------+
 * | +department: String = " "          |
 * +------------------------------------+
 *
 * +------------------------------------+
 * | Director                           |
 * +------------------------------------+
 * | +carAllowance: double              |
 * +------------------------------------+
 * | +increaseAllowance()               |
 * +------------------------------------+
 *
 * Engineer and Secretary extend Employee.
 * No additional fields or methods are shown for them in this diagram.
 *
 * UML LEGEND:
 * + means public.
 * name: Type describes a field and its type.
 * method(): Type describes a method and its return type.
 *
 * PROJECT NOTES:
 * The book's Employee is named EmployeeExampleTwo in this package.
 * The diagram uses public fields (+). EmployeeExampleTwo currently uses
 * private fields with getters and setters.
 * This comment records the book's UML; it does not change the Java classes.
 */
public class Test {

    public static void main(String[] args) {

        EmployeeExampleTwo e1 = new Manager();
        EmployeeExampleTwo e2 = new Engineer();
        EmployeeExampleTwo e3 = new Secretary();
        EmployeeExampleTwo e4 = new Director();

        System.out.println(e1.getDetails());
        System.out.println(e2.getDetails());
        System.out.println(e3.getDetails());
        System.out.println(e4.getDetails());

    }

}
