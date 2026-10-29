package espanol.chaptertwo.referencesandpassbyvalue;

/** Referencias: asignar una referencia, compartir un objeto y crear otro objeto. */
public class ReferenceAssignmentExample {

    // Tipos de datos de referencia.
    public static void main(String[] args) {
        Person p1 = new Person("Joan", 10);
        System.out.println("ejemplo 1");
        System.out.println(p1.toString());
        Person p2 = new Person();
        System.out.println("ejemplo 2");
        System.out.println(p2.toString());
        Person p3; /*
 * Referencia local declarada, todavía sin inicializar; se asigna en la siguiente línea.
 */
        p3 = new Person("NombreP3", 45);
        Person p4 = p3;
        System.out.println(p3 + " Son el mismo objeto " + p4);
        Person p5 = new Person(p3.name, p3.age);
        System.out.println(p5 + " Misma información, distinto hash " + p4);
        Person p6 = new Person("Prueba", 45);
        p5 = p6;
        System.out.println(p5 + " p5 - ahora comparten la referencia - p6 " + p6);
        System.out.println(p5.printDetails());
        System.out.println(p6.printDetails());

    }

}
