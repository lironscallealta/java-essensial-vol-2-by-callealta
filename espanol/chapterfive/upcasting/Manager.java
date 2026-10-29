package espanol.chapterfive.upcasting;

public class Manager extends Employee {

    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " - Departamento: " + department;
    }
}
