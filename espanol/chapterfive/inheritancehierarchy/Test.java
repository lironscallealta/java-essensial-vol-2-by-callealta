package espanol.chapterfive.inheritancehierarchy;

import java.util.Date;

/*
 * REFERENCIA UML — LIBRO, PÁGINA 276
 *
 * Árbol de herencia (cada clase hija extiende la clase superior):
 *
 * Employee
 *   +-- Engineer
 *   +-- Manager
 *   |     +-- Director
 *   +-- Secretary
 *
 * Clases y miembros que aparecen en el libro:
 *
 * +------------------------------------+
 * | Employee                           |
 * +------------------------------------+
 * | +name: String = " "                |
 * | +salary: double                    |
 * | +birthDate: Date                   |
 * +------------------------------------+
 * | +getDetails(): String              |
 * +------------------------------------+
 *
 * +------------------------------------+
 * | Manager                            |
 * +------------------------------------+
 * | +department: String = " "          |
 * +------------------------------------+
 *
 * +------------------------------------+
 * | Director                           |
 * +------------------------------------+
 * | +carAllowance: double              |
 * +------------------------------------+
 * | +increaseAllowance()               |
 * +------------------------------------+
 *
 * Engineer y Secretary extienden Employee.
 * El diagrama no muestra campos ni métodos adicionales para esas clases.
 *
 * LEYENDA UML:
 * + significa public.
 * name: Type describe un campo y su tipo.
 * method(): Type describe un método y su tipo de retorno.
 *
 * NOTAS DEL PROYECTO:
 * Employee se llama EmployeeExampleTwo en este paquete.
 * El diagrama usa campos públicos (+). EmployeeExampleTwo utiliza
 * campos privados con métodos de consulta y modificación.
 * Este comentario documenta el UML del libro sin modificar las clases Java.
 */
public class Test {

    public static void main(String[] args) {

        EmployeeExampleTwo e1 = new Manager();
        EmployeeExampleTwo e2 = new Engineer();
        EmployeeExampleTwo e3 = new Secretary();
        EmployeeExampleTwo e4 = new Director();

        System.out.println(e1.getDetails());
        System.out.println(e2.getDetails());
        System.out.println(e3.getDetails());
        System.out.println(e4.getDetails());

    }

}
