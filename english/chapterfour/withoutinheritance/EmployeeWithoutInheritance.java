package english.chapterfour.withoutinheritance;

import java.util.Date;

public class EmployeeWithoutInheritance {
    public String name = "";
    public double salary;
    public Date birthDate;

    public String getDetails() {
        
        return String.format("name: %s.%nSalary: %.2f.%nBirth Date: %s.", name, salary, birthDate);
    }
}
