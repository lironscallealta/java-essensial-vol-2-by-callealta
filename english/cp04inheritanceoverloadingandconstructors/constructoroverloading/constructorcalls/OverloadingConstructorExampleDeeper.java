package english.cp04inheritanceoverloadingandconstructors.constructoroverloading.constructorcalls;

public class OverloadingConstructorExampleDeeper {

    public static class Employee {

        // Four fields belonging to each Employee object.
        private String name;
        private int age;
        private double salary;
        private String department;

        // CONSTRUCTOR 1: receives FOUR parameters and assigns the fields.
        public Employee(String name, int age, double salary, String department) {
            // this.name is the field; name is the parameter.
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.department = department;
        }

        // CONSTRUCTOR 2: this block DECLARES a constructor with TWO parameters.
        public Employee(String name, int age) {
            // Calls constructor 1 with FOUR arguments.
            // The caller supplies name and age.
            // This constructor supplies the default salary and department.
            this(name, age, 0.0, "Unassigned");
        }

        // CONSTRUCTOR 3: receives ZERO parameters.
        public Employee() {
            // Calls constructor 2 with TWO arguments.
            // That constructor exists: we declared it above.
            this("Julian", 25);
        }

        public String getDetails() {
            return "Name: " + name
                    + "\nAge: " + age
                    + "\nSalary: " + salary
                    + "\nDepartment: " + department;
        }
    }

    public static void main(String[] args) {
        /*
         * There are THREE constructors, even though only one assigns fields.
         *
         * new Employee() follows this chain:
         *
         * Constructor 3: Employee()
         *     -> this("Julian", 25)
         *
         * Constructor 2: Employee(String name, int age)
         *     -> this(name, age, 0.0, "Unassigned")
         *
         * Constructor 1: Employee(String name, int age,
         *                         double salary, String department)
         *     -> assigns all four fields.
         *
         * All three constructors work on the SAME object.
         * A this(...) call does not create another Employee.
         */

        Employee employee = new Employee();
        System.out.println(employee.getDetails());

        /*
         * IMPORTANT:
         *
         * this.name = name; assigns a value to a field.
         *
         * this(name, age); calls an existing constructor whose parameters
         * match those arguments. It does not automatically assign fields
         * or declare a new constructor.
         *
         * If we had declared ONLY the four-parameter constructor,
         * this("Julian", 25) would fail: no two-parameter constructor
         * would exist.
         *
         * A constructor must not call itself, directly or indirectly.
         */
    }
}
