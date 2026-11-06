package espanol.cp05otrascaracteristicasdelasclases.clasesutilitarias;

public class LasClasesMathYSystem {

    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.max(20, 30));
    }

    /*
     * Math y System tienen constructores privados, por lo que no puedes
     * crear instancias de estas clases desde tu código. Sus miembros
     * estáticos públicos se acceden mediante el nombre de la clase,
     * como Math.PI y System.out.
     * System.out es un atributo estático que referencia un objeto PrintStream;
     * println() es un método de instancia que se llama sobre ese objeto.
     */
}
