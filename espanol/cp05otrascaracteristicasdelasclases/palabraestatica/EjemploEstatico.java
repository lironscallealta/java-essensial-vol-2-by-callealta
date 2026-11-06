package espanol.cp05otrascaracteristicasdelasclases.palabraestatica;

public class EjemploEstatico {

    public static int contador = 0;
    private int numeroDeSerie;

    public EjemploEstatico() {
        contador++;
        numeroDeSerie = contador;
    }

    public static void main(String[] args) {
        System.out.println("Creando el primer objeto: ");
        EjemploEstatico ejemplo1 = new EjemploEstatico();
        System.out.println("Creando el segundo objeto: ");
        EjemploEstatico ejemplo2 = new EjemploEstatico();

        System.out.println("Se crearon " + contador + " objetos en total.");

        // Mostrar el número de serie de cada objeto.
        System.out.println(ejemplo1.numeroDeSerie);
        // Se puede acceder al atributo privado porque estamos dentro de la misma clase.
        System.out.println(ejemplo2.numeroDeSerie);

        // El contador pertenece a la clase y se comparte entre sus objetos.
        System.out.println(EjemploEstatico.contador);
    }

    /*
     * En Java, static indica que un miembro pertenece a la clase,
     * en lugar de pertenecer a cada objeto individual.
     * Se puede usar en atributos, métodos y clases anidadas:
     *
     * class Biblioteca {
     *     static int cantidadDeLibros;
     *
     *     static class Libro {
     *         String titulo;
     *     }
     * }
     *
     * Una clase de nivel superior no puede declararse static porque no es
     * miembro de otra clase. Una clase anidada sí puede ser static porque
     * es miembro de la clase que la contiene.
     *
     * Los métodos estáticos se pueden llamar sin crear un objeto:
     * int suma = EjemploMatematico.sumar(2, 3);
     *
     * Los métodos de instancia se llaman mediante un objeto. Un método
     * estático necesita una referencia a un objeto para acceder a sus
     * atributos y métodos de instancia.
     */
}
