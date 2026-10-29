package espanol.chapterfour.constructorchaining;

class Employee {

    public Employee() {
        // Employee también hereda implícitamente de Object.
        // Java proporciona super() para llamar al constructor de Object.
        System.out.println("Constructor de Employee");
    }
}

class Manager extends Employee {

    public Manager() {
        /*
 * No escribimos this(...) ni super(...), así que Java proporciona una
 * llamada implícita a super(). El constructor se comporta como si escribiéramos:
 * public Manager() {
 *     super(); // Llama a Employee().
 *     System.out.println("Constructor de Manager");
 * }
 * Java no agrega texto a este archivo: el compilador incluye la llamada
 * en el código compilado.
 */
        System.out.println("Constructor de Manager");
    }
}

class ExplicitManager extends Employee {

    public ExplicitManager() {
        // Aquí escribimos explícitamente la llamada al constructor de la superclase.
        super();

        // Esto se ejecuta cuando termina Employee().
        System.out.println("Constructor de ExplicitManager");
    }
}

public class ImplicitSuperExample {

    public static void main(String[] args) {
        /*
 * ¿QUÉ OCURRE AL EJECUTAR new Manager()?
 * 1. Comienza la construcción de un objeto Manager.
 * 2. Manager() llama implícitamente a super(), que llama a Employee().
 * 3. Employee() llama implícitamente a Object().
 * 4. Termina Object() y Employee() imprime su mensaje.
 * 5. Termina Employee() y Manager() imprime su mensaje.
 * 
 * Orden de llamadas: Manager() -> Employee() -> Object()
 * En este ejemplo, los cuerpos terminan en orden inverso:
 * Object() -> Employee() -> Manager()
 * Los constructores inicializan el MISMO objeto Manager.
 * super() no crea un objeto Employee separado.
 */

        System.out.println("=== super() implícito ===");
        Manager manager = new Manager();

        System.out.println();
        System.out.println("=== super() explícito ===");
        ExplicitManager explicitManager = new ExplicitManager();

        /*
 * SALIDA ESPERADA:
 * === super() implícito ===
 * Constructor de Employee
 * Constructor de Manager
 * 
 * === super() explícito ===
 * Constructor de Employee
 * Constructor de ExplicitManager
 * 
 * IMPORTANTE:
 * super() implícito necesita un constructor accesible sin argumentos en
 * la superclase. Si Employee solo declarara Employee(String name),
 * Manager necesitaría una llamada explícita como super("Julian").
 * this(...) llama a otro constructor de la MISMA clase.
 * super(...) llama a un constructor de la SUPERCLASE.
 */
    }
}
