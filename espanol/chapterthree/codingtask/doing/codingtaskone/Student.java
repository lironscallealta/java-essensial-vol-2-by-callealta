package espanol.chapterthree.codingtask.doing.codingtaskone;

/*
 * Se proporciona código parcial de Student con name, studentNumber y course.
 * Completa los métodos de consulta y modificación y el cuerpo del constructor.
 * Implementa showStudentInformation() para mostrar los tres atributos del objeto.
 */
// Código de Student.java.
// Completa el código.
public class Student {
    private String name;
    private int studentNumber;
    private String course;

    // Constructor número 1.
    // No es necesario agregar nada aquí.
    public Student() {
    }

    /*
     * public Student(int sN, String c) {
     * studentNumber = sN;
     * course = c;
     * }
     */

    // Constructor número 2.
    // Debes proporcionar el cuerpo de este constructor.
    public Student(String name, int studentNumber,
            String course) {
        // Completa el cuerpo de este constructor.
        this.name = name;
        this.studentNumber = studentNumber;
        this.course = course;
    }

    // Agrega aquí los métodos de modificación (setters).

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;

    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Agrega aquí los métodos de consulta (getters).

    public String getName() {
        return name;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    public String getCourse() {
        return course;
    }

    public void showStudentInformation() {

        // Este método debe mostrar el nombre,
        // el número de estudiante y el curso
        // del objeto Student.

        System.out.println("Nombre: " + this.name + " Número de estudiante: "  + this.studentNumber + " curso " + this.course + " Objeto: " + this );
    }
}