package english.chapterfour.objectinheritance;

public class ObjectInheritanceExample {

    public static void main(String[] args) {
        Person person = new Person("Julian", 25);
        Person sameReference = person;
        Person anotherPerson = new Person("Julian", 25);

        // Object.toString(): class name + "@" + hexadecimal hash code.
        System.out.println(person.toString());

        // Object.hashCode(): a hash code, not a guaranteed unique identifier.
        System.out.println(person.hashCode());

        // Object.equals() compares object identity by default.
        System.out.println(person.equals(sameReference)); // true
        System.out.println(person.equals(anotherPerson)); // false

        // Same data does not make two separate objects equal by default.
        // Person would need to override equals() and hashCode() to define
        // equality based on its data.
    }
}
