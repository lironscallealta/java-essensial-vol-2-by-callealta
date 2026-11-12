package espanol.cp06excepcionesyaserciones.excepcionespropias;

import java.util.Scanner;

class ExcepcionInicioSesion extends RuntimeException { // excepción no comprobada
}

public class EjemploOtraExcepcionPropia {
    private static String usuario = "admin";
    private static String contrasena = "password";

    public static void main(String[] args) {
        // El try con recursos hace que Scanner
        // se cierre automáticamente.
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Ingresa tu nombre de usuario: ");
            String nombreUsuario = s.nextLine();

            System.out.println("Ingresa tu contraseña: ");
            String clave = s.nextLine();

            if (nombreUsuario.equals(usuario) && clave.equals(contrasena)) {
                System.out.println("Acceso concedido");
            } else {
                throw new ExcepcionInicioSesion();
            }
        } catch (ExcepcionInicioSesion ae) {
            System.err.println("Usuario o contraseña incorrectos");
        }
    }
}