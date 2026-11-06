package espanol.cp05otrascaracteristicasdelasclases.interfazfuncionalylambda;

@FunctionalInterface
interface Saludador {
    public void saludar(String nombre);
}

public class EjemploLambda {
    public static void main(String[] args) {
        // Ejemplo 1.
        Saludador saludador = (nombre) -> System.out.println("Hola " + nombre);
        saludador.saludar("Pello");

        // Ejemplo 2.
        Saludador otroSaludador = (nombre) -> {
            System.out.print("Hola ");
            System.out.println(nombre);
        };
        otroSaludador.saludar("Lawrence");
    }
}
