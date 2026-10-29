package english.chapterfour.constructorchaining;

class Employee {

    public Employee() {
        // Employee also implicitly extends Object.
        // Java supplies super() here to call Object's constructor.
        System.out.println("Employee constructor");
    }
}

class Manager extends Employee {

    public Manager() {
        /*
         * We did NOT write this(...) or super(...).
         * Java therefore supplies an implicit super() call.
         *
         * In this example, the constructor behaves as if we had written:
         *
         * public Manager() {
         *     super(); // Calls Employee().
         *     System.out.println("Manager constructor");
         * }
         *
         * Java does not add text to this source file.
         * The compiler includes the call in the compiled code.
         */
        System.out.println("Manager constructor");
    }
}

class ExplicitManager extends Employee {

    public ExplicitManager() {
        // Here we write the superclass constructor call ourselves.
        super();

        // This runs after Employee() finishes.
        System.out.println("ExplicitManager constructor");
    }
}

public class ImplicitSuperExample {

    public static void main(String[] args) {
        /*
         * WHAT HAPPENS WHEN WE EXECUTE new Manager()?
         *
         * 1. Construction of one Manager object begins.
         * 2. Manager() implicitly calls super(), which calls Employee().
         * 3. Employee() implicitly calls Object().
         * 4. Object() finishes, then Employee() prints its message.
         * 5. Employee() finishes, then Manager() prints its message.
         *
         * Constructor calls go down this chain:
         * Manager() -> Employee() -> Object()
         *
         * In this example, their bodies finish in the opposite order:
         * Object() -> Employee() -> Manager()
         *
         * These constructors initialize the SAME Manager object.
         * super() does not create a separate Employee object.
         */

        System.out.println("=== Implicit super() ===");
        Manager manager = new Manager();

        System.out.println();
        System.out.println("=== Explicit super() ===");
        ExplicitManager explicitManager = new ExplicitManager();

        /*
         * EXPECTED OUTPUT:
         *
         * === Implicit super() ===
         * Employee constructor
         * Manager constructor
         *
         * === Explicit super() ===
         * Employee constructor
         * ExplicitManager constructor
         *
         * IMPORTANT:
         * An implicit super() needs an accessible no-argument constructor
         * in the superclass. If Employee only declared Employee(String name),
         * Manager would need an explicit call such as super("Julian").
         *
         * this(...) calls another constructor in the SAME class.
         * super(...) calls a constructor in the SUPERCLASS.
         */
    }
}
