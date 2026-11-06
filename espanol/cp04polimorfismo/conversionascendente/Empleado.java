package espanol.cp04polimorfismo.conversionascendente;

public class Empleado {

    private String nombre;

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerDetalles() {
        return "Nombre: " + nombre;
    }
}
