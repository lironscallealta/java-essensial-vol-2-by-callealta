package espanol.cp06otrascaracteristicasdelasclases.importacionesestaticas;

import static java.lang.Math.*;
import static java.lang.System.out;

/*
 * Sintaxis de una importación estática:
 * import static paquete.Clase.miembro;
 *
 * Para importar todos los miembros estáticos accesibles:
 * import static paquete.Clase.*;
 */
public class ImportacionesEstaticas {

    public static void main(String[] args) {
        out.println(PI);
        out.println(max(20, 50));
    }
}
