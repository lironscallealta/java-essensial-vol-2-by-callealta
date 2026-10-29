package english.chapterfour.withinheritance;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Julian";
        manager.department = "Sales";
        System.out.println("----Manager----");
        System.out.println(manager.getDetails()); 
        
        System.out.printf("%n");

        Employee employee = new Employee();
        employee.name = "Peña";
        System.out.println("----Employee----");
        System.out.println(employee.getDetails());
    }

}
