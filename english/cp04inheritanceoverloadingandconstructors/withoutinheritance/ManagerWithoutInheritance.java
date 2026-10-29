package english.cp04inheritanceoverloadingandconstructors.withoutinheritance;

import java.util.Date;

import english.cp04inheritanceoverloadingandconstructors.withinheritance.Employee;

public class ManagerWithoutInheritance {
    public String name = "";
    public double salary;
    public Date birthDate;
    public String department;

    public String getDetails() {
        return String.format("name: %s.%nSalary: %.2f.%nBirth Date: %s.%nDepartment: %s", name, salary,
                birthDate.toString(), department);
    }
}