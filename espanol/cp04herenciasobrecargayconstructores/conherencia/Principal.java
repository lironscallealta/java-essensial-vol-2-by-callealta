package espanol.cp04herenciasobrecargayconstructores.conherencia;

public class Principal {

    public static void main(String[] argumentos) {
        Gerente gerente = new Gerente();
        gerente.nombre = "Julian";
        gerente.departamento = "Ventas";
        System.out.println("----Gerente----");
        System.out.println(gerente.obtenerDetalles()); 
        
        System.out.printf("%n");

        Empleado empleado = new Empleado();
        empleado.nombre = "Peña";
        System.out.println("----Empleado----");
        System.out.println(empleado.obtenerDetalles());
    }

}
