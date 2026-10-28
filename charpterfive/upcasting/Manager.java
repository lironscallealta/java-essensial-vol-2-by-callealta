package charpterfive.upcasting;

public class Manager extends Employee {

    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " - Department: " + department;
    }
}
