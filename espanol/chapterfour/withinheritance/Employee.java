package espanol.chapterfour.withinheritance;

import java.util.Date;

public class Employee {

    public String name ="N.N";
    public double salary;
    public Date birthDate = new Date();

    public String getDetails() {
        return String.format("nombre: %s.%nSueldo: %.2f.%nFecha de nacimiento: %s.", name, salary, birthDate.toString());
    }

}

