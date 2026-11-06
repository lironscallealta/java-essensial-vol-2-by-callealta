package espanol.cp05otrascaracteristicasdelasclases.interfacesjava;

// Todos los atributos de una interfaz son implicitamente public static final.
// Las siete declaraciones de pi tienen los mismos modificadores.
// Por convencion, las constantes suelen escribirse PI.
// Las interfaces no tienen constructores y no se pueden instanciar directamente.
// Una interfaz puede extender varias interfaces. Una clase puede extender una sola clase
// e implementar varias interfaces.
// Estos metodos ordinarios sin cuerpo en interfaces son implicitamente public abstract.
// Una interfaz de nivel superior puede ser public o tener acceso de paquete.
// Las interfaces anidadas son implicitamente static y tambien pueden ser private o protected.

public class InterfazJava {

    interface I1 {
        double pi = 3.14;
    }

    interface I2 {
        public double pi = 3.14;
    }

    interface I3 {
        static double pi = 3.14;
    }

    interface I4 {
        final double pi = 3.14;
    }

    interface I5 {
        public static double pi = 3.14;
    }

    interface I6 {
        public static final double pi = 3.14;
    }

    interface I7 {
        public final double pi = 3.14;
    }

    public static void main(String[] args) {
        System.out.println(I1.pi); 

    }
}
