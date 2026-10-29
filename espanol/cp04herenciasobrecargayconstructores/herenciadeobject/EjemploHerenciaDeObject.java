package espanol.cp04herenciasobrecargayconstructores.herenciadeobject;

public class EjemploHerenciaDeObject {

    public static void main(String[] argumentos) {
        Persona persona = new Persona("Julian", 25);
        Persona mismaReferencia = persona;
        Persona otraPersona = new Persona("Julian", 25);

        // Object.toString(): nombre de clase + "@" + código hash hexadecimal.
        System.out.println(persona.toString());

        // Object.hashCode(): un código hash; no garantiza un identificador único.
        System.out.println(persona.hashCode());

        // Object.equals() compara por defecto la identidad de los objetos.
        System.out.println(persona.equals(mismaReferencia)); // true
        System.out.println(persona.equals(otraPersona)); // false

        // Tener los mismos datos no hace iguales por defecto a dos objetos distintos.
        // Persona tendría que sobrescribir equals() y hashCode() para definir
        // la igualdad a partir de sus datos.
    }
}
