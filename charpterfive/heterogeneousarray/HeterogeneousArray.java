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
    public static void main(String[] args) {
        Employee2 employee2[] = new Employee2[5];
        employee2[0] = new Employee2();
        employee2[1] = new Director2();
        employee2[2] = new Manager2();
        employee2[3] = new Manager2();
        employee2[4] = new Director2();

    }

}
