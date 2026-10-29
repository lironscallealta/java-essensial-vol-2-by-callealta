package espanol.cp02variablesreferenciasyconstructores.ejercicios.desarrollo.ejerciciouno;

/** Ejercicio en curso: consulta el enunciado en enunciados/ejerciciouno desde la carpeta ejercicios. */
public class EjercicioProgramacion {
    /*
 * Objetivo: escribir un programa Java que demuestre el uso de tipos primitivos,
 * tipos de referencia, clases propias, asignación de referencias, paso por valor,
 * alcance de variables locales y la referencia this.
 */

    /*
 * REQUISITOS:
 * 1. Crea Persona con los atributos String nombre e int edad y estos miembros:
 * - Un constructor que reciba nombre y edad e inicialice los atributos.
 * - actualizarEdad(): recibe un objeto Persona y un int para actualizar su edad.
 * - incrementarEdad(): incrementa la edad y devuelve la persona actualizada.
 * - mostrarInformacion(): imprime el nombre y la edad.
 * 
 * 2. Programa principal:
 * Crea Persona e inicializa nombre y edad mediante el constructor.
 * Pasa el objeto a actualizarEdad() para actualizar su edad.
 * Usa incrementarEdad() y asigna el resultado a una nueva variable de referencia.
 * Demuestra el efecto de cambiar la referencia y del alcance de variables locales.
 * Usa this dentro de Persona para reutilizar métodos.
 */

    public static void main(String[] argumentos) {

        PersonaCuatro persona1 = new PersonaCuatro("Nombre cualquiera", 25);
        System.out.println("edad actual");
        persona1.mostrarInformacion();

        System.out.println();
        System.out.println("actualizando la edad");
        persona1.actualizarEdad(persona1, 30);
        persona1.mostrarInformacion();

        // PersonaCuatro nuevaPersonaMayor = new PersonaCuatro(persona1); // Esta línea no es necesaria.
        System.out.println();
        System.out.println("incrementar la edad");
        PersonaCuatro nuevaPersonaMayor = persona1.incrementarEdad(4);
        nuevaPersonaMayor.mostrarInformacion();

    }

}

class PersonaCuatro {
    public String nombre;
    public int edad;

    PersonaCuatro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    PersonaCuatro(PersonaCuatro personaOriginal) {
        this.nombre = personaOriginal.nombre;
        this.edad = personaOriginal.edad;

    }

    public void actualizarEdad(PersonaCuatro persona, int actualizarEdad) {

        persona.edad = actualizarEdad;

    }

    public PersonaCuatro incrementarEdad(int aumentoEdad) {

        PersonaCuatro nuevaPersona = new PersonaCuatro(this);
        nuevaPersona.edad += aumentoEdad;
        return nuevaPersona;

    }

    public void mostrarInformacion() {
        System.out
                .println(
                        "Nombre de la persona: " + this.nombre + ". Edad de la persona: " + this.edad + " Hash del objeto: " + this);
    }
}
