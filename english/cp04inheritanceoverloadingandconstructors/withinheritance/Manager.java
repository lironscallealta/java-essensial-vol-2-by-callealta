package english.cp04inheritanceoverloadingandconstructors.withinheritance;

public class Manager extends Employee {

    public String department;

    @Override
    public String getDetails() {
        return String.format(
                "%s%nDepartment: %s%nObject: %s",
                super.getDetails(),
                department,
                this);
    }

}
