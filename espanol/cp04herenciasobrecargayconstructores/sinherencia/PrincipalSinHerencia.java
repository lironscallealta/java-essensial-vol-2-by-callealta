package espanol.cp04herenciasobrecargayconstructores.sinherencia;

import java.util.Date;

public class PrincipalSinHerencia {

    public static void main(String[] argumentos) {

        System.out.println("-----------------------------------------------------------------");
        EmpleadoSinHerencia empleadoSinHerencia = new EmpleadoSinHerencia();
        empleadoSinHerencia.nombre = "Pedro";
        empleadoSinHerencia.sueldo = 10.45;
        System.out.println(empleadoSinHerencia.obtenerDetalles());

        System.out.printf("%n");

        System.out.println("-----------------------------------------------------------------");
        GerenteSinHerencia gerenteSinHerencia = new GerenteSinHerencia();
        gerenteSinHerencia.nombre = "Pedro";
        gerenteSinHerencia.sueldo = 10.45;
        gerenteSinHerencia.departamento = "Ventas";
        System.out.println(gerenteSinHerencia.obtenerDetalles());

    }
}
