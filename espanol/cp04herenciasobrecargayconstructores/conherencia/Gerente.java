package espanol.cp04herenciasobrecargayconstructores.conherencia;

public class Gerente extends Empleado {

    public String departamento;

    @Override
    public String obtenerDetalles() {
        return String.format(
                "%s%nDepartamento: %s%nObjeto: %s",
                super.obtenerDetalles(),
                departamento,
                this);
    }

}
