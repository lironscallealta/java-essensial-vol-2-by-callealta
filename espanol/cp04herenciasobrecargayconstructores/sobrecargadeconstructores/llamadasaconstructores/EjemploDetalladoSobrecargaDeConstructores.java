package espanol.cp04herenciasobrecargayconstructores.sobrecargadeconstructores.llamadasaconstructores;

public class EjemploDetalladoSobrecargaDeConstructores {

    public static class Empleado {

        // Cuatro campos pertenecientes a cada objeto Empleado.
        private String nombre;
        private int edad;
        private double sueldo;
        private String departamento;

        // CONSTRUCTOR 1: recibe CUATRO parámetros y asigna los campos.
        public Empleado(String nombre, int edad, double sueldo, String departamento) {
            // this.nombre es el campo; nombre es el parámetro.
            this.nombre = nombre;
            this.edad = edad;
            this.sueldo = sueldo;
            this.departamento = departamento;
        }

        // CONSTRUCTOR 2: este bloque DECLARA un constructor con DOS parámetros.
        public Empleado(String nombre, int edad) {
            // Llama al constructor 1 con CUATRO argumentos.
            // Quien llama proporciona nombre y edad.
            // Este constructor proporciona el sueldo y departamento predeterminados.
            this(nombre, edad, 0.0, "Sin asignar");
        }

        // CONSTRUCTOR 3: recibe CERO parámetros.
        public Empleado() {
            // Llama al constructor 2 con DOS argumentos.
            // Ese constructor existe: lo declaramos arriba.
            this("Julian", 25);
        }

        public String obtenerDetalles() {
            return "Nombre: " + nombre
                    + "\nEdad: " + edad
                    + "\nSueldo: " + sueldo
                    + "\nDepartamento: " + departamento;
        }
    }

    public static void main(String[] argumentos) {
        /*
 * Hay TRES constructores aunque solo uno asigna los campos.
 * new Empleado() sigue esta cadena:
 * Constructor 3: Empleado()
 *     -> this("Julian", 25)
 * Constructor 2: Empleado(String nombre, int edad)
 *     -> this(nombre, edad, 0.0, "Sin asignar")
 * Constructor 1: Empleado(String nombre, int edad, double sueldo, String departamento)
 *     -> asigna los cuatro campos.
 * Los tres constructores trabajan sobre el MISMO objeto.
 * Una llamada this(...) no crea otro Empleado.
 */

        Empleado empleado = new Empleado();
        System.out.println(empleado.obtenerDetalles());

        /*
 * IMPORTANTE:
 * this.nombre = nombre; asigna un valor a un campo.
 * this(nombre, edad); llama a un constructor existente cuyos parámetros
 * corresponden a los argumentos. No asigna campos automáticamente ni declara
 * un constructor nuevo.
 * Si solo existiera el constructor de cuatro parámetros, this("Julian", 25)
 * fallaría porque no habría un constructor de dos parámetros.
 * Un constructor no puede llamarse a sí mismo, directa ni indirectamente.
 */
    }
}
