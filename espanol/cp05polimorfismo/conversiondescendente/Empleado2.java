package espanol.cp05polimorfismo.conversiondescendente;

public class Empleado2 {

    String nombre;
    double sueldo;

    public String obtenerDetalles() {
        return "Nombre: " + nombre
                + "\nSueldo: " + sueldo;
    }

    public void trabajar() {
        System.out.println("Trabajar, trabajar, trabajar...");
    }
}