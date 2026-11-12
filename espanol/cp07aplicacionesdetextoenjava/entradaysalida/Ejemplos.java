package espanol.cp07aplicacionesdetextoenjava.entradaysalida;

public class Ejemplos {

    public static void main(String[] args) {

        String textoEntero = "100";
        System.out.println(textoEntero.getClass().getSimpleName());
        byte b = Byte.parseByte(textoEntero);// Convierte a byte
        System.out.println(b + " - byte");
        short s = Short.parseShort(textoEntero);// Convierte a short
        System.out.println(s + " - short");
        int i = Integer.parseInt(textoEntero);// Convierte a int
        System.out.println(i + " - int");
        long enteroLargo = Long.parseLong(textoEntero);// Convierte a long
        System.out.println(enteroLargo + " - long");

        String textoDecimal = "1.1";
        System.out.println("Número: " + textoDecimal);
        float f = Float.parseFloat(textoDecimal); // Convierte a float
        System.out.println(f + " - float");
        double d = Double.parseDouble(textoDecimal); // Convierte a double
        System.out.println(d + " - double");

        String str = "true";
        System.out.println(str + ": String");

        boolean valorBooleano = Boolean.parseBoolean(str); // Convierte a boolean
        System.out.println(valorBooleano + ": tipo boolean");
        /*
 * Estas conversiones sirven para interpretar opciones de configuración o preferencias representadas como cadenas. Así puedes usar cada valor con el tipo que requiere el programa.
 */

    }

}
