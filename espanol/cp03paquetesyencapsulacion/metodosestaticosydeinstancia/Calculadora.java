package espanol.cp03paquetesyencapsulacion.metodosestaticosydeinstancia;

public class Calculadora {

    // Método de instancia: crea un objeto para llamarlo.
    public int sumarConObjeto(int a, int b) {
        return a + b;
    }

    // Método estático: llámalo utilizando el nombre de la clase.
    public static int sumarSinObjeto(int a, int b) {
        return a + b;
    }

    public static void main(String[] argumentos) {
        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.sumarConObjeto(3, 4);
        int resultado2 = Calculadora.sumarSinObjeto(3, 4);

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}