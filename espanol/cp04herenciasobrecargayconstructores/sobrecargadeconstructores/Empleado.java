package espanol.cp04herenciasobrecargayconstructores.sobrecargadeconstructores;

import java.util.Date;

public class Empleado {

    private String nombre;
    private Date fechaNacimiento;
    private double sueldo;
    private static final double SUELDO_BASE = 15000.00;

    public Empleado(String nombre, double sueldo, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaNacimiento = fechaDeNacimiento;
    }

    public Empleado(String nombre, double sueldo) {
        this(nombre, sueldo, null);
    }

    public Empleado(String nombre, Date fechaDeNacimiento) {
        this(nombre, SUELDO_BASE, fechaDeNacimiento);
    }

    public String obtenerDetalles() {
        return "Nombre: " + nombre + "\nSueldo: "
                + sueldo + "\nFecha de nacimiento: " + fechaNacimiento;
    }
}
