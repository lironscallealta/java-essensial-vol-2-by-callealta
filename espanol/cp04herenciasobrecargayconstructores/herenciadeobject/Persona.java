package espanol.cp04herenciasobrecargayconstructores.herenciadeobject;

/*
 * Toda clase Java, salvo Object, hereda directa o indirectamente de Object.
 * Si no se especifica otra superclase, Java utiliza Object implícitamente.
 * Estas declaraciones son equivalentes:
 * public class Persona { ... }
 * public class Persona extends Object { ... }
 * Persona hereda toString(), equals() y hashCode(). Este ejemplo utiliza
 * sus implementaciones predeterminadas de Object.
 */
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }
}
