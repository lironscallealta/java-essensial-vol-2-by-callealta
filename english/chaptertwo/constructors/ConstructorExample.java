package english.chaptertwo.constructors;
/** Constructores: reutilización con this(...) y validación de argumentos. */
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

    // Reutiliza el constructor con argumentos
    public ExamplePerson() {
        this("Sin nombre", 24);
    }

    // Ambos caminos pasan por esta validación
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