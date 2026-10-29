package espanol.cp04herenciasobrecargayconstructores.sobrecargadeconstructores;

import java.util.Date;

public class EjemploSobrecargaDeConstructores {

    public static void main(String[] argumentos) {

        // Nombre, sueldo y fecha de nacimiento.
        Empleado persona1 = new Empleado("Julian", 20000, new Date());

        // Nombre y sueldo: fechaNacimiento queda en null.
        
        Empleado persona2 = new Empleado("Julian", 20000);

        // Nombre y fecha de nacimiento: el sueldo predeterminado es SUELDO_BASE (15000).
        Empleado persona3 = new Empleado("Julian", new Date());
        System.out.println(persona1.obtenerDetalles());
        persona1.toString();
        System.out.println(persona1.hashCode());
    }
}