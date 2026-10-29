package espanol.chapterfive.downcasting;

public class TestEmployee2 {

    public static void main(String[] args) {
        // CASO 1: CONVERSIÓN ASCENDENTE (upcasting). No se necesita if.
        System.out.println("=== CASO 1: Conversión ascendente, sin if ===");

        // Crea un objeto Director2 y una referencia de tipo Director2.
        Director2 director1 = new Director2();

        // Apunta al MISMO objeto mediante una referencia Employee2.
        Employee2 employee1 = director1;

        System.out.println("Mismo objeto: " + (employee1 == director1)); // true
        employee1.work();
        director1.callMeeting();
        director1.playGolf();


        // CASO 2: CONVERSIÓN DESCENDENTE (downcasting), con paréntesis y sin if.
        System.out.println();
        System.out.println("=== CASO 2: Conversión descendente, sin if ===");

        // Crea otro objeto Director2 utilizando una referencia Employee2.
        Employee2 employee2 = new Director2();

        // (Director2) convierte la referencia, no el objeto.
        // Es seguro porque el objeto creado realmente es un Director2.
        Director2 director2 = (Director2) employee2;

        System.out.println("Mismo objeto: " + (employee2 == director2)); // true
        employee2.work();
        director2.callMeeting();
        director2.playGolf();

        /*
 * El CASO 1 comienza con una referencia Director2 y agrega una Employee2.
 * El CASO 2 comienza con una referencia Employee2 y agrega una Director2.
 * No se necesita if porque ya conocemos el tipo real del objeto.
 * Cada pareja apunta al MISMO objeto. La conversión no crea uno nuevo.
 * Si employee2 apuntara a un Employee2 común en vez de un Director2,
 * la conversión fallaría con ClassCastException.
 */


        // CASO 3: el ejemplo original comprueba primero el tipo con instanceof.
        System.out.println();
        System.out.println("=== CASO 3: Comprobar el tipo con instanceof ===");

        Employee2 e = new Employee2();
        Employee2 m = new Manager2();
        Employee2 d = new Director2();

        doEmployeeStuff(e);    // Un objeto Employee2.
        // doEmployeeStuff(m); // Un objeto Manager2.
        // doEmployeeStuff(d); // Un objeto Director2.
    }

    public static void doEmployeeStuff(Employee2 e) {
        e.work();

        // Comprueba Director2 primero: todo Director2 también es Manager2.
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