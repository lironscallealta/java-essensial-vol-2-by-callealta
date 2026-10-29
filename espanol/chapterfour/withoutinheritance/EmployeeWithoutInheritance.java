package espanol.chapterfour.withoutinheritance;

import java.util.Date;

public class EmployeeWithoutInheritance {
    public String name = "";
    public double salary;
    public Date birthDate;

    public String getDetails() {
        
        return String.format("nombre: %s.%nSueldo: %.2f.%nFecha de nacimiento: %s.", name, salary, birthDate);
    }
}
