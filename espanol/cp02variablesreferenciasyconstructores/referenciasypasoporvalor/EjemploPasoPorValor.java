package espanol.cp02variablesreferenciasyconstructores.referenciasypasoporvalor;
/** Paso por valor: compara modificar un número, reasignar una referencia y cambiar un atributo. */
public class EjemploPasoPorValor {
    // Métodos para modificar los valores actuales.
    public static void cambiarEntero(int valor) {
        valor = 55;
    }

    public static void cambiarReferenciaDelObjeto(Persona referencia) {
        referencia = new Persona("Walter", 30);
    }

    public static void cambiarAtributoDelObjeto(Persona referencia) {
        referencia.establecerEdad(30);
    }

    public static void main(String[] argumentos) {
        Persona personaOriginal;
        int valorEntero;

        // Asigna el entero.
        valorEntero = 11;

        // Intenta modificarlo.
        cambiarEntero(valorEntero);
       

        // ¿Cuál es el valor actual?
        System.out.println("El valor entero es: " + valorEntero);

        // Asigna la persona.
        personaOriginal = new Persona("Lawrence", 20);

        // Intenta modificarlo.
        cambiarReferenciaDelObjeto(personaOriginal);

       

        // ¿Cuál es el valor actual?
        System.out.println("Persona: " + personaOriginal);

        // Ahora modifica el atributo de edad
        // mediante la referencia al objeto.
        cambiarAtributoDelObjeto(personaOriginal);

        // ¿Cuál es el valor actual?
        System.out.println("Persona: " + personaOriginal);
    }
}
