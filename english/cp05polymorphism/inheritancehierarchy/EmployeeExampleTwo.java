package english.cp05polymorphism.inheritancehierarchy;
import java.util.Date;

public class EmployeeExampleTwo {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private String name;
    private double salary;
    private Date birthday;

    public String getDetails(){
        return name + " - " + salary + " - " + birthday;
    }

}
