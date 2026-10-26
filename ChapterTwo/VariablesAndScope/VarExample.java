package ChapterTwo.VariablesAndScope;

/** Inferencia de tipos con var: ejemplos de variables locales y bucles. */
public class VarExample {

    public static void main(String[] args) {
        // Using 'var' to declare local variables

        // Inferred as String
        var message = "Hello, Java 10 and beyond!";

        // Inferred as int
        var number = 42;

        // Inferred as double
        var pi = 3.14159;

        // Inferred as boolean
        var isJavaFun = true;

        // Printing the inferred variables
        System.out.println(message);
        System.out.println("Number: " + number);
        System.out.println("Pi: " + pi);
        System.out.println("Is Java fun? " + isJavaFun);

        // Using 'var' in a loop
        var fruits = new String[] { "Apple", "Banana", "Cherry" };
        String listStrings[] = { "hello", "my", "Fiend", "how", "are", "you?" };

        for (String string : listStrings) {
            System.out.print(string + " ");
        }
        System.out.println("");

        // 'fruit' inferred as String
        for (var fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // 'var' with an object inferred as Person
        var person = new PersonThree("Lawrence", 25);
        person.introduce();
    }
}

// A simple Person class

class PersonThree {

    private String name;
    private int age;

    PersonThree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println(
                "Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}