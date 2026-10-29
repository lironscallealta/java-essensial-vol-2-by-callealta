package espanol.chapterfour.withinheritance;

public class Manager extends Employee {

    public String department;

    @Override
    public String getDetails() {
        return String.format(
                "%s%nDepartamento: %s%nObjeto: %s",
                super.getDetails(),
                department,
                this);
    }

}
