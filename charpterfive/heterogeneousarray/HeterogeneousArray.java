package charpterfive.heterogeneousarray;

import charpterfive.downcasting.*;

public class HeterogeneousArray {

    /*
     * In most programming languages, arrays are usually homogeneous in nature. A
     * homogeneous array will always have element values of the same type. Consider
     * this array of String objects that represents our favorite coffee concoction.
     * This is an example of a homogeneous array.
     * 
     * String coffee[] = {"Espresso", "Java", "Mocha
     */

    /*
     * With polymorphism, a heterogeneous array is also possible. Consider the
     * hierarchy in Figure 4.1 given earlier. Let us say you have an array of
     * Employee objects called staff[], and your boss wants you to display all the
     * details of all the employee objects, which include a variety of different
     * employee objects like Director, Manager, Secretary, Employee, and Engineer
     * objects.
     */
    /*
     * ARRAY INITIALIZATION: WHERE CAN THESE STATEMENTS GO?
     *
     * A class body can contain field declarations, methods, constructors,
     * and initializer blocks. It cannot contain standalone assignments such as:
     *
     * employees[0] = new Employee2();
     *
     * That assignment must be inside a method, a constructor, or an
     * initializer block.
     *
     * The snippets below are SEPARATE ALTERNATIVES, not code to paste
     * together into the same class.
     *
     * 1. FIELD WITH AN ARRAY INITIALIZER
     *
     * This is one field declaration with an initializer, so it can appear
     * directly in a class body. Java counts the elements.
     *
     * private Employee2[] employees = {
     *     new Employee2(),
     *     new Director2()
     * };
     *
     * 2. INSIDE A METHOD
     *
     * Methods can execute statements one after another.
     * main() is an entry point, but it is not the only method that can do this.
     *
     * public void createEmployees() {
     *     Employee2[] employees = new Employee2[2];
     *     employees[0] = new Employee2();
     *     employees[1] = new Director2();
     * }
     *
     * In this version, employees is a local variable, available only
     * inside createEmployees(). The method runs when it is called.
     *
     * 3. INSIDE A CONSTRUCTOR
     *
     * Declare the field in the class and fill its positions in the constructor.
     *
     * private Employee2[] employees = new Employee2[2];
     *
     * public HeterogeneousArray() {
     *     employees[0] = new Employee2();
     *     employees[1] = new Director2();
     * }
     *
     * This initialization happens when new HeterogeneousArray() is executed.
     *
     * 4. INSIDE AN INSTANCE INITIALIZER BLOCK
     *
     * private Employee2[] employees = new Employee2[2];
     *
     * {
     *     employees[0] = new Employee2();
     *     employees[1] = new Director2();
     * }
     *
     * This block also runs during object creation, before the constructor body
     * in this example. No main() method is needed to declare it.
     *
     * BRACES HAVE DIFFERENT ROLES:
     * = { ... } supplies the initial elements of an array.
     * { ... } directly in the class body is an instance initializer block.
     *
     * new Employee2[2] creates an array with two null positions.
     * Assigning new Employee2() or new Director2() fills those positions.
     *
     * The main() method below uses option 2: separate statements in a method.
     */
    public static void main(String[] args) {
        Employee2 staff[] = new Employee2[5];
        staff[0] = new Employee2();
        staff[1] = new Director2();
        staff[2] = new Manager2();
        staff[3] = new Manager2();
        staff[4] = new Director2();

    }

}
