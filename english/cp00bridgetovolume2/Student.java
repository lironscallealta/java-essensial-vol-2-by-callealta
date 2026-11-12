package english.cp00bridgetovolume2;
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
        System.out.printf("Your name is %s, you are %d years old, and your grade is %.2f%n", name, age, grade);
    }

}
