package espanol.cp02variablesreferenciasyconstructores.referenciasypasoporvalor;

/** Referencias: asignar una referencia, compartir un objeto y crear otro objeto. */
public class EjemploAsignacionDeReferencias {

    // Tipos de datos de referencia.
    public static void main(String[] argumentos) {
        Persona persona1 = new Persona("Joan", 10);
        System.out.println("ejemplo 1");
        System.out.println(persona1.toString());
        Persona persona2 = new Persona();
        System.out.println("ejemplo 2");
        System.out.println(persona2.toString());
        Persona persona3; /*
 * Referencia local declarada, todavía sin inicializar; se asigna en la siguiente línea.
 */
        persona3 = new Persona("NombreP3", 45);
        Persona persona4 = persona3;
        System.out.println(persona3 + " Son el mismo objeto " + persona4);
        Persona persona5 = new Persona(persona3.nombre, persona3.edad);
        System.out.println(persona5 + " Misma información, distinto hash " + persona4);
        Persona persona6 = new Persona("Prueba", 45);
        persona5 = persona6;
        System.out.println(persona5 + " persona5 - ahora comparten la referencia - persona6 " + persona6);
        System.out.println(persona5.imprimirDetalles());
        System.out.println(persona6.imprimirDetalles());

    }

}
