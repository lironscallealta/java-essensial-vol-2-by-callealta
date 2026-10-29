package espanol.cp04herenciasobrecargayconstructores.conherencia;

import java.util.Date;

public class Empleado {

    public String nombre ="N.N";
    public double sueldo;
    public Date fechaNacimiento = new Date();

    public String obtenerDetalles() {
        return String.format("nombre: %s.%nSueldo: %.2f.%nFecha de nacimiento: %s.", nombre, sueldo, fechaNacimiento.toString());
    }

}

