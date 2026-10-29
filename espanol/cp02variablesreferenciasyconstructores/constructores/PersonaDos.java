package espanol.cp02variablesreferenciasyconstructores.constructores;
/** Clase de apoyo: constructor de copia y creación de otra persona con agregarEdad(). */
public class PersonaDos {

    private String nombre = "sin nombre";
    private int edad = 0;

    public PersonaDos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public PersonaDos(PersonaDos personaOriginal) {
        this.nombre = personaOriginal.nombre;
        this.edad = personaOriginal.edad;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerEdad(int edad) {
        this.edad = edad;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    /*
 * Aquí se crea una persona nueva a partir de this.
 * Por ejemplo, persona1.agregarEdad(25) crea otro objeto en memoria con la edad modificada.
 */
    public PersonaDos agregarEdad(int edadAdicional) {
        PersonaDos nuevaPersona = new PersonaDos(this);
        nuevaPersona.edad = nuevaPersona.edad + edadAdicional;
        return nuevaPersona;
    }

    @Override
    public String toString() {
        return nombre + " con edad " + edad;
    }
}



