package espanol.chapterfour.constructoroverloading.constructorcalls;

public class OverloadingConstructorExampleDeeper {

    public static class Employee {

        // Cuatro campos pertenecientes a cada objeto Employee.
        private String name;
        private int age;
        private double salary;
        private String department;

        // CONSTRUCTOR 1: recibe CUATRO parámetros y asigna los campos.
        public Employee(String name, int age, double salary, String department) {
            // this.name es el campo; name es el parámetro.
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.department = department;
        }

        // CONSTRUCTOR 2: este bloque DECLARA un constructor con DOS parámetros.
        public Employee(String name, int age) {
            // Llama al constructor 1 con CUATRO argumentos.
            // Quien llama proporciona name y age.
            // Este constructor proporciona el sueldo y departamento predeterminados.
            this(name, age, 0.0, "Sin asignar");
        }

        // CONSTRUCTOR 3: recibe CERO parámetros.
        public Employee() {
            // Llama al constructor 2 con DOS argumentos.
            // Ese constructor existe: lo declaramos arriba.
            this("Julian", 25);
        }

        public String getDetails() {
            return "Nombre: " + name
                    + "\nEdad: " + age
                    + "\nSueldo: " + salary
                    + "\nDepartamento: " + department;
        }
    }

    public static void main(String[] args) {
        /*
 * Hay TRES constructores aunque solo uno asigna los campos.
 * new Employee() sigue esta cadena:
 * Constructor 3: Employee()
 *     -> this("Julian", 25)
 * Constructor 2: Employee(String name, int age)
 *     -> this(name, age, 0.0, "Sin asignar")
 * Constructor 1: Employee(String name, int age, double salary, String department)
 *     -> asigna los cuatro campos.
 * Los tres constructores trabajan sobre el MISMO objeto.
 * Una llamada this(...) no crea otro Employee.
 */

        Employee employee = new Employee();
        System.out.println(employee.getDetails());

        /*
 * IMPORTANTE:
 * this.name = name; asigna un valor a un campo.
 * this(name, age); llama a un constructor existente cuyos parámetros
 * corresponden a los argumentos. No asigna campos automáticamente ni declara
 * un constructor nuevo.
 * Si solo existiera el constructor de cuatro parámetros, this("Julian", 25)
 * fallaría porque no habría un constructor de dos parámetros.
 * Un constructor no puede llamarse a sí mismo, directa ni indirectamente.
 */
    }
}
