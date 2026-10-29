package espanol.cp01fundamentos;
public class Estudiante {

    String nombre;
    int edad;
    double nota;

    Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public Estudiante() {
       
    }

    public void imprimirDetalles() {
        System.out.printf("tu nombre es %s y tienes %d tu grado es %.2f%n", nombre, edad, nota);   
    }

}
//eliminar luego este texto
