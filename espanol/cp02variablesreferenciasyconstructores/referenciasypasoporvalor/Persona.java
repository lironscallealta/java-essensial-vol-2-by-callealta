package espanol.cp02variablesreferenciasyconstructores.referenciasypasoporvalor;

/** Clase de apoyo utilizada por EjemploAsignacionDeReferencias y EjemploPasoPorValor. */
public class Persona {
    public String nombre = "~sin nombre";
    public int edad = 0;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {

    }

    public String imprimirDetalles() {
        return nombre + " con edad " + edad;
    }

    public void establecerEdad(int edad) {
        this.edad = edad;
        
    }
}
