package espanol.cp06excepcionesyaserciones.aserciones;


public class PruebaAserciones {
    public static void main(String[] args) {
        // 1. Con los argumentos 15 30, args[0] es "15" y args[1] es "30".
        // parseInt convierte cada String en un int.
        int hora = Integer.parseInt(args[0]); // hora = 15
        int minutos = Integer.parseInt(args[1]); // minutos = 30

        // 2. ¿15 es mayor que 0 y menor que 24? Sí. Continúa.
        assert hora > 0 && hora < 24 : "Hora inválida";

        // 3. ¿30 es mayor que 0 y menor que 60? Sí. Continúa.
        assert minutos > 0 && minutos < 60 : "Minutos inválidos";

        // 4. Ambas comprobaciones se cumplen. Se imprime 15:30.
        System.out.println(hora + ":" + minutos);
    }
}
// -ea activa las aserciones.
// Java omite las aserciones de forma predeterminada.
// Pon -ea antes del archivo .java para activar las aserciones en esa ejecución.
//
// Sin -ea, Java omite ambas aserciones e imprime 105:80.
// java espanol/cp06excepcionesyaserciones/aserciones/PruebaAserciones.java 105 80
//
// Con -ea, Java comprueba la primera aserción. Como 105 < 24 es falso,
// lanza AssertionError con el mensaje "Hora inválida" y se detiene.
// java -ea espanol/cp06excepcionesyaserciones/aserciones/PruebaAserciones.java 105 80


