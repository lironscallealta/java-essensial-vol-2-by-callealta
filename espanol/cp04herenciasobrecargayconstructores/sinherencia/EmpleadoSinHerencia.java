package espanol.cp04herenciasobrecargayconstructores.sinherencia;

import java.util.Date;

public class EmpleadoSinHerencia {
    public String nombre = "";
    public double sueldo;
    public Date fechaNacimiento;

    public String obtenerDetalles() {
        
        return String.format("nombre: %s.%nSueldo: %.2f.%nFecha de nacimiento: %s.", nombre, sueldo, fechaNacimiento);
    }
}
