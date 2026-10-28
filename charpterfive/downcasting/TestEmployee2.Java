package charpterfive.downcasting;

public class TestEmployee2 {

    public static void main(String[] args) {
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
            Director2 d = (Director2) e;
            d.callMeeting();
            d.playGolf();

        } else if (e instanceof Manager2) {
            Manager2 m = (Manager2) e;
            m.callMeeting();
        }
    }
}