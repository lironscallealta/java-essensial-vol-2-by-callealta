package espanol.cp06otrascaracteristicasdelasclases.enumeraciones;

// Cada constante pasa su descripcion y posicion al constructor del enum.
// Estos atributos pertenecen a cada planeta: son final, pero no static.
// Las constantes del enum si son implicitamente public static final.
// Los metodos obtenerDescripcion() y obtenerPosicion() permiten leer los atributos privados.

public class EjemploPlanetaConDatos {

    enum Planeta {
        MERCURIO("Planeta Mercurio", 1),
        VENUS("Planeta Venus", 2),
        TIERRA("Planeta Tierra", 3),
        MARTE("Planeta Marte", 4);

        private final String descripcion;
        private final int posicion;

        Planeta(String descripcion, int posicion) {
            this.descripcion = descripcion;
            this.posicion = posicion;
        }

        public String obtenerDescripcion() {
            return descripcion;
        }

        public int obtenerPosicion() {
            return posicion;
        }
    }

    public static void main(String[] args) {
        Planeta planeta = Planeta.TIERRA;

        System.out.println(planeta); 
        System.out.println(planeta.obtenerDescripcion()); 
        System.out.println(planeta.obtenerPosicion()); 
    }
}
