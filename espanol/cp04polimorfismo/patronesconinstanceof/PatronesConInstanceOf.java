package espanol.cp04polimorfismo.patronesconinstanceof;

public class PatronesConInstanceOf {

    public static void main(String[] args) {
        Object datos = "Patrones en Java";
        if (datos instanceof String str) {
            System.out.println("Longitud = " + str.length() + " caracteres");

        }
        /*
 * Otro ejemplo usa un patrón con una clase propia.
 *
 * if (figura instanceof Circulo c) {
 *     System.out.println("Radio: " + c.obtenerRadio());
 * }
 */

        Object obj = "Hola Java";
        Object otroObjeto = "hola";

        if (obj instanceof String str && str.length() > 5) {
            System.out.println("La cadena tiene más de 5 caracteres: " + str);

        } else {
            System.out.println("La cadena tiene 5 caracteres o menos: " + obj);
        }

        if (otroObjeto instanceof String str && str.length() > 5) {
            System.out.println("La cadena tiene más de 5 caracteres: " + str);

        } else {
            System.out.println("La cadena tiene 5 caracteres o menos: " + otroObjeto);
        }

    }

}
