package espanol.cp04herenciasobrecargayconstructores.ejercicios.desarrollo.ejerciciouno;

public class Estudiante extends Object {

    protected String nombre;
    protected int identificadorEstudiante;
    protected String curso;

    public Estudiante(String nombre, int identificadorEstudiante, String curso) {

    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtenerIdentificadorEstudiante() {
        return identificadorEstudiante;
    }

    public void establecerIdentificadorEstudiante(int identificadorEstudiante) {
        this.identificadorEstudiante = identificadorEstudiante;
    }

    public String obtenerCurso() {
        return curso;
    }

    public void establecerCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", identificador=" + identificadorEstudiante + ", curso=" + curso + "]";
    }

    @Override
    public int hashCode() {
        final int primo = 31;
        int resultado = 1;
        resultado = primo * resultado + ((nombre == null) ? 0 : nombre.hashCode());
        resultado = primo * resultado + identificadorEstudiante;
        resultado = primo * resultado + ((curso == null) ? 0 : curso.hashCode());
        return resultado;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto)
            return true;
        if (objeto == null)
            return false;
        if (getClass() != objeto.getClass())
            return false;
        Estudiante otro = (Estudiante) objeto;
        if (nombre == null) {
            if (otro.nombre != null)
                return false;
        } else if (!nombre.equals(otro.nombre))
            return false;
        if (identificadorEstudiante != otro.identificadorEstudiante)
            return false;
        if (curso == null) {
            if (otro.curso != null)
                return false;
        } else if (!curso.equals(otro.curso))
            return false;
        return true;
    }



}