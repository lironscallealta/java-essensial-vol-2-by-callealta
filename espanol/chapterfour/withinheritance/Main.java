package espanol.chapterfour.withinheritance;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Julian";
        manager.department = "Ventas";
        System.out.println("----Gerente----");
        System.out.println(manager.getDetails()); 
        
        System.out.printf("%n");

        Employee employee = new Employee();
        employee.name = "Peña";
        System.out.println("----Empleado----");
        System.out.println(employee.getDetails());
    }

}
