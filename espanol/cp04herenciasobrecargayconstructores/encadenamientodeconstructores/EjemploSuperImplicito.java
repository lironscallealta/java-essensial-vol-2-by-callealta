package espanol.cp04herenciasobrecargayconstructores.encadenamientodeconstructores;

class Empleado {

    public Empleado() {
        // Empleado también hereda implícitamente de Object.
        // Java proporciona super() para llamar al constructor de Object.
        System.out.println("Constructor de Empleado");
    }
}

class Gerente extends Empleado {

    public Gerente() {
        /*
 * No escribimos this(...) ni super(...), así que Java proporciona una
 * llamada implícita a super(). El constructor se comporta como si escribiéramos:
 * public Gerente() {
 *     super(); // Llama a Empleado().
 *     System.out.println("Constructor de Gerente");
 * }
 * Java no agrega texto a este archivo: el compilador incluye la llamada
 * en el código compilado.
 */
        System.out.println("Constructor de Gerente");
    }
}

class GerenteExplicito extends Empleado {

    public GerenteExplicito() {
        // Aquí escribimos explícitamente la llamada al constructor de la superclase.
        super();

        // Esto se ejecuta cuando termina Empleado().
        System.out.println("Constructor de GerenteExplicito");
    }
}

public class EjemploSuperImplicito {

    public static void main(String[] argumentos) {
        /*
 * ¿QUÉ OCURRE AL EJECUTAR new Gerente()?
 * 1. Comienza la construcción de un objeto Gerente.
 * 2. Gerente() llama implícitamente a super(), que llama a Empleado().
 * 3. Empleado() llama implícitamente a Object().
 * 4. Termina Object() y Empleado() imprime su mensaje.
 * 5. Termina Empleado() y Gerente() imprime su mensaje.
 * 
 * Orden de llamadas: Gerente() -> Empleado() -> Object()
 * En este ejemplo, los cuerpos terminan en orden inverso:
 * Object() -> Empleado() -> Gerente()
 * Los constructores inicializan el MISMO objeto Gerente.
 * super() no crea un objeto Empleado separado.
 */

        System.out.println("=== super() implícito ===");
        Gerente gerente = new Gerente();

        System.out.println();
        System.out.println("=== super() explícito ===");
        GerenteExplicito gerenteExplicito = new GerenteExplicito();

        /*
 * SALIDA ESPERADA:
 * === super() implícito ===
 * Constructor de Empleado
 * Constructor de Gerente
 * 
 * === super() explícito ===
 * Constructor de Empleado
 * Constructor de GerenteExplicito
 * 
 * IMPORTANTE:
 * super() implícito necesita un constructor accesible sin argumentos en
 * la superclase. Si Empleado solo declarara Empleado(String nombre),
 * Gerente necesitaría una llamada explícita como super("Julian").
 * this(...) llama a otro constructor de la MISMA clase.
 * super(...) llama a un constructor de la SUPERCLASE.
 */
    }
}
