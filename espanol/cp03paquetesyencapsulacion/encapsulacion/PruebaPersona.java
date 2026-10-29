package espanol.cp03paquetesyencapsulacion.encapsulacion;



// PruebaPersona.java
public class PruebaPersona {

    public static void main(String[] argumentos) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        // Asigna los nombres.
        persona1.establecerNombre("Lawrence");
        persona2.establecerNombre("Walter");

        // Asigna las edades.
        persona1.establecerEdad(30);
        persona2.establecerEdad(-5);

        System.out.println(persona1.obtenerNombre() + " tiene "
                + persona1.obtenerEdad() + " años.");

        System.out.println(persona2.obtenerNombre() + " tiene "
                + persona2.obtenerEdad() + " años.");

    }
}