package espanol.cp04herenciasobrecargayconstructores.sobrescrituradeobject;

public class Persona extends Object {

    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos de consulta (metodosDeConsulta).
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    // Sobrescribe el método equals.
    @Override
    public boolean equals(Object objeto) {
        boolean resultado = false;

        if (objeto != null && objeto instanceof Persona) {
            Persona p = (Persona) objeto;

            if (this.obtenerNombre().equals(p.obtenerNombre())
                    && this.obtenerEdad() == p.obtenerEdad()) {
                resultado = true;
            }
        }

        return resultado;
    }

    // Sobrescribe el método hashCode.
    @Override
    public int hashCode() {
        return obtenerNombre().hashCode() ^ obtenerEdad();
    }

    // Sobrescribe el método toString.
    @Override
    public String toString() {
        return obtenerNombre() + ", con edad " + obtenerEdad();
    }
}
