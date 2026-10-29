package espanol.chapterfour.objectinheritance;

public class ObjectInheritanceExample {

    public static void main(String[] args) {
        Person person = new Person("Julian", 25);
        Person sameReference = person;
        Person anotherPerson = new Person("Julian", 25);

        // Object.toString(): nombre de clase + "@" + código hash hexadecimal.
        System.out.println(person.toString());

        // Object.hashCode(): un código hash; no garantiza un identificador único.
        System.out.println(person.hashCode());

        // Object.equals() compara por defecto la identidad de los objetos.
        System.out.println(person.equals(sameReference)); // true
        System.out.println(person.equals(anotherPerson)); // false

        // Tener los mismos datos no hace iguales por defecto a dos objetos distintos.
        // Person tendría que sobrescribir equals() y hashCode() para definir
        // la igualdad a partir de sus datos.
    }
}
