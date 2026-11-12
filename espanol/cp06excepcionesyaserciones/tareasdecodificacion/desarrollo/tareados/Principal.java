package espanol.cp06excepcionesyaserciones.tareasdecodificacion.desarrollo.tareados;


import static java.lang.Math.round;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double a = leerLado(entrada, "a");
            double b = leerLado(entrada, "b");
            double c = Pitagoras.teoremaDePitagoras(a, b);
            System.out.println("c = " +  round(c));
        } catch (InputMismatchException e) {
            System.err.println("Ingresa un valor numérico para cada lado.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private static double leerLado(Scanner entrada, String lado) {
        System.out.println("Ingresa el lado " + lado + ":");
        double valor = entrada.nextDouble();

        if (valor < 0) {
            throw new IllegalArgumentException("El lado " + lado + " no puede ser negativo.");
        }

        return valor;
    }
}
