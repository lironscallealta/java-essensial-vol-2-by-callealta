package english.cp05polymorphism.codingtask.doing.codingtaskone;

public class Student {
    private String name;
    private String course;
    private float tuitionFee;
    private int studentNumber = 1009;
    private static int counter = 0;

    public Student(String name, String course, float tuitionFee) {
        this.name = name;
        this.course = course;
        this.tuitionFee = tuitionFee;
        ++counter;
        studentNumber += counter;

    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public float getTuitionFee() {
        return tuitionFee;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nCourse: %s%nTuittion Fee %.2f%nStudent Number: %d%nAmount of Students: %d",
                name, course,
                tuitionFee, studentNumber, counter);
    }
}

/*
 * public void setName(String name) {
 * this.name = name;
 * }
 * 
 * public void setCourse(String course) {
 * this.course = course;
 * }
 * 
 * public void setTuitionFee(float tuitionFee) {
 * this.tuitionFee = tuitionFee;
 * }
 * 
 * public void setStudentNumber(int studentNumber) {
 * this.studentNumber = studentNumber;
 * }
 * 
 * public void setCounter(int counter) {
 * this.counter = counter;
 * }
 */
