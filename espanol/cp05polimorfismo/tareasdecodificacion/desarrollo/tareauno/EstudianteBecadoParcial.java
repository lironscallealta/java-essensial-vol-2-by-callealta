package espanol.cp05polimorfismo.tareasdecodificacion.desarrollo.tareauno;

public class EstudianteBecadoParcial extends Estudiante {

    private float tasaDescuento;
    private float montoPorPagar;

    EstudianteBecadoParcial(String nombre, String curso, float arancel, float tasaDescuento) {
        super(nombre, curso, arancel);
        this.tasaDescuento = tasaDescuento;
        this.montoPorPagar = super.obtenerArancel() - (super.obtenerArancel() * tasaDescuento);

    }

    public float obtenerTasaDescuento() {
        return tasaDescuento;
    }

    public float obtenerMontoPorPagar() {
        return montoPorPagar;
    }

    public String obtenerNombre() {
        return super.obtenerNombre();
    }

    public float obtenerArancel() {
        return super.obtenerArancel();
    }

    public String obtenerCurso() {
        return super.obtenerCurso();
    }

    @Override
    public String toString() {
        return String.format("%sDescuento: %.2f %% ", super.toString(), tasaDescuento);
    }

}
