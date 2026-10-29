package espanol.cp04herenciasobrecargayconstructores.sobrecargadeconstructores;

// Gerente.java

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    /*
 * Este constructor fallaría porque Java llama implícitamente a super(),
 * pero Empleado no tiene un constructor sin argumentos.
 * public Gerente(String departamento) {
 *     this.departamento = departamento;
 * }
 */

    // Código adicional de Gerente...
}

