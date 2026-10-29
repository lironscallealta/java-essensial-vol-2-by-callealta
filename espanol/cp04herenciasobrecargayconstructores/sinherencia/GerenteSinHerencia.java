package espanol.cp04herenciasobrecargayconstructores.sinherencia;

import java.util.Date;

import espanol.cp04herenciasobrecargayconstructores.conherencia.Empleado;

public class GerenteSinHerencia {
    public String nombre = "";
    public double sueldo;
    public Date fechaNacimiento;
    public String departamento;

    public String obtenerDetalles() {
        return String.format("nombre: %s.%nSueldo: %.2f.%nFecha de nacimiento: %s.%nDepartamento: %s", nombre, sueldo,
                fechaNacimiento.toString(), departamento);
    }
}