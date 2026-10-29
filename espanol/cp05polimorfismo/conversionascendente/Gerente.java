package espanol.cp05polimorfismo.conversionascendente;

public class Gerente extends Empleado {

    private String departamento;

    public void establecerDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " - Departamento: " + departamento;
    }
}
