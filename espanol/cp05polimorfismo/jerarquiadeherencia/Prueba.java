package espanol.cp05polimorfismo.jerarquiadeherencia;

import java.util.Date;

/*
 * REFERENCIA UML — LIBRO, PÁGINA 276
 *
 * Árbol de herencia (cada clase hija extiende la clase superior):
 *
 * Empleado
 *   +-- Ingeniero
 *   +-- Gerente
 *   |     +-- Director
 *   +-- Secretario
 *
 * Clases y miembros que aparecen en el libro:
 *
 * +------------------------------------+
 * | Empleado                           |
 * +------------------------------------+
 * | +nombre: String = " "                |
 * | +sueldo: double                    |
 * | +fechaNacimiento: Date                   |
 * +------------------------------------+
 * | +obtenerDetalles(): String              |
 * +------------------------------------+
 *
 * +------------------------------------+
 * | Gerente                            |
 * +------------------------------------+
 * | +departamento: String = " "          |
 * +------------------------------------+
 *
 * +------------------------------------+
 * | Director                           |
 * +------------------------------------+
 * | +asignacionAutomovil: double              |
 * +------------------------------------+
 * | +aumentarAsignacion()               |
 * +------------------------------------+
 *
 * Ingeniero y Secretario extienden Empleado.
 * El diagrama no muestra campos ni métodos adicionales para esas clases.
 *
 * LEYENDA UML:
 * + significa public.
 * nombre: Type describe un campo y su tipo.
 * method(): Type describe un método y su tipo de retorno.
 *
 * NOTAS DEL PROYECTO:
 * Empleado se llama EjemploEmpleadoDos en este paquete.
 * El diagrama usa campos públicos (+). EjemploEmpleadoDos utiliza
 * campos privados con métodos de consulta y modificación.
 * Este comentario documenta el UML del libro sin modificar las clases Java.
 */
public class Prueba {

    public static void main(String[] argumentos) {

        EjemploEmpleadoDos e1 = new Gerente();
        EjemploEmpleadoDos e2 = new Ingeniero();
        EjemploEmpleadoDos e3 = new Secretario();
        EjemploEmpleadoDos e4 = new Director();

        System.out.println(e1.obtenerDetalles());
        System.out.println(e2.obtenerDetalles());
        System.out.println(e3.obtenerDetalles());
        System.out.println(e4.obtenerDetalles());

    }

}
