package espanol.cp06excepcionesyaserciones.manejodeexcepciones;

public class UnaClase {

    public static void main(String[] args) throws Exception {
        
        // La excepción sin capturar se propaga hasta aquí
        // desde metodo1() y provoca
        // la terminación anormal del programa.
        metodo1();
    }
    public static void metodo1() throws Exception {
        
        // La excepción sin capturar se propaga desde
        // metodo2() hacia main().
        metodo2();    
    }
    public static void metodo2() throws Exception {
        
        // Esta línea lanza una
        // Exception que se propaga a metodo1().
        throw new Exception();    
    }
}
