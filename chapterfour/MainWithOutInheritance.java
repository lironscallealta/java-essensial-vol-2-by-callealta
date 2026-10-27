package chapterfour;

import java.util.Date;

import chapterfour.EmployeeWithoutInheritance;

public class MainWithOutInheritance {

    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------------");
        EmployeeWithoutInheritance employeeWithoutInheritance = new EmployeeWithoutInheritance();
        employeeWithoutInheritance.name = "Pedro";
        employeeWithoutInheritance.salary = 10.45;
        System.out.println(employeeWithoutInheritance.getDetails());

        System.out.printf("%n");

        System.out.println("-----------------------------------------------------------------");
        ManagerWithoutInheritance managerWithoutInheritance = new ManagerWithoutInheritance();
        managerWithoutInheritance.name = "Pedro";
        managerWithoutInheritance.salary = 10.45;
        managerWithoutInheritance.department = "Sales";
        System.out.println(managerWithoutInheritance.getDetails());

    }
}
