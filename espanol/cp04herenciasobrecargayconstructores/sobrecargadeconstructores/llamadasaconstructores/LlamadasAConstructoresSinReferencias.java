package espanol.cp04herenciasobrecargayconstructores.sobrecargadeconstructores.llamadasaconstructores;

import java.util.Date;

import espanol.cp04herenciasobrecargayconstructores.sobrecargadeconstructores.Empleado;

public class LlamadasAConstructoresSinReferencias {

    public static void main(String[] argumentos) {

        // Nombre, sueldo y fecha de nacimiento.
         new Empleado("Julian", 20000, new Date());

        // Nombre y sueldo: fechaNacimiento queda en null.
        
         new Empleado("Julian", 20000);

        // Nombre y fecha de nacimiento: el sueldo predeterminado es SUELDO_BASE (15000).
        new Empleado("Julian", new Date());
 
    }
}