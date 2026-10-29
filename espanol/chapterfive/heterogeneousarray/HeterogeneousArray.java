package espanol.chapterfive.heterogeneousarray;

import espanol.chapterfive.downcasting.*;

public class HeterogeneousArray {

    /*
 * En muchos lenguajes, los arreglos suelen ser homogéneos: sus elementos
 * son del mismo tipo. Este arreglo de String con nombres de café es un ejemplo:
 * String coffee[] = {"Espresso", "Java", "Mocha"};
 */

    /*
 * El polimorfismo también permite arreglos heterogéneos. Considera la
 * jerarquía de la figura 4.1 del libro. Un arreglo de referencias Employee,
 * llamado staff, puede contener objetos Director, Manager, Secretary,
 * Employee e Engineer. Podemos recorrerlo para mostrar sus datos.
 */
    /*
 * INICIALIZACIÓN DE ARREGLOS: ¿DÓNDE PUEDEN IR ESTAS INSTRUCCIONES?
 * 
 * El cuerpo de una clase admite campos, métodos, constructores y bloques
 * inicializadores. No admite asignaciones sueltas como:
 * employees[0] = new Employee2();
 * Esa asignación debe estar dentro de un método, constructor o bloque inicializador.
 * Los siguientes fragmentos son ALTERNATIVAS SEPARADAS.
 * 
 * 1. CAMPO CON UN INICIALIZADOR DE ARREGLO
 * Esta declaración puede aparecer directamente en la clase. Java cuenta los elementos.
 * private Employee2[] employees = {
 *     new Employee2(),
 *     new Director2()
 * };
 * 
 * 2. DENTRO DE UN MÉTODO
 * Los métodos ejecutan instrucciones en secuencia. main() es un punto de
 * entrada, pero otros métodos también pueden inicializar arreglos.
 * public void createEmployees() {
 *     Employee2[] employees = new Employee2[2];
 *     employees[0] = new Employee2();
 *     employees[1] = new Director2();
 * }
 * Aquí employees es local a createEmployees(). El método se ejecuta al llamarlo.
 * 
 * 3. DENTRO DE UN CONSTRUCTOR
 * Declara el campo en la clase y llena sus posiciones en el constructor.
 * private Employee2[] employees = new Employee2[2];
 * public HeterogeneousArray() {
 *     employees[0] = new Employee2();
 *     employees[1] = new Director2();
 * }
 * La inicialización ocurre al ejecutar new HeterogeneousArray().
 * 
 * 4. DENTRO DE UN BLOQUE INICIALIZADOR DE INSTANCIA
 * private Employee2[] employees = new Employee2[2];
 * {
 *     employees[0] = new Employee2();
 *     employees[1] = new Director2();
 * }
 * Este bloque se ejecuta al crear el objeto, antes del cuerpo del constructor
 * en este ejemplo. No se necesita main() para declararlo.
 * 
 * LAS LLAVES TIENEN FUNCIONES DIFERENTES:
 * = { ... } proporciona los elementos iniciales de un arreglo.
 * { ... } directamente en la clase es un bloque inicializador de instancia.
 * new Employee2[2] crea un arreglo con dos posiciones null.
 * Asignar new Employee2() o new Director2() llena esas posiciones.
 * El método main() de abajo utiliza la opción 2.
 */
    public static void main(String[] args) {
        Employee2 staff[] = new Employee2[5];
        staff[0] = new Employee2();
        staff[1] = new Director2();
        staff[2] = new Manager2();
        staff[3] = new Manager2();
        staff[4] = new Director2();

        // Continuar en la página 295.

    }

}
