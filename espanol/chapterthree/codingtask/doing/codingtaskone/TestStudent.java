package espanol.chapterthree.codingtask.doing.codingtaskone;

// Código de TestStudent.java.
// Completa el código.
public class TestStudent {
    public static void main(String args[]) {

        Student s1 = new Student("Lawrence", 1111,
                "Licenciatura en Ciencias de la Computación");
        Student s2 = new Student();
        Student s3 = new Student();

        // Asigna las propiedades del estudiante s2:
        // nombre, studentNumber y course.
        s2.setName("Nombre cualquiera");
        s2.setStudentNumber(1545);
        s2.setCourse("B3 Informática");

        // Asigna las propiedades del estudiante s3:
        // nombre, studentNumber y course.
        s3.setName("Peditus");
        s3.setStudentNumber(4545);
        s3.setCourse("Deportes");

        // Muestra la información del estudiante s1.
        System.out.println("ID: " + s1.getStudentNumber());
        s1.showStudentInformation();

        // Muestra la información del estudiante s2
        // llamando a los métodos de consulta.
        System.out.println(
                "nombre " + s2.getName() + " identificador del estudiante: " + s2.getStudentNumber() + " Curso: " + s2.getCourse() + " Objeto " + s2);

        // Muestra la información del estudiante s3
        // llamando a showStudentInformation().
        s3.showStudentInformation();
    }
}