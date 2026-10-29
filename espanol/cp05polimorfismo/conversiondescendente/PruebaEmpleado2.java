package espanol.cp05polimorfismo.conversiondescendente;

public class PruebaEmpleado2 {

    public static void main(String[] argumentos) {
        // CASO 1: CONVERSIÓN ASCENDENTE (conversionascendente). No se necesita if.
        System.out.println("=== CASO 1: Conversión ascendente, sin if ===");

        // Crea un objeto Director2 y una referencia de tipo Director2.
        Director2 director1 = new Director2();

        // Apunta al MISMO objeto mediante una referencia Empleado2.
        Empleado2 empleado1 = director1;

        System.out.println("Mismo objeto: " + (empleado1 == director1)); // true
        empleado1.trabajar();
        director1.convocarReunion();
        director1.jugarGolf();


        // CASO 2: CONVERSIÓN DESCENDENTE (conversiondescendente), con paréntesis y sin if.
        System.out.println();
        System.out.println("=== CASO 2: Conversión descendente, sin if ===");

        // Crea otro objeto Director2 utilizando una referencia Empleado2.
        Empleado2 empleado2 = new Director2();

        // (Director2) convierte la referencia, no el objeto.
        // Es seguro porque el objeto creado realmente es un Director2.
        Director2 director2 = (Director2) empleado2;

        System.out.println("Mismo objeto: " + (empleado2 == director2)); // true
        empleado2.trabajar();
        director2.convocarReunion();
        director2.jugarGolf();

        /*
 * El CASO 1 comienza con una referencia Director2 y agrega una Empleado2.
 * El CASO 2 comienza con una referencia Empleado2 y agrega una Director2.
 * No se necesita if porque ya conocemos el tipo real del objeto.
 * Cada pareja apunta al MISMO objeto. La conversión no crea uno nuevo.
 * Si empleado2 apuntara a un Empleado2 común en vez de un Director2,
 * la conversión fallaría con ClassCastException.
 */


        // CASO 3: el ejemplo original comprueba primero el tipo con instanceof.
        System.out.println();
        System.out.println("=== CASO 3: Comprobar el tipo con instanceof ===");

        Empleado2 e = new Empleado2();
        Empleado2 m = new Gerente2();
        Empleado2 d = new Director2();

        realizarTareasDelEmpleado(e);    // Un objeto Empleado2.
        // realizarTareasDelEmpleado(m); // Un objeto Gerente2.
        // realizarTareasDelEmpleado(d); // Un objeto Director2.
    }

    public static void realizarTareasDelEmpleado(Empleado2 e) {
        e.trabajar();

        // Comprueba Director2 primero: todo Director2 también es Gerente2.
        if (e instanceof Director2) {
            Director2 x = (Director2) e;
            x.convocarReunion();
            x.jugarGolf();

        } else if (e instanceof Gerente2) {
            Gerente2 m = (Gerente2) e;
            m.convocarReunion();
        }
    }
}