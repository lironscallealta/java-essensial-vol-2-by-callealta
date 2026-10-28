package charpterfive.upcasting;

public class SharedReferenceExample {

    public static void main(String[] args) {
        // 1. Create ONE Manager object and keep a Manager reference.
        Manager manager = new Manager();

        // setName() is inherited from Employee.
        manager.setName("Julian");

        // setDepartment() is specific to Manager.
        manager.setDepartment("Sales");

        // 2. Refer to the SAME object using its superclass type.
        // This is implicit upcasting.
        // There is no "new" here: no second object is created.
        Employee employee = manager;

        // Both references point to the same object.
        System.out.println("Same object: " + (manager == employee)); // true

        // 3. Employee declares getDetails(), so the call is allowed.
        // The actual object is a Manager, so Manager.getDetails() runs.
        System.out.println("Before update: " + employee.getDetails());

        // 4. Modify that object through the Manager reference.
        manager.setDepartment("Engineering");

        // The Employee reference sees the updated data in the SAME object.
        System.out.println("After update: " + employee.getDetails());

        /*
         * The object and its two references:
         *
         * manager  (declared type: Manager)  ---+
         *                                     +---> ONE Manager object
         * employee (declared type: Employee) ---+
         *
         * Use manager for Manager-specific methods.
         * Use employee when working with the common Employee interface.
         *
         * INVALID:
         * employee.setDepartment("Finance");
         *
         * Employee does not declare or inherit setDepartment().
         * Upcasting does not add Manager-specific methods to Employee.
         *
         * EXPECTED OUTPUT:
         * Same object: true
         * Before update: Name: Julian - Department: Sales
         * After update: Name: Julian - Department: Engineering
         */
    }
}
