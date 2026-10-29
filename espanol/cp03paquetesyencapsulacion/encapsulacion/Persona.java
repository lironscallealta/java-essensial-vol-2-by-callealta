package espanol.cp03paquetesyencapsulacion.encapsulacion;

// Persona.java
public class Persona {

    private String nombre;
    private int edad;

    // Métodos de modificación (metodosDeModificacion).
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerEdad(int a) {
        if (a >= 0) {
            edad = a;
        } else {
            edad = 0;
        }
    }

    // Métodos de consulta (metodosDeConsulta).
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }
}
