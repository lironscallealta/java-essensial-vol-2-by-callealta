package espanol.chapterfour.objectinheritance;

/*
 * Toda clase Java, salvo Object, hereda directa o indirectamente de Object.
 * Si no se especifica otra superclase, Java utiliza Object implícitamente.
 * Estas declaraciones son equivalentes:
 * public class Person { ... }
 * public class Person extends Object { ... }
 * Person hereda toString(), equals() y hashCode(). Este ejemplo utiliza
 * sus implementaciones predeterminadas de Object.
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
