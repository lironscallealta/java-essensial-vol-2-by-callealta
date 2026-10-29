package espanol.chapterfour.constructoroverloading;

// Manager.java

public class Manager extends Employee {

    private String dept;

    public Manager(String name, double salary, String dept) {
        super(name, salary);
        this.dept = dept;
    }

    /*
 * Este constructor fallaría porque Java llama implícitamente a super(),
 * pero Employee no tiene un constructor sin argumentos.
 * public Manager(String dept) {
 *     this.dept = dept;
 * }
 */

    // Código adicional de Manager...
}

