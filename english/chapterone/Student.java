package english.chapterone;
public class Student {

    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student() {
       
    }

    public void printDetails() {
        System.out.printf("tu nombre es %s y tienes %d tu grado es %.2f%n", name, age, grade);   
    }

}
