package espanol.chapterfour.withoutinheritance;

import java.util.Date;

import espanol.chapterfour.withinheritance.Employee;

public class ManagerWithoutInheritance {
    public String name = "";
    public double salary;
    public Date birthDate;
    public String department;

    public String getDetails() {
        return String.format("nombre: %s.%nSueldo: %.2f.%nFecha de nacimiento: %s.%nDepartamento: %s", name, salary,
                birthDate.toString(), department);
    }
}