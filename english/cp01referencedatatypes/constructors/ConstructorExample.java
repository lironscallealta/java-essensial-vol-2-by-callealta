package english.cp01referencedatatypes.constructors;
/** Constructors: reuse with this(...) and argument validation. */
public class ConstructorExample {

    public static void main(String[] args) {
        ExamplePerson p1 = new ExamplePerson();
        ExamplePerson p2 = new ExamplePerson("Ana", 20);

        p1.showDetails();
        p2.showDetails();
    }
}

class ExamplePerson {

    private String name;
    private int age;

    // Reuse the constructor with arguments
    public ExamplePerson() {
        this("Sin nombre", 24);
    }

    // Both paths go through this validation
    public ExamplePerson(String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException(
                "La edad no puede ser negativa"
            );
        }

        this.name = name;
        this.age = age;
    }

    public void showDetails() {
        System.out.println(name + " tiene " + age + " años");
    }
}