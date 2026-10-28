package charpterfive.downcasting;

public class TestEmployee2 {

    public static void main(String[] args) {
        // CASE 1: UPCASTING — the familiar approach. NO IF is needed.
        System.out.println("=== CASE 1: Upcasting, without if ===");

        // Create one Director2 object using a Director2 reference.
        Director2 director1 = new Director2();

        // Refer to the SAME object as an Employee2.
        Employee2 employee1 = director1;

        System.out.println("Same object: " + (employee1 == director1)); // true
        employee1.work();
        director1.callMeeting();
        director1.playGolf();


        // CASE 2: DOWNCASTING — using parentheses, also WITHOUT IF.
        System.out.println();
        System.out.println("=== CASE 2: Downcasting, without if ===");

        // Create another Director2 object using an Employee2 reference.
        Employee2 employee2 = new Director2();

        // (Director2) converts the reference, not the object.
        // This is safe because the object above really is a Director2.
        Director2 director2 = (Director2) employee2;

        System.out.println("Same object: " + (employee2 == director2)); // true
        employee2.work();
        director2.callMeeting();
        director2.playGolf();

        /*
         * CASE 1 starts with a Director2 reference and adds an Employee2 reference.
         * CASE 2 starts with an Employee2 reference and adds a Director2 reference.
         * Neither case requires an if because we already know the object's type.
         * Each pair refers to the SAME object. A cast does not create a new one.
         *
         * If employee2 pointed to a plain Employee2 rather than a Director2,
         * the cast would fail with ClassCastException.
         */


        // CASE 3: The original example uses instanceof to check the type first.
        System.out.println();
        System.out.println("=== CASE 3: Checking the type with instanceof ===");

        Employee2 e = new Employee2();
        Employee2 m = new Manager2();
        Employee2 d = new Director2();

        doEmployeeStuff(e);    // An Employee2 object.
        // doEmployeeStuff(m); // A Manager2 object.
        // doEmployeeStuff(d); // A Director2 object.
    }

    public static void doEmployeeStuff(Employee2 e) {
        e.work();

        // Check Director2 first: every Director2 is also a Manager2.
        if (e instanceof Director2) {
            Director2 x = (Director2) e;
            x.callMeeting();
            x.playGolf();

        } else if (e instanceof Manager2) {
            Manager2 m = (Manager2) e;
            m.callMeeting();
        }
    }
}