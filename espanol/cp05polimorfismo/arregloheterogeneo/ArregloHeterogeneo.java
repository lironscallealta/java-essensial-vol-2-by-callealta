package espanol.cp05polimorfismo.arregloheterogeneo;

import espanol.cp05polimorfismo.conversiondescendente.*;

public class ArregloHeterogeneo {

    /*
 * En muchos lenguajes, los arreglos suelen ser homogéneos: sus elementos
 * son del mismo tipo. Este arreglo de String con nombres de café es un ejemplo:
 * String cafes[] = {"Espresso", "Java", "Mocha"};
 */

    /*
 * El polimorfismo también permite arreglos heterogéneos. Considera la
 * jerarquía de la figura 4.1 del libro. Un arreglo de referencias Empleado,
 * llamado personal, puede contener objetos Director, Gerente, Secretario,
 * Empleado e Ingeniero. Podemos recorrerlo para mostrar sus datos.
 */
    /*
 * INICIALIZACIÓN DE ARREGLOS: ¿DÓNDE PUEDEN IR ESTAS INSTRUCCIONES?
 * 
 * El cuerpo de una clase admite campos, métodos, constructores y bloques
 * inicializadores. No admite asignaciones sueltas como:
 * empleados[0] = new Empleado2();
 * Esa asignación debe estar dentro de un método, constructor o bloque inicializador.
 * Los siguientes fragmentos son ALTERNATIVAS SEPARADAS.
 * 
 * 1. CAMPO CON UN INICIALIZADOR DE ARREGLO
 * Esta declaración puede aparecer directamente en la clase. Java cuenta los elementos.
 * private Empleado2[] empleados = {
 *     new Empleado2(),
 *     new Director2()
 * };
 * 
 * 2. DENTRO DE UN MÉTODO
 * Los métodos ejecutan instrucciones en secuencia. main() es un punto de
 * entrada, pero otros métodos también pueden inicializar arreglos.
 * public void crearEmpleados() {
 *     Empleado2[] empleados = new Empleado2[2];
 *     empleados[0] = new Empleado2();
 *     empleados[1] = new Director2();
 * }
 * Aquí empleados es local a crearEmpleados(). El método se ejecuta al llamarlo.
 * 
 * 3. DENTRO DE UN CONSTRUCTOR
 * Declara el campo en la clase y llena sus posiciones en el constructor.
 * private Empleado2[] empleados = new Empleado2[2];
 * public ArregloHeterogeneo() {
 *     empleados[0] = new Empleado2();
 *     empleados[1] = new Director2();
 * }
 * La inicialización ocurre al ejecutar new ArregloHeterogeneo().
 * 
 * 4. DENTRO DE UN BLOQUE INICIALIZADOR DE INSTANCIA
 * private Empleado2[] empleados = new Empleado2[2];
 * {
 *     empleados[0] = new Empleado2();
 *     empleados[1] = new Director2();
 * }
 * Este bloque se ejecuta al crear el objeto, antes del cuerpo del constructor
 * en este ejemplo. No se necesita main() para declararlo.
 * 
 * LAS LLAVES TIENEN FUNCIONES DIFERENTES:
 * = { ... } proporciona los elementos iniciales de un arreglo.
 * { ... } directamente en la clase es un bloque inicializador de instancia.
 * new Empleado2[2] crea un arreglo con dos posiciones null.
 * Asignar new Empleado2() o new Director2() llena esas posiciones.
 * El método main() de abajo utiliza la opción 2.
 */
    public static void main(String[] argumentos) {
        Empleado2 personal[] = new Empleado2[5];
        personal[0] = new Empleado2();
        personal[1] = new Director2();
        personal[2] = new Gerente2();
        personal[3] = new Gerente2();
        personal[4] = new Director2();

        // Continuar en la página 295.

    }

}
