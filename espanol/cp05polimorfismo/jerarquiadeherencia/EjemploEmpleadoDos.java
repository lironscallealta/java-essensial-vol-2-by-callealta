package espanol.cp05polimorfismo.jerarquiadeherencia;
import java.util.Date;

public class EjemploEmpleadoDos {

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void establecerSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date obtenerFechaNacimiento() {
        return fechaNacimiento;
    }

    public void establecerFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    private String nombre;
    private double sueldo;
    private Date fechaNacimiento;

    public String obtenerDetalles(){
        return nombre + " - " + sueldo + " - " + fechaNacimiento;
    }

}
