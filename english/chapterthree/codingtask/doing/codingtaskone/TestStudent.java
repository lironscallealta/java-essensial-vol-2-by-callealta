package english.chapterthree.codingtask.doing.codingtaskone;

// This is the code for TestStudent.java -
// complete the code.
public class TestStudent {
    public static void main(String args[]) {

        Student s1 = new Student("Lawrence", 1111,
                "BS Computer Science");
        Student s2 = new Student();
        Student s3 = new Student();

        // set the properties of Student s2,
        // assign a name, studentNumber and course
        s2.setName("AnyName");
        s2.setStudentNumber(1545);
        s2.setCourse("B3 Computing");

        // set the properties of Student s3,
        // assign a name, studentNumber and course
        s3.setName("Peditus");
        s3.setStudentNumber(4545);
        s3.setCourse("Sports");

        // print the identity of Student s1
        System.out.println("ID: " + s1.getStudentNumber());
        s1.showStudentInformation();

        // print the identity of Student s2 by
        // calling the getter methods
        System.out.println(
                "name " + s2.getName() + " id Student: " + s2.getStudentNumber() + " Course: " + s2.getCourse() + " Object " + s2);

        // print the identity of Student s3 by
        // calling the showStudentInformation() method
        s3.showStudentInformation();
    }
}