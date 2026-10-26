package ChapterThree.CodingTask.CodingTaskOne;

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

        // set the properties of Student s3,
        // assign a name, studentNumber and course

        // print the identity of Student s1
        s1.showStudentInformation();

        // print the identity of Student s2 by
        // calling the getter methods

        // print the identity of Student s3 by
        // calling the showStudentInformation() method
    }
}