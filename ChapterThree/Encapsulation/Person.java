package chapterthree.encapsulation;

// Person.java
public class Person {

    private String name;
    private int age;

    // Setters
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        if (a >= 0) {
            age = a;
        } else {
            age = 0;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
