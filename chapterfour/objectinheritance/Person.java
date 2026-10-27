package chapterfour.objectinheritance;

/*
 * Every Java class inherits from Object, directly or indirectly.
 *
 * If no superclass is specified, Java implicitly extends Object.
 * These declarations are therefore equivalent:
 *
 * public class Person { ... }
 * public class Person extends Object { ... }
 *
 * Person inherits methods such as toString(), equals(), and hashCode().
 * This example uses their default implementations from Object.
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
