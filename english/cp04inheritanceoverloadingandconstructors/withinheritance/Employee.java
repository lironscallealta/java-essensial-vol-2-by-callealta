package english.cp04inheritanceoverloadingandconstructors.withinheritance;

import java.util.Date;

public class Employee {

    public String name ="N.N";
    public double salary;
    public Date birthDate = new Date();

    public String getDetails() {
        return String.format("name: %s.%nSalary: %.2f.%nBirth Date: %s.", name, salary, birthDate.toString());
    }

}

