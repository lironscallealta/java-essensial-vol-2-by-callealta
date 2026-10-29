package espanol.cp02variablesreferenciasyconstructores.constructores;
/** Constructores: reutilización con this(...) y validación de argumentos. */
public class EjemploConstructor {

    public static void main(String[] argumentos) {
        PersonaDeEjemplo persona1 = new PersonaDeEjemplo();
        PersonaDeEjemplo persona2 = new PersonaDeEjemplo("Ana", 20);

        persona1.mostrarDetalles();
        persona2.mostrarDetalles();
    }
}

class PersonaDeEjemplo {

    private String nombre;
    private int edad;

    // Reutiliza el constructor con argumentos
    public PersonaDeEjemplo() {
        this("Sin nombre", 24);
    }

    // Ambos caminos pasan por esta validación
    public PersonaDeEjemplo(String nombre, int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException(
                "La edad no puede ser negativa"
            );
        }

        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println(nombre + " tiene " + edad + " años");
    }
}