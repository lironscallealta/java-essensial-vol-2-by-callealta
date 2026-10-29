package english.chapterfour.codingtask.doing.codingtaskone;

public class Student extends Object {

    protected String name;
    protected int studentId;
    protected String course;

    public Student(String name, int studentId, String course) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", studentId=" + studentId + ", course=" + course + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + studentId;
        result = prime * result + ((course == null) ? 0 : course.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (studentId != other.studentId)
            return false;
        if (course == null) {
            if (other.course != null)
                return false;
        } else if (!course.equals(other.course))
            return false;
        return true;
    }



}